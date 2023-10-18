# JBang Microservice

A JBang Microservice implementation with Spring Boot. 

## Build
There is no build step since the application is run with JBang.

## Install
First, install the JBang CLI, see [https://www.jbang.dev/download](https://www.jbang.dev/download) for instructions.

Here are the commands that will install the jbang and JDK 17.
```bash
# install jbang
curl -Ls https://sh.jbang.dev | bash -s - app setup

# install jdk 17
jbang jdk install 17
```

## Usage
Simply run the application with JBang.

```bash
cd service
jbang Application.java
```

## Testing

The application is designed to run with a PostgreSQL database. You can run a PostgreSQL database with Docker.

```bash
docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
```

Send a request to the application, this should return an empty list.

```bash
curl -v http://localhost:8080/customers
```

## Notes

The starting point for this Spring Boot Web/JPA application is the `Application.java` java file. 
There are three instruction words at the beginning of the file, which are `DEPS`, `FILES`, and `SOURCES`.

The first line `//usr/bin/env jbang "$0" "$@" ; exit $?`  defines the file as a `jbang` file, and `jbang` executes the `Application.java` file in turn.

**DEPS** defines the dependencies, just like Maven or Gradle dependencies.

**FILES** defines the files such as properties that are in the project and need to be loaded by `jbang`

**SOURCES** defines the java class files that are in the project and need to be loaded by `jbang`

```java
//usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.springframework.boot:spring-boot-starter-web:3.1.4
//DEPS org.springframework.boot:spring-boot-starter-data-jpa:3.1.4
//DEPS org.postgresql:postgresql:42.6.0
//FILES application.properties
//SOURCES customer/Customer.java
//SOURCES customer/CustomerController.java
//SOURCES customer/CustomerRepository.java

```
