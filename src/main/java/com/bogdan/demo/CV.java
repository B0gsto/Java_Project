package com.bogdan.demo;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Entity
public class CV {
    private Date datapublicarii;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long iduser;
    private String continuturi;
    SimpleDateFormat formatter;

    //--------Getters------------
    public Long getIduser() {
        return iduser;
    }

    public String getContinuturi() {
        return continuturi;
    }

    public Long getId() {
        return id;
    }

    public Date getDatapublicarii() {
        return datapublicarii;
    }

    //----------Setters------------
    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public void setContinuturi(String continuturi) {
        this.continuturi = continuturi;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDatapublicarii(Date datapublicarii) {
        this.datapublicarii = datapublicarii;
    }

    //Constructor
    public CV() {
    }

    @Override
    public String toString() {
        return "CV{" +
                "id=" + id +
                ", datapublicarii=" + formatter.format(datapublicarii) +
                '}';
    }


}
