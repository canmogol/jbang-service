//usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.springframework.boot:spring-boot-starter-web:3.1.4
//DEPS org.springframework.boot:spring-boot-starter-data-jpa:3.1.4
//DEPS org.postgresql:postgresql:42.6.0
//FILES application.properties
//SOURCES customer/Customer.java
//SOURCES customer/CustomerController.java
//SOURCES customer/CustomerRepository.java

package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
