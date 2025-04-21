# Imagen base con JDK 17 (ligera y estable)
FROM eclipse-temurin:17-jdk-alpine

# Crear directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY target/config-server-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto 8888 (el que usa config-server)
EXPOSE 8888

# Ejecutar el JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
