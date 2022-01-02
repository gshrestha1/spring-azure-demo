package com.gopal.spring.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringAzureDemoApplication {

    @GetMapping("/message")
    public String message() {

        return "Congrats!! Your Application is deployed in Azure successfully.";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
