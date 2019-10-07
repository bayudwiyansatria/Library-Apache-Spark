/*
 * MIT License
 *
 * Copyright (c) 2019 Bayu Dwiyan Satria
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import com.bayudwiyansatria.environment.apache.spark.SparkIO;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.clustering.BisectingKMeansModel;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;

public class DistanceMeasureTest {
	public static void main(String[] args){
		double[][] data= new com.bayudwiyansatria.io.IO().readCSV_double("src/main/resources/bigdata");
		int Interval = 10;
        double[][] distanceMetric = new com.bayudwiyansatria.mat.Mat().getDistanceMetric(data);
        int[] clusters = new int[data.length];
        double[][] newData = new com.bayudwiyansatria.mat.Mat().copyArray(data);
        int length = data.length;

        int NumberOfCluster = 2;
        int interval = Interval;
        double[] V = new com.bayudwiyansatria.mat.Mat().initArray(Interval + 1, 0.0);
        double[] density = new com.bayudwiyansatria.mat.Mat().initArray(Interval + 1, 0.0);
        double[] variance;
        double[] output = new double[2];
        int[][] clusterTable = new int[Interval + 2][data.length];


        for(int i = 0; i < data.length; i++) {
            clusters[i] = i;
        }

        do {
            int x = 1;
            int y = 0;
            double distance = distanceMetric[x - 1][y];

            for(int i = 0; i < data.length - 1; ++i) {
                for(int j = 0; j <= i; ++j) {
                    if (distance < 0.0 || distanceMetric[i][j] < distance && distanceMetric[i][j] > -1.0) {
                        distance = distanceMetric[i][j];
                        x = i + 1;
                        y = j;
                    }
                }
            }

            int left;
            int right;
            if (clusters[x] < clusters[y]) {
                left = clusters[y];
                right = clusters[x];
            } else {
                left = clusters[x];
                right = clusters[y];
            }

            int[] position = new com.bayudwiyansatria.utils.Utils().getFind(clusters, "=", left);

            for (int value : position) {
                clusters[value] = right;
            }

            clusters = new com.bayudwiyansatria.ml.ML().getNormalLabel(clusters);
            position = new com.bayudwiyansatria.utils.Utils().getFind(clusters, "=", right);
            --length;

            for(int i = 0; i < position.length - 1; ++i) {
                for(int j = i + 1; j < position.length; ++j) {
                    if (position[i] > position[j]) {
                        distanceMetric[position[i] - 1][position[j]] = -1.0;
                    } else {
                        distanceMetric[position[j] - 1][position[i]] = -1.0;
                    }
                }
            }

            int[][] member = new int[length][];
            int[] nMember = new int[length];
            double[][] centroid = new double[length][data[0].length];
            System.arraycopy(newData, 0, centroid, 0, right);

            for(int i = 0; i < length; ++i) {
                member[i] = new com.bayudwiyansatria.utils.Utils().getFind(clusters, "=", i);
                nMember[i] = member[i].length;
            }

            double[][] tmp = new double[nMember[right]][];

            for(int i = 0; i < nMember[right]; ++i) {
                tmp[i] = data[member[right][i]];
            }

            centroid[right] = new com.bayudwiyansatria.ml.ML().getCentroid(tmp);
            System.arraycopy(newData, right + 1, centroid, right + 1, left - right - 1);
            System.arraycopy(newData, left + 1, centroid, left, length - left);
            newData = centroid;
            x = right;

            for(y = 0; y < length; ++y) {
                if (x != y) {
                    double DistanceBetweenCentroid = new com.bayudwiyansatria.mat.Mat().getDistance_Relative(newData[x], newData[y]);

                    for(int i = 0; i < nMember[x]; ++i) {
                        for(int j = 0; j < nMember[y]; ++j) {
                            if (member[x][i] > member[y][j]) {
                                distanceMetric[member[x][i] - 1][member[y][j]] = DistanceBetweenCentroid;
                            } else {
                                distanceMetric[member[y][j] - 1][member[x][i]] = DistanceBetweenCentroid;
                            }
                        }
                    }
                }
            }

            if (length <= Interval + 1) {
                variance = new com.bayudwiyansatria.ml.ML().getVariance(data, clusters);
                V[interval] = variance[0] / variance[1];
                clusterTable[interval + 1] = new com.bayudwiyansatria.mat.Mat().copyArray(clusters);
                --interval;
            }
        } while (length > NumberOfCluster);

        // Identify Global Optimum
        for(int i = Interval - 1; i > 0; --i) {
            if (V[i - 1] >= V[i] && V[i + 1] > V[i]) {
                density[i] = V[i + 1] + V[i - 1] - 2.0 * V[i];
            }
        }

        variance = new com.bayudwiyansatria.math.Math().getMax(density);
        int optimum = (int) variance[1] + 1;
        density[optimum - 1] = -1.0;
        double globalOptimum;
        if (variance[0] == 0.0) {
            globalOptimum = 0.0;
        } else {
            globalOptimum = variance[0] / variance[0];
        }

        output[0] = optimum;
        output[1] = globalOptimum;
        new com.bayudwiyansatria.mat.Mat().print(clusterTable[optimum]);
	}


	public double getDistanceAbsolute(double[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            distance += difference * difference;
        }
        return Math.sqrt(distance);
    }

	public static Vector[] getCentroid(JavaRDD<Vector> data){
        int NumberOfClusters = 2;
        org.apache.spark.mllib.clustering.BisectingKMeans bkm = new org.apache.spark.mllib.clustering.BisectingKMeans().setK(NumberOfClusters);
        BisectingKMeansModel model = bkm.run(data);
        Vector[] clusterCenters = model.clusterCenters();
        for (int i = 0; i < clusterCenters.length; i++) {
            System.out.println("Cluster Center " + i + ": " + clusterCenters[i]);
        }
        return clusterCenters;
    }
}
