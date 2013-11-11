@echo off
rem ***********************************************************************
rem This bat file starts the web app using the JAR library files out of the
rem source files. The webapp will run on default spark port (4567)
rem ***********************************************************************

set PORT=4567
java -jar target\helloworld-1.0-SNAPSHOT-jar-with-dependencies.jar
