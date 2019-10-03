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

import com.bayudwiyansatria.environment.apache.spark.Spark;
import com.bayudwiyansatria.environment.apache.spark.SparkClustering;
import com.bayudwiyansatria.environment.apache.spark.SparkIO;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.linalg.Vector;

public class SparkExamples {
	public static void main(String[] args){
		System.out.println("##############################################################");
        System.out.println("##       Bayu Dwiyan Satria - Apache Spark Environment      ##");
        System.out.println("##############################################################");
		/*
        Spark spark = new Spark();
        spark.setAppName("Apache Spark Libraries");
        spark.setMainClass("SparkExamples");
        spark.setSparkMasterHost("devops.bayudwiyansatria.com");
        spark.setSparkMasterPort("7077");
        spark.setPrimaryResource("target/env-apache-spark-1.0.jar");
        spark.setSparkConfiguration();

        new com.bayudwiyansatria.mat.Mat().print(spark.getPrimaryResource());
		String[] jars = {spark.getPrimaryResource()};
        String HDFSURI = "hdfs://devops.bayudwiyansatria.com:9000/home/bayudwiyansatria/resources/";
        SparkConf SparkConf = new SparkConf().setAppName(spark.getAppName()).setMaster(spark.getSparkMaster()).setJars(jars);
		JavaSparkContext SparkContext = new JavaSparkContext(SparkConf);
		JavaRDD<String> data = new SparkIO().readData(SparkContext, "src/main/resources/ruspini.csv");

        /* BISECTING KMEANS
		int[] cluster = new SparkClustering().BisectingKMeans(new SparkIO().readData(data),4);
		new com.bayudwiyansatria.mat.Mat().print(cluster);
         */

        //Vector[] centroid = new SparkClustering().getCentroid(new SparkIO().readData(data));
		/*
		long StartTime = System.currentTimeMillis();
		int[] clusters = new SparkClustering().AutomaticSingleLinkage(data, 10);
		long EndTime = System.currentTimeMillis();
		float sec = (EndTime - StartTime) / 1000F; System.out.println(sec + " seconds");
		*/




	}
}
