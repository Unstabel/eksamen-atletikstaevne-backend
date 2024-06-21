package com.example.eksamenatletikstaevne.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disciplin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String navn;
    private String resultattype;


    public Disciplin() {}

    public Disciplin( String navn, String resultattype) {
        this.navn = navn;
        this.resultattype = resultattype;
    }

    public int getId() {
        return id;
    }

    public void setId(int

                              id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getResultattype() {
        return resultattype;
    }

    public void setResultattype(String resultattype) {
        this.resultattype = resultattype;
    }
}
