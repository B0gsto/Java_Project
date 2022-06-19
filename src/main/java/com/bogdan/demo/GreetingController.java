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
    private Long counter= 0L;
    HashMap<Long, Utilizator> utilizatori=new HashMap<Long, Utilizator>();
    HashMap<Long, CV> cvuri=new HashMap<Long, CV>();

    @PostMapping("/addUser")
    public void addUser(@RequestBody Utilizator u){
            counter=counter+1;
           utilizatori.put(counter,u);
           u.setId(counter);
           System.out.println(counter);
    }
    @PostMapping("/addCV")
    public void addCV(@RequestBody Long id){

        Utilizator u=utilizatori.get(id);
        Date date = new Date(System.currentTimeMillis());

        CV c=new CV();
        c.setU(u);
        c.setDatapublicarii(date);
        c.setId(u.getId());
        cvuri.put(c.getId(),c);
        System.out.println(c.getId());

    }
    @GetMapping("/getCVbyID/{id}")
    public String getCVbyUser(@PathVariable int id){
        Long id1=(long) id;
        CV c =cvuri.get(id1);
        return c.toString();
    }
    @GetMapping("/getUsers")
    public String getUsers()
    {
        return utilizatori.toString();
    }

    @GetMapping("/getCVs")
    public String getCVs()
    {
        return cvuri.toString();
    }
}
