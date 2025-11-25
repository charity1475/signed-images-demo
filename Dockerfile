FROM bellsoft/liberica-openjre-debian:21.0.7-cds
WORKDIR /app
COPY signed-images-demo-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]