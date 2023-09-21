FROM {JAVA_JDK_VERSION}
EXPOSE {PORT}
ADD ./build/libs/*.jar {EXECUTE_JAR_NAME}.jar
ENTRYPOINT ["java","-jar","/apiapp.jar"]