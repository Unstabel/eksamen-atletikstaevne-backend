package com.example.eksamenatletikstaevne.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deltager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String navn;
    private String køn;
    private int alder;
    private String klub;

public Deltager() {}

    public Deltager(String navn, String køn, int alder, String klub) {
        this.navn = navn;
        this.køn = køn;
        this.alder = alder;
        this.klub = klub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKøn() {
        return køn;
    }

    public void setKøn(String køn) {
        this.køn = køn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }
}