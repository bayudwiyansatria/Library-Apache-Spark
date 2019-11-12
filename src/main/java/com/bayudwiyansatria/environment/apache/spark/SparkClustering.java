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
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bayudwiyansatria.environment.apache.spark;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.clustering.BisectingKMeansModel;
import org.apache.spark.mllib.linalg.Vector;

public class SparkClustering {

	public int[] BisectingKMeans(JavaRDD<Vector> data, int NumberOfCluster){
        org.apache.spark.mllib.clustering.BisectingKMeans bkm = new org.apache.spark.mllib.clustering.BisectingKMeans().setK ( NumberOfCluster );
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
    
    public int[] BisectingKMeans(JavaRDD<Vector> data){
        org.apache.spark.mllib.clustering.BisectingKMeans bkm = new org.apache.spark.mllib.clustering.BisectingKMeans();
        BisectingKMeansModel model = bkm.run(data);
        Object[] predict = model.predict ( data ).cache ( ).collect ( ).toArray ( );
        int[] cluster = new int[predict.length];
        for(int i=0; i<predict.length; i++) {
            cluster[i] = (int) predict[i];
        }
        return cluster;
    }
    
    public int getOptimalK(JavaRDD<Vector> data){
        org.apache.spark.mllib.clustering.BisectingKMeans bkm = new org.apache.spark.mllib.clustering.BisectingKMeans();
        BisectingKMeansModel model = bkm.run(data);
        return model.k ();
    }
    
    public int[] AutomaticBisectingKMeans(JavaRDD<Vector> data){
        org.apache.spark.mllib.clustering.BisectingKMeans bkm = new org.apache.spark.mllib.clustering.BisectingKMeans().setK ( this.getOptimalK ( data ) );
        BisectingKMeansModel model = bkm.run(data);
        JavaRDD<Integer> predict = model.predict(data);
        Object[] classLabel = predict.collect().toArray();
        int[] cluster = new int[classLabel.length];
        for(int i=0; i<classLabel.length; i++) {
            cluster[i] = (int) classLabel[i];
        }
        return cluster;
        
    }

    public Vector[] getCentroid(BisectingKMeansModel model){
        Vector[] clusterCenters = model.clusterCenters();
        for (int i = 0; i < clusterCenters.length; i++) {
            System.out.println("Cluster Center " + i + ": " + clusterCenters[i]);
        }
        return clusterCenters;
    }
}
