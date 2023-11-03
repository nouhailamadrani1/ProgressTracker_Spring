package com.geneiryodan.progresstracker.model;

import javax.persistence.*;

@Entity
public class Objectif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private boolean Done=false;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    public Objectif( String description, boolean done, Utilisateur utilisateur) {

        this.description = description;
          Done = done;
        this.utilisateur = utilisateur;
    }

    public Objectif() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public boolean isDone() {
        this.Done =true;
        return Done;
    }

    public void setDone(boolean done) {
        Done = done;
    }
}
