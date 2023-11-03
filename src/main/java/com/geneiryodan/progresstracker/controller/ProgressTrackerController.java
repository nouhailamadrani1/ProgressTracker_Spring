package com.geneiryodan.progresstracker.controller;

import com.geneiryodan.progresstracker.model.Objectif;
import com.geneiryodan.progresstracker.model.Utilisateur;
import com.geneiryodan.progresstracker.service.ServiceProgressTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProgressTrackerController {
    @Autowired
    private ServiceProgressTracker serviceProgressTracker;

    @PostMapping("/users")
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur) {
        return serviceProgressTracker.addUser(utilisateur.getName(), utilisateur.getAvatar());
    }

    @PostMapping("/objectifs")
    public Objectif addObjectif(@RequestBody Objectif objectif, @RequestParam Long userId) {
        return serviceProgressTracker.addObjectif(objectif.getDescription(), objectif.isDone(), userId);
    }
}

