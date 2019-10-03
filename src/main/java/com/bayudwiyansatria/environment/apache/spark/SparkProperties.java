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
import com.bayudwiyansatria.Core;

public class SparkProperties extends Core {
    /* See https://spark.apache.org/docs/latest/configuration.html for more information */

    /* =========================================== Application Properties =========================================== */

    // spark.app.name = (none);
    private String SPARK_APP_NAME = null;

    // spark.driver.cores = 1;
    private String SPARK_DRIVER_CORES = null;

    // spark.driver.maxResultSize = 1g;
    private String SPARK_DRIVER_MAXRESULTSIZE = null;

    // spark.driver.memory = 1g;
    private String SPARK_DRIVER_MEMORY = null;

    // spark.driver.memoryOverhead = (none) ex: 0.10;
    private String SPARK_DRIVER_MEMORYOVERHEAD = null;

    // spark.driver.allowMultipleContexts = false;
    private String SPARK_DRIVER_ALLOWMULTIPLECONTEXTS = null;

    // spark.executor.memory = 1g;
    private String SPARK_EXECUTOR_MEMORY = null;

    // spark.executor.pyspark.memory =
    private String SPARK_EXECUTOR_PYSPARK_MEMORY = null;

    // spark.executor.memoryOverhead = (none) ex: 0.10;
    private String SPARK_EXECUTOR_MEMORYOVERHEAD = null;

    // spark.extraListeners = (none);
    private String SPARK_EXTRALISTENER = null;

    // spark.local.dir = /tmp
    private String SPARK_LOCAL_DIR = null;

    // spark.logConf = false;
    private String SPARK_LOGCONF = null;

    // spark.master = (none);
    private String SPARK_MASTER = null;

    // spark.submit.deployMode = (none);
    private String SPARK_SUBMIT_DEPLOYMODE = null;

    // spark.log.callerContext = (none);
    private String SPARK_LOG_CALLERCONTEXT = null;

    // spark.driver.supervise = false;
    private String SPARK_DRIVER_SUPERVISE = null;

    /* =========================================== Application Properties =========================================== */

    /* ===========================================   Runtime Environment  =========================================== */

    // spark.driver.extraClassPath = (none);
    private String SPARK_DRIVER_EXTRACLASSPATH = null;

    // spark.driver.extraJavaOptions = -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseG1GC -XX:+UseCompressedOops;
    private String SPARK_DRIVER_EXTRAJAVAOPTIONS = null;

    // spark.driver.extraLibraryPath = (none);
    private String SPARK_DRIVER_EXTRALIBRARYPATH = null;

    // spark.driver.userClassPathFirst = false;
    private String SPARK_DRIVER_USERCLASSPATHFIRST = null;

    // spark.executor.extraClassPath = (none);
    private String SPARK_EXECUTOR_EXTRACLASSPATH = null;

    // spark.executor.extraJavaOptions = (none);
    private String SPARK_EXECUTOR_EXTRAJAVAOPTIONS = null;

    // spark.executor.extraLibraryPath = (none);
    private String SPARK_EXECUTOR_EXTRALIBRARYPATH = null;

    // spark.executor.logs.rolling.maxRetainedFiles = (none);
    private String SPARK_EXECUTOR_LOGS_ROLLNG_MAXRETAINEDFILES = null;

    // spark.executor.logs.rolling.enableCompression = false;
    private String SPARK_EXECUTOR_LOGS_ROLLING_ENABLECOMPRESSION = null;

    // spark.executor.logs.rolling.maxSize = (none);
    private String SPARK_EXECUTOR_LOGS_ROLLING_MAXSIZE = null;

    // spark.executor.logs.rolling.strategy = (none);
    private String SPARK_EXECUTOR_LOGS_ROLLING_STRATEGY = null;

    // spark.executor.logs.rolling.time.interval = daily;
    private String SPARK_EXECUTOR_LOGS_ROLLING_TIME_INTERVAL = null;

    // spark.executor.userClassPathFirst = false;
    private String SPARK_EXECUTOR_USERCLASSPATHFIRST = null;

    // spark.executorEnv.[EnvironmentVariableName] = (none);
    private String SPARK_EXECUTORENV = null;

    // spark.redaction.regex = (?i)secret|password;
    private String SPARK_REDACTION_REGEX = null;

    // spark.python.profile = false;
    private String SPARK_PYtHON_PROFILE = null;

    // spark.python.profile.dump = (none);
    private String SPARK_PYTHON_PROFILE_DUMP = null;

    // spark.python.worker.memory = 512m;
    private String SPARK_PYTHON_WORKER_MEMORY = null;

    // spark.python.worker.reuse = true;
    private String SPARK_PYTHON_WORKER_REUSE = null;

    // spark.files =
    private String SPARK_FILES = null;

    // spark.submit.pyFiles =
    private String SPARK_SUBMIT_PYFILES = null;

    // spark.jars =
    private String SPARK_JARS = null;

    // spark.jars.packages =
    private String SPARK_JARS_PACKAGES = null;

    // spark.jars.excludes =
    private String SPARK_JARS_EXCLUDES = null;

    // spark.jars.ivy =
    private String SPARK_JARS_IVY = null;

    // spark.jars.ivySettings =
    private String SPARK_JARS_IVYSETTINGS = null;

    // spark.jars.repositories =
    private String SPARK_JARS_REPOSITORIES = null;

    // spark.pyspark.driver.python =
    private String SPARK_PYSPARK_DRIVER_PYTHON = null;

    // spark.pyspark.python =
    private String SPARK_PYSPARK_PYTHON = null;

    /* ===========================================   Runtime Environment  =========================================== */

    /* ===========================================     Shuffle Behavior   =========================================== */

    // spark.reducer.maxSizeInFlight = 48m;
    private String SPARK_REDUCER_MAXSIZEINFLIGHT = null;

    // spark.reducer.maxReqsInFlight = Int.MaxValue;
    private String SPARK_REDUCER_MAXREQSINFLIGTH = null;

    // spark.reducer.maxBlocksInFlightPerAddress = Int.MaxValue;
    private String SPARK_REDUCER_MAXBLOCKSINFLIGHTPERADDRESS = null;

    // spark.maxRemoteBlockSizeFetchToMem = Int.MaxValue - 512;
    private String SPARK_MAXREMOTEBLOCKSIZEFETCHTOMEM = null;

    // spark.shuffle.compress = true;
    private String SPARK_SHUFFLE_COMPRESS = null;

    // spark.shuffle.file.buffer = 32k;
    private String SPARK_SHUFFLE_FILE_BUFFER = null;

    // spark.shuffle.io.maxRetries = 3;
    private String SPARK_SHUFFLE_IO_MAXRETRIES = null;

    // spark.shuffle.io.numConnectionsPerPeer = 1;
    private String SPARK_SHUFFLE_IO_NUMCONNECTIONSPERPEER = null;

    // spark.shuffle.io.preferDirectBufs = true;
    private String SPARK_SHUFFLE_IO_PREFERDIRECTBUFS = null;

    // spark.shuffle.io.retryWait = 5s;
    private String SPARK_SHUFFLE_IO_RETRYWAIT = null;

    // spark.shuffle.service.enabled = false;
    private String SPARK_SHUFFLE_SERVICE_ENABLED = null;

    // spark.shuffle.service.port = 7337;
    private String SPARK_SHUFFLE_SERVICE_PORT = null;

    // spark.shuffle.service.index.cache.size = 100m;
    private String SPARK_SHUFFLE_SERVICE_INDEX_CACHE_SIZE = null;

    // spark.shuffle.maxChunksBeingTransferred = Long.MAX_VALUE;
    private String SPARK_SHUFFLE_MAXCHUNKSBEINGTRANSFERRED = null;

    // spark.shuffle.sort.bypassMergeThreshold = 200;
    private String SPARK_SHUFFLE_SORT_BYPASSMERGETHRESHOLD = null;

    // spark.shuffle.spill.compress = true;
    private String SPARK_SHUFFLE_SPILL_COMPRESS = null;

    // spark.shuffle.accurateBlockThreshold = 100 * 1024 * 1024
    private String SPARK_SHUFFLE_ACCURATEBLOCKTHRESHOLD = null;

    // spark.shuffle.registration.timeout = 5000;
    private String SPARK_SHUFFLE_REGISTRATION_TIMEOUT = null;

    // spark.shuffle.registration.maxAttempts = 3;
    private String SPARK_SHUFFLE_REGISTRATION_MAXATTEMPTS = null;

    /* ===========================================     Shuffle Behavior   =========================================== */

    /* ===========================================        Spark UI        =========================================== */

    // spark.eventLog.logBlockUpdates.enabled = false;
    private String SPARK_EVENTLOG_LOGBLOCKUPDATES_ENABLED = null;

    // spark.eventLog.longForm.enabled = false;
    private String SPARK_EVENTLOG_LONGFORM_ENABLED = null;

    //spark.eventLog.compress = false;
    private String SPARK_EVENTLOG_COMPRESS = null;

    // spark.eventLog.dir = file://tmp/spark-events;
    private String SPARK_EVENTLOG_DIR = null;

    // spark.eventLog.enabled = false;
    private String SPARK_EVENTLOG_ENABLED = null;

    // spark.eventLog.overwrite = false;
    private String SPARK_EVENTLOG_OVERWRITE = null;

    // spark.eventLog.buffer.kb = 100k;
    private String SPARK_EVENTLOG_BUFFER_KB = null;

    // spark.ui.dagGraph.retainedRootRDDs = Int.Int.MaxValue;
    private String SPARK_UI_DAGGRAPH_RETAINEDROOTRDDS = null;

    // spark.ui.enabled = true;
    private String SPARK_UI = null;

    // spark.ui.killEnabled = true;
    private String SPARK_UI_KILL_ENABLED = null;

    // spark.ui.liveUpdate.period = 100ms;
    private String SPARK_UI_LIVEUPDATEPERIOD = null;

    // spark.ui.liveUpdate.minFlushPeriod = 1s;
    private String SPARK_UI_LIVEUPDATE_MINFLUSHPERIOD = null;

    // spark.ui.port = 4040;
    private String SPARK_UI_PORT = null;

    // spark.ui.retainedJobs = 1000;
    private String SPARK_UI_RETAINEDJOB = null;

    // spark.ui.retainedStages = 1000;
    private String SPARK_UI_RETAINEDSTAGES = null;

    // spark.ui.retainedTasks = 100000;
    private String SPARK_UI_RETAINEDTASKS = null;

    // spark.ui.reverseProxy = false;
    private String SPARK_UI_REVERSEPROXY = null;

    // spark.ui.reverseProxyUrl =
    private String SPARK_UI_REVERSEPROXYURL = null;

    // spark.ui.showConsoleProgress = true;
    private String SPARK_UI_SHOWCONSOLEPROGRESS = null;

    // spark.worker.ui.retainedExecutors = 1000;
    private String SPARK_WORKER_UI_RETAINEDEXECUTORS = null;

    // spark.worker.ui.retainedDrivers = 1000;
    private String SPARK_WORKER_UI_RETAINEDDRIVER = null;

    // spark.sql.ui.retainedExecutions = 1000;
    private String SPARK_SQL_UI_RETAINEDEXECUTIONS = null;

    // spark.streaming.ui.retainedBatches = 1000;
    private String SPARK_STREAMING_UI_RETAINEDBATCHES = null;

    // spark.ui.retainedDeadExecutors = 100;
    private String SPARK_UI_RETAINEDDEADEXECUTORS = null;

    // spark.ui.filters = None;
    private String SPARK_UI_FILTERS = null;

    // spark.ui.requestHeaderSize = 8k;
    private String SPARK_UI_REQUESTHEADERSIZE = null;


    /* ===========================================        Spark UI        =========================================== */


    /* =========================================== Compression and Serialization ==================================== */

    // spark.broadcast.compress = true;
    private String SPARK_BROADCAST_COMPRESS = null;

    // spark.io.compression.codec = lz4;
    private String SPARK_IO_COMPRESSION_CODEC = null;

    // spark.io.compression.lz4.blockSize = 32k;
    private String SPARK_IO_COMPRESSION_LZ4_BLOCKSIZE = null;

    // spark.io.compression.snappy.blockSize = 32k;
    private String SPARK_IO_COMPRESSION_SNAPPY_BLOCKSIZE = null;

    // spark.io.compression.zstd.level = 1;
    private String SPARK_IO_COMPRESSION_ZSTD_LEVEL = null;

    // spark.io.compression.zstd.bufferSize = 32k;
    private String SPARK_IO_COMPRESSION_ZSTD_BUFFERSIZE = null;

    // spark.kryo.classesToRegister = (none);
    private String SPARK_KYRO_CLASSESTOREGISTER = null;

    // spark.kryo.referenceTracking = true;
    private String SPARK_KYRO_REFERENCETRACKING = null;

    // spark.kryo.registrationRequired = false;
    private String SPARK_KYRO_REGISTRATIONREQUIRED = null;

    // spark.kryo.registrator = (none);
    private String SPARK_KYRO_REGISTRATOR = null;

    // spark.kryo.unsafe = false;
    private String SPARK_KYRO_UNSAFE = null;

    // spark.kryoserializer.buffer.max = 64m;
    private String SPARK_KYROSERIALIZER_BUFFER_MAX = null;

    // spark.kryoserializer.buffer = 64k;
    private String SPARK_KYROSERIALIZER_BUFFER = null;

    // spark.rdd.compress = false;
    private String SPARK_RDD_COMPRESS = null;

    //spark.serializer = org.apache.spark.serializer.JavaSerializer
    private String SPARK_SERIALIZER = null;

    //spark.serializer.objectStreamReset = 100;
    private String SPARK_SERIALIZER_OBJECTSTREAMRESET = null;

    /* =========================================== Compression and Serialization ==================================== */

    /* ===========================================        Memory Management      ==================================== */

    // spark.memory.fraction = 0.6

    // spark.memory.storageFraction 0.5

    // spark.memory.offHeap.enabled = false;

    // spark.memory.offHeap.size = 0;

    // spark.memory.useLegacyMode = false;

    // spark.shuffle.memoryFraction = 0.2;

    // spark.storage.memoryFraction = 0.6;

    // spark.storage.unrollFraction = 0.2;

    // spark.storage.replication.proactive = false;

    // spark.cleaner.periodicGC.interval = 30min;

    // spark.cleaner.referenceTracking = true;

    // spark.cleaner.referenceTracking.blocking = true;

    // spark.cleaner.referenceTracking.blocking.shuffle = false;

    // spark.cleaner.referenceTracking.cleanCheckpoints = false;

    /* ===========================================        Memory Management      ==================================== */

    /* ===========================================        Execution Behavior     ==================================== */

    // spark.broadcast.blockSize = 4m;
    private String SPARK_BROADCAST_BLOCKSIZE = null;

    // spark.broadcast.checksum = true;
    private String SPARK_BROADCAST_CHECKSUM = null;

    // spark.default.parallelism =
    private String SPARK_DEFAULT_PARALLELISM = null;

    // spark.executor.heartbeatInterval = 10s;
    private String SPARK_EXECUTOR_HEARBEATINTERVAL = null;

    // spark.files.fetchTimeout = 60s;
    private String SPARK_FILES_FETCH_TIMEOUT = null;

    // spark.files.useFetchCache = true;
    private String SPARK_FILES_USEFETCHCACHE = null;

    // spark.files.overwrite = false;
    private String SPARK_FILES_OVERWRITE = null;

    // spark.files.maxPartitionBytes = 134217728 (128 MB)
    private String SPARK_FILES_MAXPARTITIONBYTES = null;

    // spark.files.openCostInBytes = 4194304 (4 MB)
    private String SPARK_FILES_OPENCOSTINBYTES = null;

    // spark.hadoop.cloneConf = false;
    private String SPARK_HADOOP_CLONECONF = null;

    // spark.hadoop.validateOutputSpecs = true;
    private String SPARK_HADOOP_VALIDATEOUTPUTSPECS = null;

    // spark.storage.memoryMapThreshold = 2m;
    private String SPARK_STORAGE_MEMORYMAPTHRESHOLD = null;

    // spark.hadoop.mapreduce.fileoutputcommitter.algorithm.version = 2;
    private String SPARK_HADOOP_MAPREDUCE_FILEOUTPUTCOMMUTTER_ALGORITHM_VERSION = null;

    /* ===========================================        Execution Behavior     ==================================== */

    /* ===========================================            Networking         ==================================== */
    /* ===========================================            Networking         ==================================== */

    /* ===========================================            Scheduling         ==================================== */
    /* ===========================================            Scheduling         ==================================== */

    /* ===========================================         Dynamic Allocation    ==================================== */

    // spark.dynamicAllocation.enabled = false;
    private String SPARK_DYNAMICALLOCATION_ENABLED = null;

    // spark.dynamicAllocation.executorIdleTimeout = 60s;
    private String SPARK_DYNAMICALLOCATION_EXECUTORIDLETIMEOUT = null;

    // spark.dynamicAllocation.cachedExecutorIdleTimeout = infinity;
    private String SPARK_DYNAMICALLOCATION_CACHEDEXECUTORIDLETIMEOUT = null;

    // spark.dynamicAllocation.initialExecutors = spark.dynamicAllocation.minExecutors;
    private String SPARK_DYNAMICALLOCATION_INITIALEXECUTORS = null;

    // spark.dynamicAllocation.maxExecutors = infinity;
    private String SPARK_DYNAMICALLOCATION_MAXEXECUTORS = null;

    // spark.dynamicAllocation.minExecutors = 0;
    private String SPARK_DYNAMICALLOCATION_MINEXECUTORS = null;

    // spark.dynamicAllocation.executorAllocationRatio = 1;
    private String SPARK_DYNAMICALLOCATION_EXECUTORALLOCATIONRATIO = null;

    // spark.dynamicAllocation.schedulerBacklogTimeout = 1s;
    private String SPARK_DYNAMICALLOCATION_SCHEDULERBACKLOGTIMEOUT = null;

    // spark.dynamicAllocation.sustainedSchedulerBacklogTimeout = schedulerBacklogTimeout;
    private String SPARK_DYNAMICALLOCATION_SUSTAINEDSCHEDULERBACKLOGTIMEOUT = null;

    /* ===========================================         Dynamic Allocation    ==================================== */

    /* ===========================================             Security          ==================================== */
    /* ===========================================             Security          ==================================== */

    /* ===========================================              SparkR           ==================================== */
    /* ===========================================              SparkR           ==================================== */

    /* ===========================================              GraphX           ==================================== */
    /* ===========================================              GraphX           ==================================== */

    /* ===========================================              Deploy           ==================================== */
    /* ===========================================              Deploy           ==================================== */

    /* ===========================================        Environment Variables  ==================================== */
    /* ===========================================        Environment Variables  ==================================== */


    /* ===========================================           History Server  ======================================== */

    // spark.history.provider = org.apache.spark.deploy.history.FsHistoryProvider
    private String SPARK_HISTORY_PROVIDER = null;

    // spark.history.fs.logDirectory = "file://tmp/spark-events";
    private String SPARK_HISTORY_FS_LOGDIRECTORY = null;

    // spark.history.fs.update.interval = 10s;
    private String SPARK_HISTORY_FS_UPDATE_INTERVAL = null;

    // spark.history.retainedApplications = 50;
    private String SPARK_HISTORY_RETAINEDAPPLICATIONS = null;

    // spark.history.ui.maxApplications = Int.MaxValue;
    private String SPARK_HISTORY_UI_MAXAPPLICATION = null;

    // spark.history.ui.port = 18080;
    private String SPARK_HISTORY_UI_PORT = null;

    // spark.history.kerberos.enabled = false;
    private String SPARK_HISTORY_KERBEROS_ENABLED = null;

    // spark.history.kerberos.principal = (none);
    private String SPARK_HISTORY_KERBEROS_PRINCIPAL = null;

    // spark.history.kerberos.keytab = (none)
    private String SPARK_HISTORY_KERBEROS_KEYTAB = null;

    // spark.history.fs.cleaner.enabled = false;
    private String SPARK_HISTORY_FS_CLEANER_ENABLED = null;

    // spark.history.fs.cleaner.interval = 1d;
    private String SPARK_HISTORY_FS_CLEANER_INTERVAL = null;

    // spark.history.fs.cleaner.maxAge = 7d;
    private String SPARK_HISTORY_FS_CLEANER_MAXAGE = null;

    // spark.history.fs.endEventReparseChunkSize = 1m;
    private String SPARK_HISTORY_FS_ENDEVENTREPARSECHUNKSIZE = null;

    // spark.history.fs.inProgressOptimization.enabled = true;
    private String SPARK_HISTORY_FS_INPROGRESSOPTIMAZTION_ENABLED = null;

    // spark.history.fs.numReplayThreads = 25% of available cores;
    private String SPARK_HISTORY_FS_NUMREPLAYTHREADS = null;

    // spark.history.store.maxDiskUsage = 10g;
    private String SPARK_HISTORY_STORE_MAXDISKUSAGE = null;

    // spark.history.store.path = (none);
    private String SPARK_HISTORY_STORE_PATH = null;

    /* ===========================================     History Server  ============================================== */




    /* ============================================================================================================== */



    /* =========================================== Application Properties =========================================== */

    protected void setSparkAppName(String AppName) {
        this.SPARK_APP_NAME = "spark.app.name="+AppName;
    }

    protected String getSparkAppName() {
        return SPARK_APP_NAME;
    }

    protected void setSparkDriverCores(String DriverCores) {
        this.SPARK_DRIVER_CORES = "spark.driver.cores="+DriverCores;
    }

    protected String getSparkDriverCores() {
        return SPARK_DRIVER_CORES;
    }

    public void setSparkDriverMaxResultSize(String ResultSize) {
        this.SPARK_DRIVER_MAXRESULTSIZE = "spark.driver.maxResultSize="+ResultSize;
    }

    public String getSparkDriverMaxResultSize() {
        return SPARK_DRIVER_MAXRESULTSIZE;
    }

    protected void setSparkDriverMemory(String DriverMemory) {
        this.SPARK_DRIVER_MEMORY = "spark.driver.memory="+DriverMemory;
    }

    protected String getSparkDriverMemory() {
        return SPARK_DRIVER_MEMORY;
    }

    public void setSparkDriverMemoryOverhead(String MemoryOverhead) {
        this.SPARK_DRIVER_MEMORYOVERHEAD = "spark.driver.memoryOverhead="+MemoryOverhead;
    }

    public String getSparkDriverMemoryOverhead() {
        return SPARK_DRIVER_MEMORYOVERHEAD;
    }

    public void setSparkDriverAllowMultipleContexts(String AllowMultipleContext) {
        this.SPARK_DRIVER_ALLOWMULTIPLECONTEXTS = "spark.driver.allowMultipleContexts=" + AllowMultipleContext;
    }

    public String getSparkDriverAllowMultipleContexts() {
        return SPARK_DRIVER_ALLOWMULTIPLECONTEXTS;
    }

    protected void setSparkExecutorMemory(String ExecutorMemory) {
        this.SPARK_EXECUTOR_MEMORY = "spark.executor.memory="+ExecutorMemory;
    }

    protected String getSparkExecutorMemory() {
        return SPARK_EXECUTOR_MEMORY;
    }

    public void setSparkExecutorPySparkMemory(String PySparkMemory) {
        this.SPARK_EXECUTOR_PYSPARK_MEMORY = "spark.executor.pyspark.memory="+PySparkMemory;
    }

    public String getSparkExecutorPySparkMemory() {
        return SPARK_EXECUTOR_PYSPARK_MEMORY;
    }

    public void setSparkExecutorMemoryOverhead(String MemoryOverhead) {
        this.SPARK_EXECUTOR_MEMORYOVERHEAD = "spark.executor.memoryOverhead="+MemoryOverhead;
    }

    public String getSparkExecutorMemoryOverhead() {
        return SPARK_EXECUTOR_MEMORYOVERHEAD;
    }

    public void setSparkExtraListener(String ExtraListener) {
        this.SPARK_EXTRALISTENER = "spark.extraListeners="+ExtraListener;
    }

    public String getSparkExtraListener() {
        return SPARK_EXTRALISTENER;
    }

    public void setSparkLocalDirectory(String LocalDirectory) {
        this.SPARK_LOCAL_DIR = "spark.local.dir="+LocalDirectory;
    }

    public String getSparkLocalDirectory() {
        return SPARK_LOCAL_DIR;
    }

    public void setSparkLogConf(String LogConf) {
        this.SPARK_LOGCONF = "spark.logConf="+LogConf;
    }

    public String getSparkLogCOnf() {
        return SPARK_LOGCONF;
    }

    protected void setMaster(String SparkMaster) {
        this.SPARK_MASTER = "spark.master="+SparkMaster;
    }

    protected String getMaster() {
        return SPARK_MASTER;
    }

    protected void setSparkSubmitDeployMode(String DeployMode) {
        this.SPARK_SUBMIT_DEPLOYMODE = "spark.submit.deployMode="+DeployMode;
    }

    protected String getSparkSubmitDeployMode() {
        return SPARK_SUBMIT_DEPLOYMODE;
    }

    public void setSparkLogCallerContext(String CallerContext) {
        this.SPARK_LOG_CALLERCONTEXT = "spark.log.callerContext="+CallerContext;
    }

    public String getSparkLogCallerContext() {
        return SPARK_LOG_CALLERCONTEXT;
    }

    protected void setSparkDriverSupervise(String Supervise) {
        this.SPARK_DRIVER_SUPERVISE = "spark.driver.supervise="+Supervise;
    }

    protected String getSparkDriverSupervise() {
        return SPARK_DRIVER_SUPERVISE;
    }

    /* =========================================== Application Properties =========================================== */


    /* ===========================================   Runtime Environment  =========================================== */

    protected void setSparkDriverExtraClassPath(String ExtraClassPath) {
        this.SPARK_DRIVER_EXTRACLASSPATH = "spark.driver.extraClassPath=" + ExtraClassPath;
    }

    protected String getSparkDriverExtraClassPath() {
        return SPARK_DRIVER_EXTRACLASSPATH;
    }

    protected void setSparkDriverExtraJavaOptions(String ExtraJavaOptions) {
        this.SPARK_DRIVER_EXTRAJAVAOPTIONS = "spark.driver.extraJavaOptions=" + ExtraJavaOptions;
    }

    protected String getSparkDriverExtraJavaOptions() {
        return SPARK_DRIVER_EXTRAJAVAOPTIONS;
    }

    protected void setSparkDriverExtraLibraryPath(String ExtraLibraryPath) {
        this.SPARK_DRIVER_EXTRALIBRARYPATH = "spark.driver.extraLibraryPath=" + ExtraLibraryPath;
    }

    protected String getSparkDriverExtraLibraryPath() {
        return SPARK_DRIVER_EXTRALIBRARYPATH;
    }

    protected void setSparkDriverUserClassPathFirst(String UserClassPathFirst) {
        this.SPARK_DRIVER_USERCLASSPATHFIRST = "spark.driver.userClassPathFirst=" + UserClassPathFirst;
    }

    protected String getSparkDriverUserClassPathFirst() {
        return SPARK_DRIVER_USERCLASSPATHFIRST;
    }
    /* ===========================================   Runtime Environment  =========================================== */

    /* ===========================================     Shuffle Behavior   =========================================== */

    public void setSparkReducerMaxSizeInFlight(String ReducerMaxSizeInFlight) {
        this.SPARK_REDUCER_MAXSIZEINFLIGHT = "spark.reducer.maxSizeInFlight=" + ReducerMaxSizeInFlight;
    }

    public String getSparkReducerMaxSizeInFlight() {
        return SPARK_REDUCER_MAXSIZEINFLIGHT;
    }

    public void setSparkReducerMaxReqsInFlight(String MaxReqsInFlight) {
        this.SPARK_REDUCER_MAXREQSINFLIGTH = "spark.reducer.maxReqsInFlight=" + MaxReqsInFlight;
    }

    public String getSparkReducerMaxReqsInFlight() {
        return SPARK_REDUCER_MAXREQSINFLIGTH;
    }

    public void setSparkReducerMaxBlocksInFlightPerAddress(String MaxBlocksInFlightPerAddress) {
        this.SPARK_REDUCER_MAXBLOCKSINFLIGHTPERADDRESS = "spark.reducer.maxBlocksInFlightPerAddress=" + MaxBlocksInFlightPerAddress;
    }

    public String getSparkReducerMaxBlocksInFlightPerAddress() {
        return SPARK_REDUCER_MAXBLOCKSINFLIGHTPERADDRESS;
    }

    public void setSparkMaxRemoteBlockSizeFetchToMem(String MaxRemoteBlockSizeFetchToMem) {
        this.SPARK_MAXREMOTEBLOCKSIZEFETCHTOMEM = "spark.maxRemoteBlockSizeFetchToMem=" + MaxRemoteBlockSizeFetchToMem;
    }

    public String getSparkMaxRemoteBlockSizeFetchToMem() {
        return SPARK_MAXREMOTEBLOCKSIZEFETCHTOMEM;
    }

    public void setSparkShuffleCompress(String Compress) {
        this.SPARK_SHUFFLE_COMPRESS = "spark.shuffle.compress=" + Compress;
    }

    public String getSparkShuffleCompress() {
        return SPARK_SHUFFLE_COMPRESS;
    }

    public void setSparkShuffleFileBuffer(String FileBuffer) {
        this.SPARK_SHUFFLE_FILE_BUFFER = "spark.shuffle.file.buffer=" + FileBuffer;
    }

    public String getSparkShuffleFileBuffer() {
        return SPARK_SHUFFLE_FILE_BUFFER;
    }

    public void setSparkShuffleIOMaxRetries(String IOMaxRetries) {
        this.SPARK_SHUFFLE_IO_MAXRETRIES = "spark.shuffle.io.maxRetries=" + IOMaxRetries;
    }

    public String getSparkShuffleIOMaxRetries() {
        return SPARK_SHUFFLE_IO_MAXRETRIES;
    }

    public void setSparkShuffleIONumConnectionsPerPeer(String IONumConnectionsPerPeer) {
        this.SPARK_SHUFFLE_IO_NUMCONNECTIONSPERPEER = "spark.shuffle.io.numConnectionsPerPeer=" + IONumConnectionsPerPeer;
    }

    public String getSparkShuffleIONumConnectionsPerPeer() {
        return SPARK_SHUFFLE_IO_NUMCONNECTIONSPERPEER;
    }

    public void setSparkShuffleIOPreferDirectBufs(String IOPreferDirectBufs) {
        this.SPARK_SHUFFLE_IO_PREFERDIRECTBUFS = "spark.shuffle.io.preferDirectBufs=" + IOPreferDirectBufs;
    }

    public String getSparkShuffleIOPreferDirectBufs() {
        return SPARK_SHUFFLE_IO_PREFERDIRECTBUFS;
    }

    public void setSparkShuffleIORetryWait(String RetryWait) {
        this.SPARK_SHUFFLE_IO_RETRYWAIT = "spark.shuffle.io.retryWait=" + RetryWait;
    }

    public String getSparkShuffleIORetryWait() {
        return SPARK_SHUFFLE_IO_RETRYWAIT;
    }

    public void setSparkShuffleServiceEnabled(String ServiceEnabled) {
        this.SPARK_SHUFFLE_SERVICE_ENABLED = "spark.shuffle.service.enabled=" + ServiceEnabled;
    }

    public String getSparkShuffleServiceEnabled() {
        return SPARK_SHUFFLE_SERVICE_ENABLED;
    }

    public void setSparkShuffleServicePort(String ServicePort) {
        this.SPARK_SHUFFLE_SERVICE_PORT = "spark.shuffle.service.port=" + ServicePort;
    }

    public String getSparkShuffleServicePort() {
        return SPARK_SHUFFLE_SERVICE_PORT;
    }

    public void setSparkShuffleServiceIndexCacheSize(String ServiceIndexCacheSize) {
        this.SPARK_SHUFFLE_SERVICE_INDEX_CACHE_SIZE = "spark.shuffle.service.index.cache.size=" + ServiceIndexCacheSize;
    }

    public String getSparkShuffleServiceIndexCacheSize() {
        return SPARK_SHUFFLE_SERVICE_INDEX_CACHE_SIZE;
    }

    public void setSparkShuffleMaxChunksBeingTransferred(String MaxChunksBeingTransferred) {
        this.SPARK_SHUFFLE_MAXCHUNKSBEINGTRANSFERRED = "spark.shuffle.maxChunksBeingTransferred=" + MaxChunksBeingTransferred;
    }

    public String getSparkShuffleMaxChunksBeingTransferred() {
        return SPARK_SHUFFLE_MAXCHUNKSBEINGTRANSFERRED;
    }

    public void setSparkShuffleSortBypassMergeThreshold(String SortBypassMergeThreshold) {
        this.SPARK_SHUFFLE_SORT_BYPASSMERGETHRESHOLD = "spark.shuffle.sort.bypassMergeThreshold=" + SortBypassMergeThreshold;
    }

    public String getSparkShuffleSortBypassMergeThreshold() {
       return SPARK_SHUFFLE_SORT_BYPASSMERGETHRESHOLD;
    }

    public void setSparkShuffleSpillCompress(String SpillCompress) {
        this.SPARK_SHUFFLE_SPILL_COMPRESS = "spark.shuffle.spill.compress=" + SpillCompress;
    }

    public String getSparkShuffleSpillCompress() {
        return SPARK_SHUFFLE_SPILL_COMPRESS;
    }

    public void setSparkShuffleAccurateBlockThreshold(String AccurateBlockThreshold) {
         this.SPARK_SHUFFLE_ACCURATEBLOCKTHRESHOLD = "spark.shuffle.accurateBlockThreshold=" + AccurateBlockThreshold;
    }

    public String getSparkShuffleAccurateBlockThreshold() {
        return SPARK_SHUFFLE_ACCURATEBLOCKTHRESHOLD;
    }

    public void setSparkShuffleRegistrationTimeout(String RegistrationTimeout) {
        this.SPARK_SHUFFLE_REGISTRATION_TIMEOUT = "spark.shuffle.registration.timeout=" + RegistrationTimeout;
    }

    public String getSparkShuffleRegistrationTimeout() {
        return SPARK_SHUFFLE_REGISTRATION_TIMEOUT;
    }

    public void setSparkShuffleRegistrationMaxAttempts(String RegistrationMaxAttempts) {
        this.SPARK_SHUFFLE_REGISTRATION_MAXATTEMPTS = "spark.shuffle.registration.maxAttempts=" + RegistrationMaxAttempts;
    }

    public String getSparkShuffleRegistrationMaxAttempts() {
        return SPARK_SHUFFLE_REGISTRATION_MAXATTEMPTS;

    }

    /* ===========================================     Shuffle Behavior   =========================================== */

    /* ===========================================        Spark UI        =========================================== */

    public void setSparkEventLogBlockUpdatesEnabled(String BlockUpdatesEnabled) {
        this.SPARK_EVENTLOG_LOGBLOCKUPDATES_ENABLED = "spark.eventLog.logBlockUpdates.enabled=" + BlockUpdatesEnabled;
    }

    public String getSparkEventLogBlockUpdatesEnabled() {
        return SPARK_EVENTLOG_LOGBLOCKUPDATES_ENABLED;
    }

    public void setSparkEventLogLongFormEnabled(String LongFormEnabled) {
        this.SPARK_EVENTLOG_LONGFORM_ENABLED = "spark.eventLog.longForm.enabled=" + LongFormEnabled;
    }

    public String getSparkEventLogLongFormEnabled() {
        return SPARK_EVENTLOG_LONGFORM_ENABLED;
    }

    public void setSparkEventLogCompress(String LogCompress) {
        this.SPARK_EVENTLOG_COMPRESS = "spark.eventLog.compress=" + LogCompress;
    }

    public String getSparkEventLogCompress() {
        return SPARK_EVENTLOG_COMPRESS;
    }

    public void setSparkEventLogDir(String EventLogDir) {
        this.SPARK_EVENTLOG_DIR = "spark.eventLog.dir=" + EventLogDir;
    }

    public String getSparkEventLogDir() {
        return SPARK_EVENTLOG_DIR;
    }

    public void setSparkEventLogEnabled(String EventLogEnabled) {
        this.SPARK_EVENTLOG_ENABLED = "spark.eventLog.enabled=" + EventLogEnabled;
    }

    public String getSparkEventLogEnabled() {
        return SPARK_EVENTLOG_ENABLED;
    }

    public void setSparkEventLogOverWrite(String EventLogOverWrite) {
        this.SPARK_EVENTLOG_OVERWRITE = "spark.eventLog.overwrite=" + EventLogOverWrite;
    }

    public String getSparkEventLogOverWrite() {
        return SPARK_EVENTLOG_OVERWRITE;
    }

    public void setSparkEventLogBufferKB(String BufferKB) {
        this.SPARK_EVENTLOG_BUFFER_KB = "spark.eventLog.buffer.kb=" + BufferKB;
    }

    public String getSparkEventLogBufferKB() {
        return SPARK_EVENTLOG_BUFFER_KB;
    }

    /* ===========================================        Spark UI        =========================================== */

    /* =========================================== Compression and Serialization ==================================== */

    public void setSparkBroadcastCompress(String SparkBroadcastCompress) {
        this.SPARK_BROADCAST_COMPRESS = "spark.broadcast.compress=" + SparkBroadcastCompress;
    }

    public String getSparkBroadcastCompress() {
        return SPARK_BROADCAST_COMPRESS;
    }

    public void setSparkIOCompressionCodec(String setSparkIOCompressionCodec) {
        this.SPARK_IO_COMPRESSION_CODEC = "spark.io.compression.codec=" + setSparkIOCompressionCodec;
    }

    public String getSparkIOCompressionCodec() {
        return SPARK_IO_COMPRESSION_CODEC;
    }

    public void setSparkIOCompressionLz4Blocksize(String CompressionLz4BlockSize) {
        this.SPARK_IO_COMPRESSION_LZ4_BLOCKSIZE = "spark.io.compression.lz4.blockSize=" + CompressionLz4BlockSize;
    }

    public String getSparkIOCompressionLz4Blocksize() {
        return SPARK_IO_COMPRESSION_LZ4_BLOCKSIZE;
    }

    public void setSparkIOCompressionSnappyBlockSize(String CompressionSnappyBlockSize) {
        this.SPARK_IO_COMPRESSION_SNAPPY_BLOCKSIZE = "spark.io.compression.snappy.blockSize=" + CompressionSnappyBlockSize;
    }

    public String getSparkIOCompressionSnappyBlockSize() {
        return SPARK_IO_COMPRESSION_SNAPPY_BLOCKSIZE;
    }

    public void setSparkIOCompressionZSTDLevel(String CompressionZSTDLevel) {
        this.SPARK_IO_COMPRESSION_ZSTD_LEVEL = "spark.io.compression.zstd.level=" + CompressionZSTDLevel;
    }

    public String getSparkIOCompressionZSTDLevel() {
        return SPARK_IO_COMPRESSION_ZSTD_LEVEL;
    }

    public void setSparkIOCompressionZSTDBufferSize(String CompressionZSTDBufferSize) {
        this.SPARK_IO_COMPRESSION_ZSTD_BUFFERSIZE = "spark.io.compression.zstd.bufferSize=" + CompressionZSTDBufferSize;

    }

    public String getSparkIOCompressionZSTDBufferSize() {
        return SPARK_IO_COMPRESSION_ZSTD_BUFFERSIZE;
    }

    public void setKyroClassToRegister(String KyroClassToRegister) {
        this.SPARK_KYRO_CLASSESTOREGISTER = "spark.kryo.classesToRegister=" + KyroClassToRegister;
    }

    public String getKyroClassToRegister() {
        return SPARK_KYRO_CLASSESTOREGISTER;
    }

    public void setKyroReferenceTracking(String ReferenceTracking) {
        this.SPARK_KYRO_REFERENCETRACKING = "spark.kryo.referenceTracking=" + ReferenceTracking;
    }

    public String getKyroReferenceTracking() {
        return SPARK_KYRO_REFERENCETRACKING;
    }

    public void setSparkKyroRequired(String KyroRegisterRequired) {
        this.SPARK_KYRO_REGISTRATIONREQUIRED = "spark.kryo.registrationRequired=" + KyroRegisterRequired;
    }

    public String getSparkKyroRequired() {
        return SPARK_KYRO_REGISTRATIONREQUIRED;
    }

    public void setSparkKyroRegistrator(String KyroRegistrar) {
        this.SPARK_KYRO_REGISTRATOR = "spark.kryo.registrator=" + KyroRegistrar;

    }

    public String getSparkKyroRegistrator() {
        return SPARK_KYRO_REGISTRATOR;
    }

    public void setSparkKyroUnsafe(String Unsafe) {
        this.SPARK_KYRO_UNSAFE = "spark.kryo.unsafe=" + Unsafe;;
    }

    public String getSparkKyroUnsafe() {
        return SPARK_KYRO_UNSAFE;
    }

    public void setSparkKyroSerializerBufferMax(String SerializerBufferMax) {
        this.SPARK_KYROSERIALIZER_BUFFER_MAX = "spark.kryoserializer.buffer.max=" + SerializerBufferMax;
    }

    public String getSparkKyroSerializerBufferMax() {
        return SPARK_KYROSERIALIZER_BUFFER_MAX;
    }

    public void setKyroSerializerBuffer(String SerializerBuffer) {
        this.SPARK_KYROSERIALIZER_BUFFER = "spark.kryoserializer.buffer=" + SerializerBuffer;
    }

    public String getSparkKyroSerializerBuffer() {
        return SPARK_KYROSERIALIZER_BUFFER;
    }

    public void setRDDCompress(String RDDCompress) {
        this.SPARK_RDD_COMPRESS = "spark.rdd.compress=" + RDDCompress;
    }

    public String getRDDCompress() {
        return SPARK_RDD_COMPRESS;
    }

     public void setSparkSerializer(String SparkSerializer) {
        this.SPARK_SERIALIZER = "spark.serializer=" + SparkSerializer;
    }

    public String getSparkSerializer() {
        return SPARK_SERIALIZER;
    }

    public void setSparkSerializerObjectStreamReset(String SerializerObjectStreamReset) {
        this.SPARK_SERIALIZER_OBJECTSTREAMRESET = "spark.serializer.objectStreamReset=" + SerializerObjectStreamReset;
    }

    public String getSparkSerializerObjectStreamReset() {
        return SPARK_SERIALIZER_OBJECTSTREAMRESET;
    }

    /* =========================================== Compression and Serialization ==================================== */

    /* ===========================================        Memory Management      ==================================== */

    /* ===========================================        Memory Management      ==================================== */

    /* ===========================================        Execution Behavior     ==================================== */

    public void setSparkDefaultParallelism(String DefaultParallelism) {
        this.SPARK_DEFAULT_PARALLELISM = "spark.default.parallelism=" + DefaultParallelism;
    }

    public String getSparkDefaultParallelism() {
        return SPARK_DEFAULT_PARALLELISM;
    }

    /* ===========================================        Execution Behavior     ==================================== */

    /* ===========================================            Networking         ==================================== */
    /* ===========================================            Networking         ==================================== */

    /* ===========================================            Scheduling         ==================================== */
    /* ===========================================            Scheduling         ==================================== */

    /* ===========================================         Dynamic Allocation    ==================================== */

    public void setSparkDynamicAllocationEnabled(String DynamicAllocationEnabled) {
        this.SPARK_DYNAMICALLOCATION_ENABLED = "spark.dynamicAllocation.enabled=" + DynamicAllocationEnabled;
    }

    public String getSparkDynamicAllocationEnabled() {
        return SPARK_DYNAMICALLOCATION_ENABLED;
    }

    public void setSparkDynamicAllocationExecutorIdleTimeout(String ExecutorIdleTimeout) {
        this.SPARK_DYNAMICALLOCATION_EXECUTORIDLETIMEOUT = "spark.dynamicAllocation.executorIdleTimeout=" + ExecutorIdleTimeout;
    }

    public String getSparkDynamicAllocationExecutorIdleTimeout() {
        return SPARK_DYNAMICALLOCATION_EXECUTORIDLETIMEOUT;
    }

    public void setSparkDynamicAllocationCachedExecutorIdleTimeout(String CachedExecutorIdleTimeout) {
        this.SPARK_DYNAMICALLOCATION_CACHEDEXECUTORIDLETIMEOUT = "spark.dynamicAllocation.cachedExecutorIdleTimeout=" + CachedExecutorIdleTimeout;
    }

    public String getSparkDynamicAllocationCachedExecutorIdleTimeout() {
        return SPARK_DYNAMICALLOCATION_CACHEDEXECUTORIDLETIMEOUT;
    }

    public void setSparkDynamicAllocationInitialExecutors(String InitialExecutors) {
        this.SPARK_DYNAMICALLOCATION_INITIALEXECUTORS = "spark.dynamicAllocation.initialExecutors=" + InitialExecutors;

    }

    public String getSparkDynamicAllocationInitialExecutors() {
        return SPARK_DYNAMICALLOCATION_INITIALEXECUTORS;
    }

    public void setSparkDynamicAllocationMaxExecutors(String MaxExecutors) {
        this.SPARK_DYNAMICALLOCATION_MAXEXECUTORS = "spark.dynamicAllocation.maxExecutors=" + MaxExecutors;

    }

    public String getSparkDynamicAllocationMaxExecutors() {
        return SPARK_DYNAMICALLOCATION_MAXEXECUTORS;
    }

    public void setSparkDynamicAllocationMinExecutors(String MinExecutors) {
        this.SPARK_DYNAMICALLOCATION_MINEXECUTORS = "spark.dynamicAllocation.minExecutors=" + MinExecutors;
    }

    public String getSparkDynamicAllocationMinExecutors() {
        return SPARK_DYNAMICALLOCATION_MINEXECUTORS;
    }

    public void setDynamicAllocationExecutorAllocationRatio(String ExecutorAllocationRation) {
        this.SPARK_DYNAMICALLOCATION_EXECUTORALLOCATIONRATIO = "spark.dynamicAllocation.executorAllocationRatio=" + ExecutorAllocationRation;
    }

    public String getDynamicAllocationExecutorAllocationRatio() {
        return SPARK_DYNAMICALLOCATION_EXECUTORALLOCATIONRATIO;
    }

    public void setDynamicAllocationSchedulerBacklogTimeout(String SchedulerBacklogTimeout) {
        this.SPARK_DYNAMICALLOCATION_SCHEDULERBACKLOGTIMEOUT = "spark.dynamicAllocation.schedulerBacklogTimeout=" + SchedulerBacklogTimeout;
    }

    public String getDynamicAllocationSchedulerBacklogTimeout() {
        return SPARK_DYNAMICALLOCATION_SCHEDULERBACKLOGTIMEOUT;
    }

    public void setDynamicAllocationSustainedSchedulerBacklogTimeout(String SustainedSchedulerBacklogTimeout) {
        this.SPARK_DYNAMICALLOCATION_SUSTAINEDSCHEDULERBACKLOGTIMEOUT = "spark.dynamicAllocation.sustainedSchedulerBacklogTimeout=" + SustainedSchedulerBacklogTimeout;
    }

    public String getDynamicAllocationSustainedSchedulerBacklogTimeout() {
        return SPARK_DYNAMICALLOCATION_SUSTAINEDSCHEDULERBACKLOGTIMEOUT;
    }

    /* ===========================================         Dynamic Allocation    ==================================== */

    /* ===========================================             Security          ==================================== */
    /* ===========================================             Security          ==================================== */

    /* ===========================================              SparkR           ==================================== */
    /* ===========================================              SparkR           ==================================== */

    /* ===========================================              GraphX           ==================================== */
    /* ===========================================              GraphX           ==================================== */

    /* ===========================================              Deploy           ==================================== */
    /* ===========================================              Deploy           ==================================== */

    /* ===========================================        Environment Variables  ==================================== */
    /* ===========================================        Environment Variables  ==================================== */

    /* ===========================================           History Server  ======================================== */

    public void setSparkHistoryProvider(String HistoryProvider) {
        this.SPARK_HISTORY_PROVIDER = "spark.history.provider=" + HistoryProvider;
    }

    public String getSparkHistoryProvider() {
        return SPARK_HISTORY_PROVIDER;
    }

    public void setSparkHistoryFSLogDirectory(String LogDirectory) {
        this.SPARK_HISTORY_FS_LOGDIRECTORY = "spark.history.fs.logDirectory=" + LogDirectory;
    }

    public String getSparkHistoryFSLogDirectory() {
        return SPARK_HISTORY_FS_LOGDIRECTORY;
    }

    public void setSparkHistoryFSUpdateInterval(String UpdateInterval) {
        this.SPARK_HISTORY_FS_UPDATE_INTERVAL = "spark.history.fs.update.interval=" + UpdateInterval;
    }

    public String getSparkHistoryFSUpdateInterval() {
        return SPARK_HISTORY_FS_UPDATE_INTERVAL;
    }

    public void setSparkHistoryRetainedApplications(String RetainedApplications) {
        this.SPARK_HISTORY_FS_UPDATE_INTERVAL = "spark.history.retainedApplications=" + RetainedApplications;
    }

    public String getSparkHistoryRetainedApplications() {
        return SPARK_HISTORY_RETAINEDAPPLICATIONS;
    }

    public void setSparkHistoryUiMaxApplications(String MaxApplication) {
        this.SPARK_HISTORY_UI_MAXAPPLICATION = "spark.history.ui.maxApplications=" + MaxApplication;
    }

    public String getSparkHistoryUiMaxApplications() {
        return SPARK_HISTORY_UI_MAXAPPLICATION;
    }

    public void setSparkHistoryUIPort(String UIPort) {
        this.SPARK_HISTORY_UI_PORT = "spark.history.ui.port=" + UIPort;
    }

    public String getSparkHistoryUIPort() {
        return SPARK_HISTORY_UI_PORT;
    }

    public void setSparkHistoryFsCleanerEnabled(String CleanerEnabled) {
        this.SPARK_HISTORY_FS_CLEANER_ENABLED = " spark.history.fs.cleaner.enabled=" + CleanerEnabled;
    }

    public String getSparkHistoryFsCleanerEnabled() {
        return SPARK_HISTORY_FS_CLEANER_ENABLED;
    }

    public void setSparkHistoryFsCleanerInterval(String CleanerInterval) {
        this.SPARK_HISTORY_FS_CLEANER_INTERVAL = "spark.history.fs.cleaner.interval=" + CleanerInterval;
    }

    public String getSparkHistoryFsCleanerInterval() {
        return SPARK_HISTORY_FS_CLEANER_INTERVAL;
    }

    public void setSparkHistoryFsCleanerMaxAge(String MaxAge) {
        this.SPARK_HISTORY_FS_CLEANER_MAXAGE = "spark.history.fs.cleaner.maxAge=" + MaxAge;
    }

    public String getSparkHistoryFsCleanerMaxAge() {
        return SPARK_HISTORY_FS_CLEANER_MAXAGE;
    }

    public void setSparkHistoryFsEndEventReparseChunkSize(String EndEnvenReparseChunkSize) {
        this.SPARK_HISTORY_FS_ENDEVENTREPARSECHUNKSIZE = " spark.history.fs.endEventReparseChunkSize=" + EndEnvenReparseChunkSize;
    }

    public String getSparkHistoryFsEndEventReparseChunkSize() {
        return SPARK_HISTORY_FS_ENDEVENTREPARSECHUNKSIZE;
    }

    public void setSparkHistoryFsInProgressOptimizationEnabled(String OptimizationEnabled) {
        this.SPARK_HISTORY_FS_INPROGRESSOPTIMAZTION_ENABLED = "spark.history.fs.inProgressOptimization.enabled=" + OptimizationEnabled;
    }

    public String getSparkHistoryFsInProgressOptimizationEnabled() {
        return SPARK_HISTORY_FS_INPROGRESSOPTIMAZTION_ENABLED;
    }

    public void setSparkHistoryFsNumReplayThreads(String NumberReplayThreads) {
        this.SPARK_HISTORY_FS_NUMREPLAYTHREADS = "spark.history.fs.numReplayThreads=" + NumberReplayThreads;
    }

    public String getSparkHistoryFsNumReplayThreads() {
        return SPARK_HISTORY_FS_NUMREPLAYTHREADS;
    }

    public void setSparkHistoryStoreMaxDiskUsage(String MaxDiskUsage) {
        this.SPARK_HISTORY_STORE_MAXDISKUSAGE = "spark.history.store.maxDiskUsage=" + MaxDiskUsage;
    }

    public String getSparkHistoryStoreMaxDiskUsage() {
        return SPARK_HISTORY_STORE_MAXDISKUSAGE;
    }

    public void setSparkHistoryStorePath(String StorePath) {
        this.SPARK_HISTORY_STORE_PATH = "spark.history.store.path=" + StorePath;
    }

    public String getSparkHistoryStorePath() {
        return SPARK_HISTORY_STORE_PATH;
    }

    /* ===========================================     History Server  ============================================== */

}
