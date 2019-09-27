/*
 * Copyright (c) 2019 Bayu Dwiyan Satria. All Rights Reserved.
 */

package com.bayudwiyansatria.environment.apache.spark;


import com.bayudwiyansatria.io.IO;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.deploy.SparkSubmit;

public class Spark extends SparkConfiguration {
    protected String[] sparkConfiguration = new String[30];
    protected String[] childArguments = new String[3];

    public void setSparkConfiguration(){
        sparkConfiguration = getSparkArgument();
    }

    public String[] getSparkConfiguration() {
        return new IO().removeNull(sparkConfiguration);
    }

    public void SparkSubmit(String[] argument) {
        SparkSubmit sparkSubmit = new SparkSubmit();
        System.out.println(sparkSubmit.parseArguments(argument));

        sparkSubmit.parseArguments(argument);
        sparkSubmit.doSubmit(argument);
    }

    public JavaSparkContext SparkContext(){
        return new JavaSparkContext(new SparkConf());
    }

    public String getSparkMaster(){
        if( getSparkMasterHost().contains("local")){
            setMaster(getSparkMasterHost());
            return getSparkMasterHost();
        } else if(getSparkMasterHost().contains("yarn")) {
            setMaster(getSparkMasterHost());
            return getSparkMasterHost();
        } else {
            setMaster("spark://" + getSparkMasterHost() + ":" +getSparkMasterPort());
            return "spark://" + getSparkMasterHost() + ":" +getSparkMasterPort();
        }
    }

    public String[] getSparkArgument(){
        String[] Configuration = new String[99];
        int ConfigurationIndex = 0;
        if(getSparkMaster() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--master";
            Configuration[ConfigurationIndex] = getSparkMaster();
            //System.out.println("Spark Master : " + getSparkMaster());
        }

        if(getDeployMode() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--deploy-mode";
            if(getSparkMaster().contains("local")){
                setDeployMode("client");
            }
            Configuration[ConfigurationIndex] = getDeployMode();
            //System.out.println("Deploy Mode : " + getDeployMode());
        }

        if(getMainClass() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--class";
            Configuration[ConfigurationIndex] = getMainClass();
            //System.out.println("Main Class : " + getMainClass() );
        }


        if(getAppName() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--name";
            Configuration[ConfigurationIndex] = getAppName();
            //System.out.println("Application Name : " + getAppName());
        }

        if(getExecutorMemory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--executor-memory";
            Configuration[ConfigurationIndex] = getExecutorMemory();
            //System.out.println("Executor Memory : " + getExecutorMemory());
        }

        if(getExecutorCores() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--executor-cores";
            Configuration[ConfigurationIndex] = getExecutorCores();
            //System.out.println("Executor Cores : " + getExecutorCores());
        }

        if(getTotalCores() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--total-cores";
            Configuration[ConfigurationIndex] = getTotalCores();
            //System.out.println("Total Cores : " + getTotalCores());
        }

        if(getDriverCores() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--driver-cores";
            Configuration[ConfigurationIndex] = getDriverCores();
            //System.out.println("Driver Cores : " + getDriverCores());
        }

        if(getDriverMemory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--driver-memory";
            Configuration[ConfigurationIndex] = getDriverMemory();
            //System.out.println("Driver Memory : " + getDriverMemory());
        }

        if(getNumExecutors() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--num-executors";
            Configuration[ConfigurationIndex] = getNumExecutors();
            //System.out.println("Number of Executor : " + getNumExecutors());
        }

        if(getJars() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--jars";
            Configuration[ConfigurationIndex] = getJars();
            //System.out.println("Jar Application : " + getJars());
        }

        if(getNumExecutors() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--driver-java-options";
            Configuration[ConfigurationIndex] = getDriverExtraJavaOptions();
            //System.out.println("Number of Executor : " + getNumExecutors());
        }

        if(getPackages() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--packages";
            Configuration[ConfigurationIndex] = getPackages();
            //System.out.println("Jar Application : " + getJars());
        }

        if(getRepositories() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--repositories";
            Configuration[ConfigurationIndex] = getRepositories();
            //System.out.println("Jar Application : " + getJars());
        }

        /* =========================================== Application Properties ======================================= */

        if(getSparkAppName() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkAppName();
        }

        if(getSparkDriverCores() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverCores();
        }

        if(getSparkDriverMaxResultSize() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverMaxResultSize();
        }

        if(getSparkDriverMemory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverMemory();
        }

        if(getSparkDriverMemoryOverhead() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverMemoryOverhead();
        }

        if(getSparkExecutorMemory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkExecutorMemory();
        }

        if(getSparkExecutorPySparkMemory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkExecutorPySparkMemory();
        }

        if(getSparkExecutorMemoryOverhead() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkExecutorMemoryOverhead();
        }

        if(getSparkExtraListener() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkExtraListener();
        }

        if(getSparkLocalDirectory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkLocalDirectory();
        }

        if(getSparkLogCOnf() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkLogCOnf();
        }

        if(getMaster() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getMaster();
        }

        if(getSparkSubmitDeployMode() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkSubmitDeployMode();
        }

        if(getSparkLogCallerContext() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkLogCallerContext();
        }

        if(getSparkDriverSupervise() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverSupervise();
        }

        /* =========================================== Application Properties ======================================= */

        /* ===========================================   Runtime Environment  ======================================= */

        if(getSparkDriverExtraClassPath() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverExtraClassPath();
        }

        if(getSparkDriverExtraJavaOptions() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverExtraJavaOptions();
        }

        if(getSparkDriverExtraLibraryPath() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverExtraLibraryPath();
        }

        if(getSparkDriverUserClassPathFirst() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDriverUserClassPathFirst();
        }

        /* ===========================================   Runtime Environment  ======================================= */

        /* ===========================================     Shuffle Behavior   ======================================= */

        if(getSparkReducerMaxSizeInFlight() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkReducerMaxSizeInFlight();
        }

        if(getSparkReducerMaxReqsInFlight() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkReducerMaxReqsInFlight();
        }

        if(getSparkReducerMaxBlocksInFlightPerAddress() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkReducerMaxBlocksInFlightPerAddress();
        }

        if(getSparkMaxRemoteBlockSizeFetchToMem() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkMaxRemoteBlockSizeFetchToMem();
        }

        if(getSparkShuffleCompress() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleCompress();
        }

        if(getSparkShuffleFileBuffer() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleFileBuffer();
        }

        if(getSparkShuffleIOMaxRetries() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleIOMaxRetries();
        }

        if(getSparkShuffleIONumConnectionsPerPeer() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleIONumConnectionsPerPeer();
        }

        if(getSparkShuffleIOPreferDirectBufs() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleIOPreferDirectBufs();
        }

        if(getSparkShuffleIORetryWait() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleIORetryWait();
        }

        if(getSparkShuffleServiceEnabled() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleServiceEnabled();
        }

        if(getSparkShuffleServicePort() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleServicePort();
        }

        if(getSparkShuffleServiceIndexCacheSize() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleServiceIndexCacheSize();
        }

        if(getSparkShuffleMaxChunksBeingTransferred() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleMaxChunksBeingTransferred();
        }

        if(getSparkShuffleSortBypassMergeThreshold() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleSortBypassMergeThreshold();
        }

        if(getSparkShuffleSpillCompress() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleSpillCompress();
        }

        if(getSparkShuffleAccurateBlockThreshold() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleAccurateBlockThreshold();
        }

        if(getSparkShuffleRegistrationTimeout() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleRegistrationTimeout();
        }

        if(getSparkShuffleRegistrationMaxAttempts() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleRegistrationMaxAttempts();
        }

        /* ===========================================     Shuffle Behavior   ======================================= */

        /* ===========================================        Spark UI        ======================================= */

        if(getSparkShuffleRegistrationMaxAttempts() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkShuffleRegistrationMaxAttempts();
        }

        if(getSparkEventLogBlockUpdatesEnabled() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogBlockUpdatesEnabled();
        }

        if(getSparkEventLogLongFormEnabled() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogLongFormEnabled();
        }

        if(getSparkEventLogCompress() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogCompress();
        }

        if(getSparkEventLogDir() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogDir();
        }

        if(getSparkEventLogEnabled() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogEnabled();
        }

        if(getSparkEventLogOverWrite() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogOverWrite();
        }

        if(getSparkEventLogBufferKB() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkEventLogBufferKB();
        }

        /* ===========================================        Spark UI        ======================================= */

        /* ======================================= Compression and Serialization ==================================== */

        if(getSparkBroadcastCompress() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkBroadcastCompress();
        }

        if(getSparkIOCompressionCodec() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkIOCompressionCodec();
        }

        if(getSparkIOCompressionLz4Blocksize() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkIOCompressionLz4Blocksize();
        }

        if(getSparkIOCompressionSnappyBlockSize() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkIOCompressionSnappyBlockSize();
        }

        if(getSparkIOCompressionZSTDLevel() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkIOCompressionZSTDLevel();
        }

        if(getSparkIOCompressionZSTDBufferSize() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkIOCompressionZSTDBufferSize();
        }

        if(getKyroClassToRegister() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getKyroClassToRegister();
        }

        if(getKyroReferenceTracking() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getKyroReferenceTracking();
        }

        if(getSparkKyroRequired() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkKyroRequired();
        }

        if(getSparkKyroRegistrator() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkKyroRegistrator();
        }

        if(getSparkKyroUnsafe() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkKyroUnsafe();
        }

        if(getSparkKyroSerializerBufferMax() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkKyroSerializerBufferMax();
        }

        if(getSparkKyroSerializerBuffer() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkKyroSerializerBuffer();
        }

        if(getRDDCompress() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getRDDCompress();
        }

        if(getSparkSerializer() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkSerializer();
        }

        if(getSparkSerializerObjectStreamReset() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkSerializerObjectStreamReset();
        }

        /* =========================================== Compression and Serialization ================================ */

        /* ===========================================        Memory Management      ================================ */
        /* ===========================================        Memory Management      ================================ */

        /* ===========================================        Execution Behavior     ================================ */

        if(getSparkDefaultParallelism() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDefaultParallelism();
        }

        /* ===========================================        Execution Behavior     ================================ */

        /* ===========================================            Networking         ================================ */
        /* ===========================================            Networking         ================================ */

        /* ===========================================            Scheduling         ================================ */
        /* ===========================================            Scheduling         ================================ */

        /* ===========================================         Dynamic Allocation    ================================ */

        if(getSparkDynamicAllocationEnabled() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDynamicAllocationEnabled();
        }

        if(getSparkDynamicAllocationExecutorIdleTimeout() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDynamicAllocationExecutorIdleTimeout();
        }

        if(getSparkDynamicAllocationCachedExecutorIdleTimeout() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDynamicAllocationCachedExecutorIdleTimeout();
        }

        if(getSparkDynamicAllocationInitialExecutors() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDynamicAllocationInitialExecutors();
        }

        if(getSparkDynamicAllocationMaxExecutors() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDynamicAllocationMaxExecutors();
        }

        if(getSparkDynamicAllocationMinExecutors() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkDynamicAllocationMinExecutors();
        }

        if(getDynamicAllocationExecutorAllocationRatio() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getDynamicAllocationExecutorAllocationRatio();
        }

        if(getDynamicAllocationSchedulerBacklogTimeout() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getDynamicAllocationSchedulerBacklogTimeout();
        }

        if(getDynamicAllocationSustainedSchedulerBacklogTimeout() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getDynamicAllocationSustainedSchedulerBacklogTimeout();
        }

        /* ===========================================         Dynamic Allocation    ================================ */

        /* ===========================================             Security          ================================ */
        /* ===========================================             Security          ================================ */

        /* ===========================================              SparkR           ================================ */
        /* ===========================================              SparkR           ================================ */

        /* ===========================================              GraphX           ================================ */
        /* ===========================================              GraphX           ================================ */

        /* ===========================================              Deploy           ================================ */
        /* ===========================================              Deploy           ================================ */

        /* ===========================================        Environment Variables  ================================ */
        /* ===========================================        Environment Variables  ================================ */

        /* ===========================================           History Server  ==================================== */

        if(getSparkHistoryProvider() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkHistoryProvider();
        }

        if(getSparkHistoryFSLogDirectory() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkHistoryFSLogDirectory();
        }

        if(getSparkHistoryUIPort() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex-1] = "--conf";
            Configuration[ConfigurationIndex] = getSparkHistoryUIPort();
        }

        /* ===========================================           History Server  ==================================== */

        /* PRIMARY RESOURCES */

        if(getPrimaryResource() != null){
            ConfigurationIndex = ConfigurationIndex + 2;
            Configuration[ConfigurationIndex] = getPrimaryResource();
            //System.out.println("Submit Application : " + getPrimaryResource());
        }

        /*
        if(getChildArguments().length >= 0){
            for(int i=0; i<getChildArguments().length; i++){
                if(getChildArguments()[i] != null) {
                    ConfigurationIndex = ConfigurationIndex + 2;
                    sparkConfiguration[ConfigurationIndex] = getChildArguments()[i];
                }
            }
        }

         */


        return new IO().removeNull(Configuration);
    }


    public void setChildArgs(String[] ChildArgs){
        this.childArguments = ChildArgs;
    }

    public String[] getChildArguments(){
        return new IO().removeNull(childArguments);
    }

    /*
    public void setSparkConfiguration(String SparkMasterURL, String AppName, String ClassName, String DeployMode, String PrimaryResources){

        // Require Index Must Set To 8
        int sparkIndex = 8;

        // Main Configuration
        sparkConfiguration[0] = "--class";
        sparkConfiguration[1] = ClassName;
        sparkConfiguration[2] = "--master";
        sparkConfiguration[3] = SparkMasterURL;
        sparkConfiguration[4] = "--name";
        sparkConfiguration[5] = AppName;
        sparkConfiguration[6] = "--deploy-mode";
        sparkConfiguration[7] = DeployMode;
        sparkConfiguration[8] = PrimaryResources;



        for(int i=0; i<getChildArguments().length; i++){
            if(getChildArguments()[i] != null) {
                sparkConfiguration[9+i] = getChildArguments()[i];
            }
        }
    }

     */

    private void setSparkArgument(String[] SparkArgument){
        for(int i=0; i<SparkArgument.length; i++){
            childArguments[i] = SparkArgument[i];
        }
    }

    private void setSparkHome(String Directory){
        System.setProperty("SPARK_HOME", Directory);
    }

    private void setSparkMode(int Mode){
        if(Mode==1){
            System.setProperty("SPARK_YARN_MODE", "true");
        } else {

            System.out.println("Mode :");
            System.out.println("1 : Yarn");
        }
    }

    private void setSparkUser(String User){
        System.setProperty("SPARK_USER", User);
    }

    private void setSparkAttempt(int NumberOfAttempts){
        System.setProperty("MAX_APP_ATTEMPTS", String.valueOf(NumberOfAttempts));
    }


    /* Using Launcher Not Tested Yet
    public SparkLauncher SparkLauncher() {
        SparkLauncher sparkLauncher = new SparkLauncher();
        sparkLauncher
                .setMaster(getSparkMaster())
                .setDeployMode(getDeployMode())
                .setMainClass(getMainClass())
                .setAppResource(getPrimaryResource());
        return sparkLauncher;
    }

    public SparkLauncher getSparkLauncher() {
        SparkLauncher launcher = new SparkLauncher()
                .setAppResource(getPrimaryResource())
                .setMainClass("Library")
                .setMaster(getSparkMaster())
                .setAppName(getAppName())
                .setVerbose(getVerbose())
                .setConf(SparkLauncher.DRIVER_MEMORY, getDriverMemory())
                .setConf(SparkLauncher.EXECUTOR_MEMORY, getExecutorMemory())
                .setConf(SparkLauncher.EXECUTOR_CORES, "" + getExecutorCores())
                .setConf(SparkLauncher.CHILD_PROCESS_LOGGER_NAME, getAppName())
                .setConf("spark.executor.instances", "" + getNumExecutors())
                .setConf("spark.executor.memory", getExecutorMemory())
                .setConf("spark.driver.extraJavaOptions", "-Dlog4j.configuration=log4j.properties")
                .setConf("spark.executor.extraJavaOptions", "-Dlog4j.configuration=log4j.properties")
                .addSparkArg("--num-executors", "" + getNumExecutors())
                .addSparkArg("--driver-cores", "" + getDriverCores())
                .addSparkArg("--total-executor-cores", "" + getTotalCores());
        System.out.println(getPrimaryResource());
        System.out.println(getSparkMaster());
        System.out.println(getAppName());
        System.out.println(getVerbose());
        System.out.println(getDriverMemory());
        System.out.println(getExecutorMemory());
        System.out.println(getExecutorCores());
        System.out.println(getAppName());
        System.out.println(getNumExecutors());
        System.out.println(getDriverCores());
        System.out.println(getTotalCores());
        return launcher;
    }

     */

}

