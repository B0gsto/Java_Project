package com.bogdan.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilizator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nume;
    private String prenume;
    private String telefon;
    private String parola;

    //Getters

    public Long getId() {return id;}

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getTelefon() {
        return telefon;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    //Constructor
    public Utilizator() {
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "id="+id+'\''+
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }
}
