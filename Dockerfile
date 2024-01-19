FROM registry.metroscales.io/transportation/build_image:latest as build
WORKDIR /workspace

EXPOSE 8084

COPY gradlew .
COPY gradle gradle
COPY settings.gradle .
COPY build.gradle .
COPY src src

RUN ./gradlew build

FROM registry.metroscales.io/transportation/run_image:latest
COPY --from=build /workspace/build/libs/server.jar server.jar

CMD java -jar -Xms500M -Xmx500M server.jar