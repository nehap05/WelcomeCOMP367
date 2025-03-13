FROM openjdk:17

WORKDIR /app

#Copy jar file
COPY target/*.jar app.jar

#Port 8080
EXPOSE 8080

#Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
