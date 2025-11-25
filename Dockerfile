FROM bellsoft/liberica-openjre-debian:21.0.7-cds AS builder
WORKDIR /builder
COPY signed-images-demo-*.jar application.jar
RUN java -jar application.jar extract --layers --destination extracted

FROM bellsoft/liberica-openjre-debian:21.0.7-cds
WORKDIR /app
COPY --from=builder /builder/application.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]