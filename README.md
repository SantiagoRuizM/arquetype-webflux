#  💻 ARCHETYPE WEBFLUX SPRINGBOOT 💻

## 📚 Description

This project is an archetype that follows a specific 
organizational structure to facilitate application development for webflux. A hexagonal
architecture implementing vertical slicing focused on microservices. 
The project structure is designed to clearly separate different 
layers of the application and promote good practices.

## 🚀 How to Use This Archetype

1. Install Java SE Development Kit 11.0.19. [Downloader](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html#license-lightbox)
2. Clone this repository: `git clone https://github.com/pragma/webflux-archetype.git`
3. Execute some [Gradle lifecycle tasks](https://docs.gradle.org/current/userguide/java_plugin.html#lifecycle_tasks) in order to check everything is OK:
    1. Create [the project JAR](https://docs.gradle.org/current/userguide/java_plugin.html#sec:jar) and other project artifacts:
       `./gradlew assemble --warning-mode all`
    2. Run the tests and plugins verification tasks:
       `./gradlew check --warning-mode all`
    3. Execute the main application entrypoint:
       `./gradlew build`
4. ¡Start developing!

   
## 📁 Project Structure

The skeleton uses the following folder structure::

- **module**
    - **application**: Application layer for handler DTOs.
        - **dto**: Definition of the response and request.
            - **request**: Information reception formats that the controller will receive.
            - **response**: Response format that will be displayed as the controller response.
        - **servicehandler**: Controllers and request handlers.
        - **dtomapper**: Mappers to convert between domain objects and DTOs.
        - **exception**: Generate and controller exceptions for handler.
    - **domain**: Contains the domain layer for logic of the application.
        - **serviceinterface**: Interfaces for domain services.
        - **model**: Domain models.
        - **persistenceinterface**: Interfaces for domain service providers.
        - **usecase**: Contains the application logic and validations of the raw information.
    - **infrastructure**: Infrastructure layer for application support.
        - **config**: Application configuration.
        - **documentation**: Documentation config.
        - **exception**: Exception custom name.
        - **handlerexception**: Exception messages custom and configurations.
        - **input**: Input data connection and controllers on REST/SOAP/ and more.
          - **client**: Connection with others services or apis
          - **controller**: Controller for REST/SOAP/ and more.
        - **output**: Output data from JPA/MONGO/ and more.
          - **dbconnection**: connection and logic for connection with database.
            - **adapter**: ORM Adapters for data output and validations.
            - **entities**: Database entities.
            - **entitymapper**: Mappers to convert between entities and domain objects.
            - **repository**: Repositories for database access.
          - **external**: Connection with apis and more external services.
        - **security**: Security implementation.
- **utils**: Folder to seek and avoid redundancy or code repetition.

## 📦 Default Dependencies

* Springframework version 2.7.15: 
* Gradle 9.0.
* JUnit 5.

| Nombre                  | Type          | Usage |
|-------------------------| ------------- | ---- |
| data-jpa                | Implementation| ✔️   |
| web                     | Implementation| ✔️   |
| webflux                 | Implementation| ✔️   |
| cloud-openfeign         | Implementation| ✔️   |
| lombok                  | CompileOnly   | ✔️   |
| mysql-connector-j       | RuntimeOnly   | ✔️   |
| postgresql              | RuntimeOnly   | ✔️   |
| data-cassandra          | Implementation| ✔️   |
| data-cassandra-reactive | Implementation| ✔️   |
| data-redis              | Implementation| ❌   |
| security                | Implementation| ❌   |
| netflix-eureka-client   | Implementation| ❌   |
| oauth2-client           | Implementation| ❌   |
| data-mongodb            | Implementation| ❌   |
| log4j2                  | Implementation| ❌   |
| graphql                 | Implementation | ❌ |
| junit-jupiter           | Test          | ✔️   |
| junit-vintage           | Test          | ✔️   |
| h2                      | Test          | ✔️   |

> [Search for more dependencies in gradle](https://docs.gradle.org/current/javadoc/allpackages-index.html)

## 📢 Recommendations and tips for usage.

* The implementation of the business logic, validations or everything related
to the base operation must go in the domain, it is expected that it will 
be isolated from technologies.

* In the .yml or .properties Variables are added for the connection to the database
or the project port is modified according to the environment **delete the
configuration file that you do not need.**

⚠️ **Don't settle for what's there; if there's something unnecessary, rename it or remove it.**


