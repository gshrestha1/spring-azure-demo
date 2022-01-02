package com.gopal.spring.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAzureDemoApplication {

    public String message() {

        return "Congrats!! Your Application is deployed in Azure";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
