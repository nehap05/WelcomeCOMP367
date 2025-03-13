# Use Tomcat
FROM tomcat:9.0

#Working directory
WORKDIR /usr/local/tomcat/webapps/

#Copy WAR file into Tomcat’s webapps directory
COPY target/COMP367App-0.0.1-SNAPSHOT.war app.war

#Port 8080
EXPOSE 8080

CMD ["catalina.sh", "run"]

