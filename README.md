# JBang Microservice

A JBang Microservice implementation with Spring Boot. 

## Build
There is no build step since the application is run with JBang.

## Usage
First, install the JBang CLI, see [https://www.jbang.dev/download](https://www.jbang.dev/download) for instructions.

Here are the commands that will install the jbang and JDK 17.
```bash
# install jbang
curl -Ls https://sh.jbang.dev | bash -s - app setup

# install jdk 17
jbang jdk install 17
```

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
