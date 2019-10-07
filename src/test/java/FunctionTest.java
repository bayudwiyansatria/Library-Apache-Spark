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

import com.bayudwiyansatria.environment.apache.spark.SparkClustering;
import com.bayudwiyansatria.environment.apache.spark.SparkIO;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.clustering.BisectingKMeansModel;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;
import org.apache.spark.rdd.RDD;

import java.util.List;

public class FunctionTest {
	public static void main(String[] args){
		String dataSource = "src/main/resources/bigdata.csv";

		JavaRDD<String> dataDouble = new SparkIO().readData(dataSource);
		JavaRDD<Vector> vectorData = new SparkIO().readData(dataDouble);
		double[][] data = new com.bayudwiyansatria.environment.apache.spark.SparkUtils().javaRDD_to_double(dataDouble);
        double[][] matrixDistance = new double[data.length - 1][];
        
        int[] cluster = new SparkClustering().BisectingKMeans(vectorData, 4);
        new com.bayudwiyansatria.mat.Mat().print(cluster);
	}
}
