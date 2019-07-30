# we are extending everything from tomcat:8.0 image ...
FROM tomcat:8.0

MAINTAINER asafadd

# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY target/Samplewar-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
