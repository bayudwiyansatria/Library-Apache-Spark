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

package com.bayudwiyansatria.apache.spark;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;
import org.apache.spark.storage.StorageLevel;


public class SparkIO {
    public JavaRDD<String> readData_String(JavaSparkContext SparkContext, String FileName){
        return readData_String ( SparkContext, FileName, StorageLevel.MEMORY_ONLY () );
    }
    
    public JavaRDD<String> readData_String(JavaSparkContext SparkContext,String FileName, int Partitioning){
        return readData_String ( SparkContext, FileName, Partitioning, StorageLevel.MEMORY_ONLY () );
    }
    
    public JavaRDD<String> readData_String(JavaSparkContext SparkContext,String FileName, StorageLevel StorageLevel){
        //Partitioning = DataSize (Mb) / HadoopFileSystem (BlockSize);
        return readData_String (SparkContext, FileName, 1, StorageLevel);
    }
    
    public JavaRDD<String> readData_String(JavaSparkContext SparkContext, String FileName, int Partitioning, StorageLevel StorageLevel){
        //Partitioning = DataSize (Mb) / HadoopFileSystem (BlockSize);
        return SparkContext.textFile ( FileName, Partitioning ).persist ( StorageLevel );
    }
    
    public JavaRDD<String> readData_String(JavaSparkContext SparkContext, String FileName, int Partitioning, StorageLevel StorageLevel, String Separator){
        if(",".equals ( Separator )) {
            return readData_CSV ( SparkContext, FileName, Partitioning, StorageLevel );
        }
        return readData_String (SparkContext, FileName, Partitioning , StorageLevel);
    }
    
    public JavaRDD<String> readData_CSV(JavaSparkContext SparkContext, String FileName){
        return readData_String ( SparkContext, FileName , 1, StorageLevel.MEMORY_ONLY () );
    }
    
    public JavaRDD<String> readData_CSV(JavaSparkContext SparkContext, String FileName, int Partitioning){
        //partioning = DataSize (Mb) / HDFS (BlockSize);
        return readData_String ( SparkContext, FileName , Partitioning, StorageLevel.MEMORY_ONLY () );
    }
    
    public JavaRDD<String> readData_CSV(JavaSparkContext SparkContext, String FileName, StorageLevel StorageLevel){
        //partioning = DataSize (Mb) / HDFS (BlockSize);
        return readData_String ( SparkContext, FileName , 1, StorageLevel );
    }
    
    public JavaRDD<String> readData_CSV(JavaSparkContext SparkContext, String FileName, int Partitioning, StorageLevel StorageLevel){
        //partioning = DataSize (Mb) / HDFS (BlockSize);
        return readData_String ( SparkContext, FileName , Partitioning, StorageLevel );
    }
    
    public JavaRDD<Vector> readData_Vector(JavaRDD<String> data){
        return data.map(mapping -> {
            String[] array = mapping.split(",");
            double[] values = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                values[i] = Double.parseDouble(array[i]);
            }
            return Vectors.dense(values);
        });
    }
    
    public JavaRDD<Vector> readData_Vector(JavaSparkContext SparkContext, String FileName){
        return readData_Vector( readData_String ( SparkContext, FileName ));
    }
    
    public JavaRDD<Vector> readData_Vector(JavaSparkContext SparkContext, String FileName, int Partitioning){
        return readData_Vector( readData_String ( SparkContext, FileName, Partitioning));
    }
    
    public JavaRDD<Vector> readData_Vector(JavaSparkContext SparkContext, String FileName, StorageLevel StorageLevel){
        return readData_Vector( readData_String ( SparkContext, FileName, StorageLevel));
    }
    
    public JavaRDD<Vector> readData_Vector(JavaSparkContext SparkContext, String FileName, int Partitioning, StorageLevel StorageLevel){
        return readData_Vector( readData_String ( SparkContext, FileName, Partitioning, StorageLevel));
    }
    
    public JavaRDD<Vector> readData_Vector(JavaSparkContext SparkContext, String FileName, String Separator, int Partitioning, StorageLevel StorageLevel) {
        if(",".equals ( Separator )){
            return readData_Vector ( readData_CSV ( SparkContext, FileName, Partitioning, StorageLevel ) );
        }
        return readData_Vector ( readData_String ( SparkContext, FileName, Partitioning, StorageLevel, Separator) );
    }
}
