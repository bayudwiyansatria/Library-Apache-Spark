/*
 * Copyright (c) 2019 Bayu Dwiyan Satria. All Rights Reserved.
 */

package com.bayudwiyansatria.environment.apache;

class SparkConfiguration extends SparkProperties {

    /* Main Configuration */
    private String SPARK_MASTER_HOST = null;
    private String SPARK_MASTER_PORT = null;
    private String SPARK_DEPLOY_MODE = null;
    private String SPARK_EXECUTOR_MEMORY = null;
    private String SPARK_EXECUTOR_CORES = null;
    private String SPARK_TOTAL_CORES = null;
    private String SPARK_PROPERTIES_FILE = null;
    private String SPARK_DRIVER_MEMORY = null;
    private String SPARK_DRIVER_CORES = null;
    private String SPARK_DRIVER_EXTRA_CLASS_PATH = null;
    private String SPARK_DRIVER_EXTRA_LIBRARY_PATH = null;
    private String SPARK_DRIVER_EXTRA_JAVA_OPTIONS = null;
    private String SPARK_QUEUE = null;
    private String SPARK_NUMBER_EXECUTORS = null;
    private String SPARK_FILES = null;
    private String SPARK_PY_FILES = null;
    private String SPARK_ARCHIVES = null;
    private String SPARK_MAIN_CLASS = null;
    private String SPARK_PRIMARY_RESOURCES = null;
    private String SPARK_APPLICATION_NAME = null;
    private String SPARK_JARS = null;
    private String SPARK_PACKAGES = null;
    private String SPARK_PACKAGES_EXCLUSION = null;
    private String SPARK_REPOSITORIES = null;
    private boolean SPARK_VERBOSE = false;
    private boolean SPARK_SUPERVISE = false;

    /* ========================================= Spark Require Argument START ================================================ */

    public void setSparkMasterHost(String SparkHost){
        this.SPARK_MASTER_HOST = SparkHost.toLowerCase();
    }

    public String getSparkMasterHost(){
         if(SPARK_MASTER_HOST == null){
            setSparkMasterHost("local[*]");
        }
        return SPARK_MASTER_HOST;
    }

    public void setSparkMasterPort(String SparkPort){
        this.SPARK_MASTER_PORT = SparkPort;
    }

    public String getSparkMasterPort(){
        if(SPARK_MASTER_PORT == null){
            setSparkMasterPort("7077");
        }
        return SPARK_MASTER_PORT;
    }

    public void setDeployMode(String DeployMode) {
        this.SPARK_DEPLOY_MODE = DeployMode;
        setSparkSubmitDeployMode(DeployMode);
    }

    public String getDeployMode() {
        if(SPARK_DEPLOY_MODE == null){
            setDeployMode("cluster");
        }
        return SPARK_DEPLOY_MODE;
    }

    public void setMainClass(String MainClass){
        this.SPARK_MAIN_CLASS = MainClass;
    }

    public String getMainClass(){
        if(SPARK_MAIN_CLASS == null){
            setMainClass("Library");
        }
        return SPARK_MAIN_CLASS;
    }

    public void setPrimaryResource(String PrimaryResources){
        this.SPARK_PRIMARY_RESOURCES = PrimaryResources;
    }

    public String getPrimaryResource(){
        if(SPARK_PRIMARY_RESOURCES == null){
            setPrimaryResource("target/ACPL.jar");
        }
        return SPARK_PRIMARY_RESOURCES;
    }

    public void setAppName(String AppName){
        this.SPARK_APPLICATION_NAME = AppName;
        setSparkAppName(AppName);
    }

    public String getAppName(){
        if(SPARK_APPLICATION_NAME == null){
            setAppName("Automatic Clustering Parallel Library");
        }
        return SPARK_APPLICATION_NAME;
    }

    /* ========================================= SET SPARK PROPERTIES START ========================================= */

    public void setExecutorMemory(String ExecutorMemory){
        this.SPARK_EXECUTOR_MEMORY = ExecutorMemory;
        setSparkExecutorMemory(ExecutorMemory);
    }

    public void setExecutorCores(String ExecutorCores){
        this.SPARK_EXECUTOR_CORES = ExecutorCores;
    }

    public void setTotalCores(String TotalCores){
        this.SPARK_TOTAL_CORES = TotalCores;
    }

    public void setPropertiesFile(String PropertiesFile){
        this.SPARK_PROPERTIES_FILE = PropertiesFile;
    }

    public void setDriverMemory(String DriverMemory){
        this.SPARK_DRIVER_MEMORY = DriverMemory;
        setSparkDriverMemory(DriverMemory);
    }

    public void setDriverCores(String DriverCores){
        this.SPARK_DRIVER_CORES = DriverCores;
        setSparkDriverCores(DriverCores);
    }

    public void setDriverExtraClassPath(String DriverExtraClassPath){
        this.SPARK_DRIVER_EXTRA_CLASS_PATH = DriverExtraClassPath;
    }

    public void setDriverExtraLibraryPath(String DriverExtraLibraryPath){
        this.SPARK_DRIVER_EXTRA_LIBRARY_PATH = DriverExtraLibraryPath;
    }

    public void setDriverExtraJavaOptions(String DriverExtraJavaOption){
        this.SPARK_DRIVER_EXTRA_JAVA_OPTIONS = DriverExtraJavaOption;
        setSparkDriverExtraJavaOptions(DriverExtraJavaOption);
    }

    public void setSupervise(boolean SuperviseMode){
        this.SPARK_SUPERVISE = SuperviseMode;
        setSparkDriverSupervise(Boolean.toString(SuperviseMode));
    }

    public void setQueue(String Queue){
        this.SPARK_QUEUE = Queue;
    }

    public void setNumExecutors(String NumberOfExecutor){
        this.SPARK_NUMBER_EXECUTORS = NumberOfExecutor;
    }

    public void setFiles(String Files){
        this.SPARK_FILES = Files;
    }

    public void setPyFiles(String PyFiles){
        this.SPARK_PY_FILES = PyFiles;
    }

    public void setArchives(String Archives){
        this.SPARK_ARCHIVES = Archives;
    }

    public void setJars(String Jars){
        this.SPARK_JARS = Jars;
    }

    public void setPackages(String Packages){
        this.SPARK_PACKAGES = Packages;
    }

    public void setPackagesExclusions(String PackagesExclusions){
        this.SPARK_PACKAGES_EXCLUSION = PackagesExclusions;
    }

    public void setRepositories(String Repositories){
        this.SPARK_REPOSITORIES = Repositories;
    }

    public void setVerbose(boolean Verbose){
        this.SPARK_VERBOSE = Verbose;
    }

    /* ========================================= SET SPARK PROPERTIES END ========================================= */

    /* ========================================= GET SPARK PROPERTIES START ==========================================*/

    public String getExecutorMemory(){
        return SPARK_EXECUTOR_MEMORY;
    }

    public String getExecutorCores(){
        return SPARK_EXECUTOR_CORES;
    }

    public String getTotalCores(){
        return SPARK_TOTAL_CORES;
    }

    public String getPropertiesFile(){
        return SPARK_PROPERTIES_FILE;
    }

    public String getDriverMemory(){
        return SPARK_DRIVER_MEMORY;
    }

    public String getDriverCores(){
        return SPARK_DRIVER_CORES;
    }

    public String getDriverExtraClassPath(){
        return SPARK_DRIVER_EXTRA_CLASS_PATH;
    }

    public String getDriverExtraLibraryPath(){
        return SPARK_DRIVER_EXTRA_LIBRARY_PATH;
    }

    public String getDriverExtraJavaOptions(){
        return SPARK_DRIVER_EXTRA_JAVA_OPTIONS;
    }

    public boolean getSupervise(){
        return SPARK_SUPERVISE;
    }

    public String getQueue(){
        return SPARK_QUEUE;
    }

    public String getNumExecutors(){
        return SPARK_NUMBER_EXECUTORS;
    }

    public String getFiles(){
        return SPARK_FILES;
    }

    public String getPyFiles(){
        return SPARK_PY_FILES;
    }

    public String getArchives(){
        return SPARK_ARCHIVES;
    }


    public String getJars(){
        return SPARK_JARS;
    }

    public String getPackages(){
        return SPARK_PACKAGES;
    }

    public String getPackagesExclusions(){
        return  SPARK_PACKAGES_EXCLUSION;
    }

    public String getRepositories(){
        return SPARK_REPOSITORIES;
    }

    public boolean getVerbose(){
        return SPARK_VERBOSE;
    }

    /* ========================================= GET SPARK PROPERTIES END ==========================================*/
}