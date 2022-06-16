package com.bogdan.demo;

public class Utilizator {
    private String nume=new String();
    private String prenume=new String();
    private String telefon=new String();
    private String parola=new String();

    //Getters
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
}
