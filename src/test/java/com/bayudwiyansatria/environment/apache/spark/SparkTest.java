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

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.junit.Test;

import static org.junit.Assert.*;

public class SparkTest {
	public static final Spark spark = new Spark();
	public static final String ApplicationName = "Spark Test";
	public static final String ClusterMaster = "devops.bayudwiyansatria.com";
	public static final String SparkPort = "7077";
	public static final String MainClass = "com.bayudwiyansatria.environment.apache.spark.Spark";
	public static final String DeployMode = "cluster";
	
	@Test
	public void Spark(){
		Logger.getLogger ( "org" ).setLevel ( Level.ERROR );
		spark.setAppName ( ApplicationName );
		spark.setDeployMode ( DeployMode );
		spark.setSparkMasterHost ( ClusterMaster );
		spark.setSparkMasterPort ( SparkPort );
		spark.setMainClass ( MainClass );
		spark.setSparkConfiguration ();
		new com.bayudwiyansatria.mat.Mat ().print ( spark.getSparkConfiguration () );
	}
	
	@Test
	public void Spark_ConvertRDD() {
		Logger.getLogger ( "org" ).setLevel ( Level.ERROR );
		JavaRDD<String> data = new SparkIO ().readData_String ( new Spark ().getSparkContext (), "src/main/resources/ruspini.csv" );
        double[][] newData = new SparkUtils().rdd_to_double (data);
        new com.bayudwiyansatria.mat.Mat ().print ( newData );
	}
	
}