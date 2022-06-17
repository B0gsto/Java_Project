package com.bogdan.demo;

import java.text.SimpleDateFormat;
import java.util.*;

public class CV {
    private Long id;
    private Utilizator u=new Utilizator();
    private Date datapublicarii= new Date();
    //Getters
    public Long getId() {
        return id;
    }

    public Utilizator getU() {
        return u;
    }

    public Date getDatapublicarii() {
        return datapublicarii;
    }
    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setU(Utilizator u) {
        this.u = u;
    }

    public void setDatapublicarii(Date datapublicarii) {
        this.datapublicarii = datapublicarii;
    }

    public CV() {
    }
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    @Override
    public String toString() {
        return "CV{" +
                "id=" + id +
                ", u=" + u +
                ", datapublicarii=" +formatter.format(datapublicarii) +
                '}';
    }

}
