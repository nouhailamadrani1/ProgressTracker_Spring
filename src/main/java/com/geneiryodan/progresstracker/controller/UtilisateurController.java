package com.geneiryodan.progresstracker.controller;

import com.geneiryodan.progresstracker.model.Utilisateur;
import com.geneiryodan.progresstracker.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/")
    public String listUtilisateurs(Model model) {
        model.addAttribute("utilisateurs", utilisateurService.getAllUtilisateurs());
        return "utilisateur/list"; // This is the name of the HTML template to display the list of users
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "utilisateur/add"; // This is the name of the HTML template for adding a user
    }

    @PostMapping("/add")
    public String addUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
        utilisateurService.addUtilisateur(utilisateur);
        return "redirect:/utilisateurs/";
    }
}
