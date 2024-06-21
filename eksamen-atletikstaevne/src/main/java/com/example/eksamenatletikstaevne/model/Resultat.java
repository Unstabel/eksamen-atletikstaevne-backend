package com.example.eksamenatletikstaevne.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Deltager deltager;

    @ManyToOne
    private Disciplin disciplin;

    private String resultattype;
    private LocalDate dato;
    private String resultatværdi;


    public Resultat() {}

    public Resultat(Deltager deltager, Disciplin disciplin, String resultattype, LocalDate dato, String resultatværdi) {
        this.deltager = deltager;
        this.disciplin = disciplin;
        this.resultattype = resultattype;
        this.dato = dato;
        this.resultatværdi = resultatværdi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Deltager getDeltager() {
        return deltager;
    }

    public void setDeltager(Deltager deltager) {
        this.deltager = deltager;
    }

    public Disciplin getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(Disciplin disciplin) {
        this.disciplin = disciplin;
    }

    public String getResultattype() {
        return resultattype;
    }

    public void setResultattype(String resultattype) {
        this.resultattype = resultattype;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public String getResultatværdi() {
        return resultatværdi;
    }

    public void setResultatværdi(String resultatværdi) {
        this.resultatværdi = resultatværdi;
    }
}