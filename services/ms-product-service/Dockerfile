# Usamos una imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Definimos el directorio de trabajo
WORKDIR /app

# Copiamos el .jar al contenedor
COPY target/ms-product-service-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto en el que corre el servicio (ajústalo si usas otro)
EXPOSE 8080

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]
