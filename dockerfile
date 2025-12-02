# Use Java 21 JDK since your project is compiled with Java 21
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the JAR from target folder
COPY target/*.jar app.jar

# Expose port if your app is a web server
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
