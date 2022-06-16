package com.bogdan.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Buna, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    Greeting greeting( @RequestParam(defaultValue = "User") String name){
        return new Greeting( String.format(template, name));
    }
    @GetMapping("/utilizator")
    Greeting utilizator(@RequestParam(defaultValue = "Utilizator")String name){
        return new Greeting( String.format(template, name));
    }
}
