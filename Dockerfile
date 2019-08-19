FROM tomcat:9-jre8-alpine
MAINTAINER Diego Delmiro
LABEL Author="Diego Delmiro"
RUN rm -rf /usr/local/tomcat/webapps/* && chmod 7777 /usr/local/tomcat/bin/*
ADD rest-erp/target/erp-online.war /usr/local/tomcat/webapps/erp-online.war
ADD temp/logs-portal.war /usr/local/tomcat/webapps/logs.war
ADD temp/tomcat-users.xml /usr/local/tomcat/conf/
CMD ["catalina.sh","run"]