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

package com.bayudwiyansatria.environment.apache.spark;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.clustering.BisectingKMeansModel;
import org.apache.spark.mllib.linalg.Vector;

public class SparkClustering extends SparkMatrix {

    public int[] AutomaticSingleLinkage(JavaRDD<String> data, int Interval){
        double[][] newData = new SparkUtils().rdd_to_double(data);
        System.out.println(new Spark().getSparkMaster());
        return new com.bayudwiyansatria.ml.clustering.AutomaticClustering().SingleLinkage(newData,10);
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

    public int[] BisectingKMeans(double[][] data, int NumberOfClusters){
        return BisectingKMeans(new SparkIO().readData(new SparkIO().readData(data)), NumberOfClusters);
    }

    public int[] BisectingKMeans(int[][] data, int NumberOfClusters){
        return BisectingKMeans(new SparkIO().readData(new SparkIO().readData(data)), NumberOfClusters);
    }

    public int[] BisectingKMeans(String[][] data, int NumberOfClusters){
        return BisectingKMeans(new SparkIO().readData(new SparkIO().readData(data)), NumberOfClusters);
    }

    public Vector[] getCentroid(JavaRDD<Vector> data){
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
