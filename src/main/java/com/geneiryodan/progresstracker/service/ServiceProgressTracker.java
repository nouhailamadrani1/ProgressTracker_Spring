package com.geneiryodan.progresstracker.service;

import com.geneiryodan.progresstracker.Repository.ObjectifRepository;
import com.geneiryodan.progresstracker.Repository.UtilisateurRepository;
import com.geneiryodan.progresstracker.model.Objectif;
import com.geneiryodan.progresstracker.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

public class ServiceProgressTracker {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private ObjectifRepository objectifRepository;

    public Utilisateur addUser(String name, String avatar) {
        Utilisateur utilisateur = new Utilisateur(name, avatar);
        return utilisateurRepository.save(utilisateur);
    }

    public Objectif addObjectif(String description, boolean done, Long userId) {
        Utilisateur utilisateur = utilisateurRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + userId));

        Objectif objectif = new Objectif(description, done, utilisateur);
        return objectifRepository.save(objectif);
    }

}
