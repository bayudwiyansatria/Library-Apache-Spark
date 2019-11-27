package com.bayudwiyansatria.environment.apache.spark;

import org.apache.spark.api.java.JavaRDD;
import org.junit.Test;

import static org.junit.Assert.*;

public class SparkTest {
	
	@Test
	public void Spark(){
		JavaRDD<String> data = new SparkIO ().readData_String ( new Spark ().getSparkContext (), "src/main/resources/ruspini.csv" );
		
	}
	
	@Test
	public void Spark_ConvertRDD() {
		JavaRDD<String> data = new SparkIO ().readData_String ( new Spark ().getSparkContext (), "src/main/resources/ruspini.csv" );
        double[][] newData = new SparkUtils().rdd_to_double (data);
        new com.bayudwiyansatria.mat.Mat ().print ( newData );
	}
	
}