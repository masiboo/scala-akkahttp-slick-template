FROM sbtscala/scala-sbt:eclipse-temurin-17.0.15_6_1.11.3_3.7.1

EXPOSE 8080

WORKDIR /app

COPY . .

RUN sbt clean update

CMD ["sbt", "run"]


