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


class SparkUtils extends Spark {
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
