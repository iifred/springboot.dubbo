package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CusumerUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(CusumerUserApplication.class, args);
    }
}
