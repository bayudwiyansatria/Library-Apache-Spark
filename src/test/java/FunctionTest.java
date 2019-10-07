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

import com.bayudwiyansatria.environment.apache.spark.*;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.clustering.BisectingKMeans;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;

import java.io.Serializable;

public class FunctionTest implements Serializable {
	public static void main(String[] args){
		double Vw;
        double Vb;
        double maxop = 0;
        double secop = 0;
        int maxpost = 0;
        int secpost = 0;

		String dataSource = "hdfs://hdfs.bayudwiyansatria.com:9000/home/bayudwiyansatria/resources/ruspini";
		JavaRDD<String> dataDouble = new SparkIO().readData(dataSource+".csv");
		JavaRDD<Vector> vectorData = new SparkIO().readData(dataDouble);
		double[][] data = new com.bayudwiyansatria.io.IO().readCSV_double("src/main/resources/ruspini");
		 double [] variance = new com.bayudwiyansatria.mat.Mat().initArray(data.length, 0.0);
        double [] globalOptimum = new com.bayudwiyansatria.mat.Mat().initArray(data.length, 0.0);

        //proses mencari variance
        for (int i = 0; i < data.length; i++){
            int[] clusters = new com.bayudwiyansatria.ml.clustering.Clustering().HierarchicalClustering().SingleLinkage(data, i+2);
            double[] V = new com.bayudwiyansatria.ml.ML().getVariance(data, clusters);
            Vw = V[0];
            Vb = V[1];
            variance[data.length-i-1] = (Vw/Vb)*100;
        }

        for (int i = 0; i < data.length;i++) {
	        //proses mencari global optimum
	        if (i <= data.length - 3) {
		        globalOptimum[i] = (variance[i + 2] + variance[i]) - (2 * variance[i + 1]);
	        } else if (i <= data.length - 2) {
		        globalOptimum[i] = (variance[0] + variance[i]) - (2 * variance[i + 1]);
	        } else {
		        globalOptimum[i] = variance[i];
		        //membulatkan negatif menjadi nol
		        if (globalOptimum[i] < 0) {
			        globalOptimum[i] = 0;
		        }
		        //mencari maximum optimal
		        if (globalOptimum[i] > maxop) {
			        secpost = maxpost;
			        maxpost = i;
			        secop = maxop;
			        maxop = globalOptimum[i];
		        }
	        }

	        new com.bayudwiyansatria.mat.Mat().print("Akurasi", maxop / secop);
	        new com.bayudwiyansatria.mat.Mat().print("Cluster Terbaik", maxpost + 1);
	        new com.bayudwiyansatria.mat.Mat().print("Cluster Terbaik Kedua", secpost + 1);
	        //L.setDraw(globalOptimum,true);
	        //libs.ExternalLibs().VectorLib().setDraw(variance,true);
        }
	}
}
