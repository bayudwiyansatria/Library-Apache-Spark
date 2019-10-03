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

package com.bayudwiyansatria.environment.apache.spark.clustering;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.clustering.BisectingKMeansModel;
import org.apache.spark.mllib.linalg.Vector;

public class SparkClustering {
    public int getOptimalNumberOfCluster(){

        return 1;
    }

	public int[] BisectingKMeans(JavaRDD<Vector> data, int NumberOfClusters){
        org.apache.spark.mllib.clustering.BisectingKMeans bkm = new org.apache.spark.mllib.clustering.BisectingKMeans().setK(NumberOfClusters);
        BisectingKMeansModel model = bkm.run(data);
        Vector[] clusterCenters = model.clusterCenters();
        for (int i = 0; i < clusterCenters.length; i++) {
            System.out.println("Cluster Center " + i + ": " + clusterCenters[i]);
        }
        JavaRDD<Integer> predict = model.predict(data);
        //predict.foreach(rdd ->System.out.println(rdd.intValue()));
        Object[] classLabel = predict.collect().toArray();
        int[] cluster = new int[classLabel.length];
        for(int i=0; i<classLabel.length; i++) {
            cluster[i] = (int) classLabel[i];
        }
        return cluster;
    }

    public int[] AutomaticBisectingKMeans(JavaRDD<Vector> data, int Interval){
        double[][] distanceMetric = new com.bayudwiyansatria.mat.Vector().getDistanceMetric(data);
        int[] clusters = new int[data.length];
        int length = data.length;

        int NumberOfCluster = 2;
        int interval = Interval;
        double[] variance;
        double[] V = new com.bayudwiyansatria.mat.Mat().initArray(Interval + 1, 0.0);
        double[] density = new com.bayudwiyansatria.mat.Mat().initArray(Interval + 1, 0.0);
        double[] output = new double[2];
        int[][] clusterTable = new int[Interval + 2][data.length];

        for(int i = 0; i < data.length; i++) {
            clusters[i] = i;
        }
    }
}
