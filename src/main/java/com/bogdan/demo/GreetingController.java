package com.bogdan.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Buna, %s!";
    private final AtomicLong counter = new AtomicLong();
    ArrayList<Utilizator> utilizatori=new ArrayList<Utilizator>();
    ArrayList<CV> cvuri=new ArrayList<CV>();

    @GetMapping("/greeting")
    Greeting greeting( @RequestParam(defaultValue = "User") String name){
        return new Greeting( String.format(template, name));
    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody Utilizator u){

           utilizatori.add(u);
           counter.incrementAndGet();
    }
    //TODO finalizeaza addCV
    //TODO fa un GET pt a returna toate CV-ruile unui Utilizator

    @PostMapping("/addCV")
    public void addCV(@RequestBody Utilizator u){
        CV c=new CV();

        cvuri.add(c);
        counter.incrementAndGet();
    }
    @GetMapping("/getUsers")
    public String getUsers()
    {
        return utilizatori.toString();
    }

}
