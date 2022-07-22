package com.bogdan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class StoicaBogdanAndreiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoicaBogdanAndreiApplication.class, args);
    }

}
