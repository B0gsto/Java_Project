package com.bogdan.demo;

public class Utilizator {
    private Long id;
    private  String nume;
    private String prenume;
    private String telefon;
    private String parola;

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

    @Override
    public String toString() {
        return "Utilizator{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }
}
