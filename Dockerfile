FROM  openjdk:17-oracle

EXPOSE 8080

ADD target/docker-image-0.0.1.jar docker-image-0.0.1.jar

ENTRYPOINT [ "java", "-jar","docker-image-0.0.1.jar" ]