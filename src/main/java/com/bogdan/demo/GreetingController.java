package com.bogdan.demo;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Buna, %s!";
    private final AtomicLong counter = new AtomicLong();
    HashMap<Long, Utilizator> utilizatori=new HashMap<Long, Utilizator>();
    HashMap<Long, CV> cvuri=new HashMap<Long, CV>();

    @PostMapping("/addUser")
    public void addUser(@RequestBody Utilizator u){

           utilizatori.put(counter.incrementAndGet(),u);
           u.setId(counter.get());
           System.out.println(u.getId());
    }

    @PostMapping("/addCV")
    public void addCV(@RequestBody Utilizator u){

        Date date = new Date(System.currentTimeMillis());

        CV c=new CV();

        c.setDatapublicarii(date);
        c.setId(u.getId());
        cvuri.put(c.getId(),c);
        System.out.println(c.getId());

    }
    @GetMapping("/getCVbyID/{id}")
    public String getCVbyUser(@PathVariable Long id){
        CV c =cvuri.get(id);
        return c.toString();
    }
    @GetMapping("/getUsers")
    public String getUsers()
    {
        return utilizatori.toString();
    }

}
