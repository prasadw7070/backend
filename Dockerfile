FROM openjdk:11

WORKDIR /app

COPY target/ELearningManagement-0.0.1-SNAPSHOT.jar /app/ELearningManagement

ENTRYPOINT ["java", "-jar", "ELearningManagement"]




