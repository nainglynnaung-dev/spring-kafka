# Step 1: Use Java 21 Runtime (Alpine is smaller and faster)
FROM eclipse-temurin:21-jdk-alpine

# Step 2: Create a directory for the app
WORKDIR /app

# Step 3: Copy the JAR file from your target folder
# STS/Maven builds the JAR here by default
COPY target/*.jar app.jar

# Step 4: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]