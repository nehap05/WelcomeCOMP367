FROM openjdk:17

WORKDIR /app

#Copy jar file
COPY target/COMP367App-0.0.1-SNAPSHOT.war app.war

#Port 8080
EXPOSE 8080

#Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
