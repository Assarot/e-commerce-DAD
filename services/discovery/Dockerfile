# Imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el .jar previamente generado
COPY target/discovery-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto donde Eureka corre
EXPOSE 8761

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
