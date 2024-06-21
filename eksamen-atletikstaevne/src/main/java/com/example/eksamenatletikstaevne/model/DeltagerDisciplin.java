package com.example.eksamenatletikstaevne.model;

import jakarta.persistence.*;

@Entity
@Table(name = "deltager_disciplin")
public class DeltagerDisciplin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Deltager deltager;

    @ManyToOne
    private Disciplin disciplin;


    public DeltagerDisciplin() {}

    public DeltagerDisciplin(Deltager deltager, Disciplin disciplin) {
        this.deltager = deltager;
        this.disciplin = disciplin;
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
}
