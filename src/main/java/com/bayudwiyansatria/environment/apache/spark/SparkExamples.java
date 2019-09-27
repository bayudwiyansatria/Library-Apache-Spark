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
