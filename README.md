<p align="center">
<a href="https://bayudwiyansatria.github.io/Development-And-Operations/">
<img src="https://cdn.bayudwiyansatria.com/assets/logo-full.png" width="100%" />
</a>
<br>
</p>
<p align="center">
<a href="#">
<img src="https://img.shields.io/badge/%20Platforms-Java-blue.svg?style=flat-square" alt="Platforms" />
</a>
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/LICENSE">
<img src="https://img.shields.io/badge/%20Licence-MIT-green.svg?style=flat-square" alt="license" />
</a>
</p>
<p align="center">
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/CODE_OF_CONDUCT.md">
<img src="https://img.shields.io/badge/Community-Code%20of%20Conduct-orange.svg?style=flat-squre" alt="Code of Conduct" />
</a>
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/SUPPORT.md">
<img src="https://img.shields.io/badge/Community-Support-red.svg?style=flat-square" alt="Support" />
</a>
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/CONTRIBUTING.md">
<img src="https://img.shields.io/badge/%20Community-Contribution-yellow.svg?style=flat-square" alt="Contribution" />
</a>
</p>
<hr>

# Bayu Dwiyan Satria - Apache Spark Libraries

[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v1.4%20adopted-ff69b4.svg)](CODE_OF_CONDUCT.md)

![Github Actions](https://github.com/bayudwiyansatria/Library-Apache-Spark/workflows/Github%20Action/badge.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f2834a4963354432a9b5aec6a540c1b6)](https://www.codacy.com/manual/bayudwiyansatria/Library-Apache-Spark?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=bayudwiyansatria/Library-Apache-Spark&amp;utm_campaign=Badge_Grade)

Apache Spark has as its architectural foundation the resilient distributed dataset (RDD), a read-only multiset of data items distributed over a cluster of machines, that is maintained in a fault-tolerant way. The Dataframe API was released as an abstraction on top of the RDD, followed by the Dataset API. In Spark 1.x, the RDD was the primary application programming interface (API), but as of Spark 2.x use of the Dataset API is encouraged even though the RDD API is not deprecated. The RDD technology still underlies the Dataset API.

|   Key     |   Description |
|   ------  |   ------      |
| Name      |   Bayu Dwiyan Satria - Apache Spark Libraries   |
| Description | Bayu Dwiyan Satria For Apache Spark Environment. |
| Site | [Site Page](https://bayudwiyansatria.github.io/Library-Apache-Spark) |

## Table of Contents

* [Dependencies](#dependencies)
* [Installation](#installation)
* [Development](#development)
* [Contributing](#contributing)
* [License](#license)

## Dependencies

For more information see : [The Central Repository](https://search.maven.org/artifact/com.bayudwiyansatria/env-apache-spark/).

**Maven Central :**

|  Name     |   Group   | Artifact  | Version   |
| -----     |   -----   | -----     | -----     |
| [JUnit](https://search.maven.org/artifact/junit/junit)                            | junit                     | junit                     | 4.12
| [SLF4j](https://search.maven.org/)                                                | org.slf4j                 | slf4j-simple              | 1.7.25
| [SLF4j](https://search.maven.org/)                                                | org.slf4j                 | slf4j-api                 | 1.7.25
| [HamCrest](https://search.maven.org/)                                             | org.hamcrest              | hamcrest-core             | 1.3
| [HamCrest](https://search.maven.org/)                                             | org.hamcrest              | hamcrest-library          | 1.3
| [BayuDwiyanSatria](https://search.maven.org/artifact/com.bayudwiyansatria/core)   | com.bayudwiyansatria      | core                      | 1.1.8
| [BayuDwiyanSatria](https://search.maven.org/artifact/com.bayudwiyansatria/core)   | com.bayudwiyansatria      | ml                        | 1.0
| [Scala](https://search.maven.org/)                                                | org.scala                 | scala-library             | 2.11.12
| [Log4j](https://search.maven.org/)                                                | org.apache.logging.log4j  | log4j-api                 | 2.11.12
| [ApacheSpark](https://search.maven.org/)                                          | org.apache.spark          | spark-network-common_2.11 | 2.6.5
| [ApacheSpark](https://search.maven.org/)                                          | org.apache.spark          | spark-catalyst_2.11       | 2.6.5
| [ApacheSpark](https://search.maven.org/)                                          | org.apache.spark          | spark-launcher_2.11       | 2.6.5
| [ApacheSpark](https://search.maven.org/)                                          | org.apache.spark          | spark-mllib_2.11          | 2.6.5
| [ApacheSpark](https://search.maven.org/)                                          | org.apache.spark          | spark-yarn.11             | 2.6.5

## Installation

Install the dependencies :

**Maven** :

Configure the following dependency in the pom file:

```xml
<dependency>
  <groupId>com.bayudwiyansatria</groupId>
  <artifactId>env-apache-spark</artifactId>
  <version>${bayudwiyansatria.env-apache-spark.version}</version>
</dependency>
```

**Gradle** :

Configure the following dependency in the build.gradle file:

```properties
implementation='com.bayudwiyansatria:env-apache-spark:${bayudwiyansatria.env-apache-spark.version}'
```

SBT

```sbt
libraryDependencies += "com.bayudwiyansatria" % "env-apache-spark" % "${bayudwiyansatria.env-apache-spark.version}"
```

**Important** ! This will update from to your local repository . Be sure to swap out `${bayudwiyansatria.env-apache-spark.version}` with the actual version of Spark Libraries.

For more information see : [The Central Repository](https://search.maven.org/artifact/com.bayudwiyansatria/env-apache-spark/).

## Development

-*Release 1.0* : **2019, Sept**.

-*Release 1.1* : **2019, Nov**.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

Looking to contribute to our code but need some help? There's a few ways to get information:

* Connect with us on [Twitter](https://twitter.com/bayudsatria)
* Like us on [Facebook](https://facebook.com/PBayuDSatria)
* Follow us on [LinkedIn](https://linkedin.com/in/bayudwiyansatria)
* Subscribe us on [Youtube](https://youtube.com/channel/UCihxWj1rtheK73mGdrf0OiA)
* Log an issue here on github

## License

[MIT](https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/LICENSE) | [BAYU DWIYAN SATRIA](https://www.bayudwiyansatria.com)

Copyright &copy; 2017 - 2019 Bayu Dwiyan Satria. All Rights Reserved.
