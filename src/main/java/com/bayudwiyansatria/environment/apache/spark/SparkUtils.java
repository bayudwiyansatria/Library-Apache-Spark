/*
 * Copyright (c) 2019 Bayu Dwiyan Satria. All Rights Reserved.
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
