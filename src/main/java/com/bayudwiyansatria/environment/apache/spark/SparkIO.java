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
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparkIO {
    public JavaRDD<Vector> readData(String filename){
        JavaSparkContext sparkContext = new Spark().SparkContext();
        JavaRDD<String> readData = sparkContext.textFile(filename);
        JavaRDD<Vector> data = readData.map(mapping -> {
            String[] array = mapping.split(",");
            double[] values = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                values[i] = Double.parseDouble(array[i]);
            }
            return Vectors.dense(values);
        });
        data.cache();
        //data.rdd();
        return data;
    }

    public JavaRDD<Vector> readData(JavaSparkContext SparkContext, String filename){
        //partioning = DataSize (Mb) / HDFS (BlockSize);
        JavaRDD<String> inputFile = SparkContext.textFile(filename,6).cache();

        JavaRDD<Vector> data = inputFile.map(mapping -> {

            String[] array = mapping.split(",");

            double[] values = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                values[i] = Double.parseDouble(array[i]);
            }
            return Vectors.dense(values);

        });
        return data.cache();
    }

    public JavaRDD<Vector> readData(String[][] data){
        List<List<String>> newData = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            List<String> eachRecord = Arrays.asList(data[i]);
            newData.add(eachRecord);
        }

        JavaSparkContext sparkContext = new Spark().SparkContext();
        JavaRDD<String> readData = sparkContext.textFile(String.valueOf(newData));
        JavaRDD<Vector> VectorData = readData.map(mapping -> {
            String[] array = mapping.split(",");
            double[] values = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                values[i] = Double.parseDouble(array[i]);
            }
            return Vectors.dense(values);
        });
        VectorData.cache();
        //data.rdd();
        return VectorData;
    }


    public JavaRDD<Vector> readData(int[][] data){

        List<List<int[]>> newData = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            List<int[]> eachRecord = Arrays.asList(data[i]);
            newData.add(eachRecord);
        }

        JavaSparkContext sparkContext = new Spark().SparkContext();
        JavaRDD<String> readData = sparkContext.textFile(String.valueOf(newData));
        JavaRDD<Vector> VectorData = readData.map(mapping -> {
            String[] array = mapping.split(",");
            double[] values = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                values[i] = Double.parseDouble(array[i]);
            }
            return Vectors.dense(values);
        });
        VectorData.cache();
        //data.rdd();
        return VectorData;
    }


    public JavaRDD<Vector> readData_Reducer(String filename){
        JavaRDD<Vector> data = null;
        return data;

    }

    /*
    public String[][] readData(List<Vector> data){
        String[][] StringData = {};
        JavaRDD<Vector> vectorJavaRDD = new Spark().SparkContext().parallelize(data, 2);
        new IO().print(String.valueOf(vectorJavaRDD));
        return StringData;
    }

     */

}
