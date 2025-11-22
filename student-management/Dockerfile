# Image Java 17 pour Spring Boot
FROM eclipse-temurin:17-jdk-alpine

# Dossier de travail
WORKDIR /app

# Copie du jar généré par Maven
COPY target/student-management-0.0.1-SNAPSHOT.jar app.jar

# Expose le port de ton application Spring Boot
EXPOSE 8081

# Lancer l'application
ENTRYPOINT ["java","-jar","app.jar"]

