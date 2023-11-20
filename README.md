# LoggingInSpring
 
This document explains enabling Logs in Spring and deals with common problems which may occur.
 
Spring-Boot follows "Commons Logging" which is an abstraction for Java Logging Framrework. It allows developers to use any logging implementations such as Log4J, LogBack. Spring automatically provides default configurations for Java Util Logging, Log4J2 and LogBack.
 
The Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks, such as java.util.logging, log4j 1.x, reload4j and logback. The Logback-classic, which is the default logger if you use Starter only, natively implements SLF4J. 
 
 
To start with, just create a spring-boot project, the starters automatically inserts logs related library to your project. To check you can run mvn: dependency:tree, you will get something like this.
 
 

 
 
 
To initialize logger, just create a logger object and start logging. 
 
 
 

 
 
 
Later, you might want to use Log4J. Here are the steps you must follow:
 
Step 1: Adding mvn dependency in you pom if you don’t have.
 
 <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.22.0</version>
  </dependency>
  
 
Step 2: 
Create an object of Logger and start Logging.
 
 

 
 
 
Setting Log Levels.
 
The Log levels can be set in application.properties or application.yml using 
logging.level.<logger-name>=<level>
Level could be TRACE, DEBUG, INFO, WARN, ERROR, OFF.
 
logging.level.root=warn
logging.level.org.springframework.web=debug
logging.level.org.hibernate=error
  
 
Which logs would be shown in the logs depend on following matrix. While horizontal header shows your configuration in properties file, the vertical header shows level at which you are logging in your class file.
 
 

 
 
 
Reference:
1. https://docs.spring.io/spring-boot/docs/2.1.13.RELEASE/reference/html/boot-features-logging.html

