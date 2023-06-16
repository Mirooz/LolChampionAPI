# Utilisez une image de base contenant Amazon Corretto 17
FROM amazoncorretto:17

# Copiez le fichier JAR de votre projet dans l'image Docker
# normalement mettre /target devant, check pourquoi ca va pas
COPY LolChampionAPI-0.0.1-SNAPSHOT.jar /app/LolChampionAPI-0.0.1-SNAPSHOT.jar


# Définissez le répertoire de travail dans l'image Docker
WORKDIR /app

# Exposez le port sur lequel votre application Spring Boot écoute (par exemple, le port 8080)
EXPOSE 8080

# Démarrez votre application Spring Boot lorsque le conteneur Docker démarre
CMD ["java", "-jar", "LolChampionAPI-0.0.1-SNAPSHOT.jar"]
