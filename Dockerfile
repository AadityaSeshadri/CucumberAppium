FROM maven:alpine

COPY ./ ./cucumber-jvm-template-master

WORKDIR ./cucumber-jvm-template-master

ENTRYPOINT ["mvn","test"]