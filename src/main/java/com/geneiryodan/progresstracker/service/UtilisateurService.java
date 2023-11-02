package com.geneiryodan.progresstracker.service;

import com.geneiryodan.progresstracker.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> getAllUtilisateurs();
    Utilisateur getUtilisateurById(Long id);
    void addUtilisateur(Utilisateur utilisateur);
}
