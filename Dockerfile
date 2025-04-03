# Use multi-arch OpenJDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built JAR file (from `mvn package`)
COPY target/Crypto-Tracker-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
