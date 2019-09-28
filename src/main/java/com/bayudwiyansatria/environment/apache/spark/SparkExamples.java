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

public class SparkExamples {
	public static void main(String[] args){
		System.out.println("##############################################################");
        System.out.println("##       Bayu Dwiyan Satria - Apache Spark Environment      ##");
        System.out.println("##############################################################");

        Spark spark = new Spark();
        spark.setAppName("Spark Environment");
        spark.setMainClass("com.bayudwiyansatria.environment.apache.spark.SparkExamples");
        spark.setSparkMasterHost("devops.bayudwiyansatria.com");
        spark.setSparkMasterPort("7077");
        spark.setPrimaryResource("target/spark-1.0-SNAPSHOT.jar");
        spark.setSparkConfiguration();
		spark.SparkSubmit(spark.getSparkConfiguration());

	}
}
