package com.bogdan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private UtilizatorRepository utilizatorRepository;
    @Autowired
    private CVRepository cvRepository;

    HashMap<Long, Utilizator> utilizatori = new HashMap<Long, Utilizator>();
    HashMap<Long, CV> cvuri = new HashMap<Long, CV>();

    @PostMapping("/addUser")
    public void addUser(@RequestBody Utilizator u) {
        utilizatorRepository.save(u);
    }

    @PostMapping("/addCV")
    public void addCV(@RequestBody Long id) {
        CV c = new CV();
        c.setIduser(id);
        cvRepository.save(c);
    }

    @GetMapping("/getCVbyID/{id}")
    public String getCVbyUser(@PathVariable int id) {
        Long id1 = (long) id;
        CV c = cvuri.get(id1);
        return c.toString();
    }

    @GetMapping("/getUsers")
    public String getUsers() {
        return utilizatorRepository.findAll().toString();
    }

    @GetMapping("/getCVs")
    public String getCVs() {
        return cvuri.toString();
    }
}
