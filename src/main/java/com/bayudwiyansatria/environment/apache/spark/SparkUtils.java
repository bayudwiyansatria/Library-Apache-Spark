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
import java.util.List;

class SparkUtils extends Spark {
    public double[][] rdd_to_double(JavaRDD<String> data){
        List<String> newData = data.collect();
        double[][] doubleData = new double[newData.size()][newData.get(0).split(",").length];
        for(int i=0; i<newData.size(); i++){
            String[] array = newData.get(i).split(",");
            for (int j = 0; j < array.length; j++) {
                doubleData[i][j] = Double.parseDouble(array[j]);
            }
        }
        return doubleData;
    }

    public int[][] rdd_to_int(JavaRDD<String> data){
        return new com.bayudwiyansatria.utils.Utils().double_to_int(this.rdd_to_double(data));
    }

    public String[] ParseSparkArguments(String[] Argument){
        String SparkMaster = Argument[1];
        if(SparkMaster.equals("yarn")){
            this.setDeployMode("cluster");
        } else if(SparkMaster.contains("local")){
            setDeployMode("client");
        } else {
            setDeployMode(getDeployMode());
        }

        setSparkConfiguration();
        return getSparkConfiguration();
    }

    public void SparkOptimizeConfiguration(){
        setExecutorMemory("4g");
        setDriverMemory("1g");
        setExecutorCores("5");
        setDriverCores("1");
        setNumExecutors("3");
    }
}
