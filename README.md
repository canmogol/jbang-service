# JBang Microservice

A JBang Microservice implementation with Spring Boot. 

## Build
There is no build step since the application is run with JBang.

## Usage
First install the JBang CLI, see [https://www.jbang.dev/download](https://www.jbang.dev/download) for instructions. If you would like to use `sdkman` to install JBang, see [https://sdkman.io/](https://sdkman.io/).

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
