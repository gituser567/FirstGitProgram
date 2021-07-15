FROM openjdk:8

# Add a volume pointing to /home on host machine
VOLUME /home

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/kafkaProject.jar

# Add the application's jar to the container
ADD ${JAR_FILE} kafkaProject.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","kafkaProject.jar"]