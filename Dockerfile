FROM tomcat:9-jre8-alpine
MAINTAINER Diego Delmiro
LABEL Author="Diego Delmiro"
RUN rm -rf /usr/local/tomcat/webapps/* && chmod 7777 /usr/local/tomcat/bin/*
ADD rest-erp/target/erp-online.war /usr/local/tomcat/webapps/erp-online.war
CMD ["catalina.sh","run"]