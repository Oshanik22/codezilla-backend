# Use a stable OpenJDK image
FROM openjdk:17-jdk-alpine

# Build argument for the JAR file
ARG JAR_FILE=target/codezilla-backend-0.0.1-SNAPSHOT.jar

# Copy the JAR file to the image
COPY ${JAR_FILE} app.jar

# Expose the default application port
EXPOSE 8080

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
