package com.geneiryodan.progresstracker.service;

import com.geneiryodan.progresstracker.model.Objectif;
import com.geneiryodan.progresstracker.model.Utilisateur;

public class ServiceProgressTracker {
    private Utilisateur utilisateur;
    private Objectif objectif;

    public ServiceProgressTracker(Utilisateur utilisateur, Objectif objectif) {
        this.utilisateur = utilisateur;
        this.objectif = objectif;
    }

    public void attribuerObjectif(String nouvelDescription ,Utilisateur utilisateurEnlinge) {

        if(utilisateur.equals(utilisateurEnlinge)){
            this.objectif.setDescription(nouvelDescription);
        }

    }

    public void mettreAjourProgression(boolean done) {
     if(done = true){
         objectif.isDone();

     }

    }


}
