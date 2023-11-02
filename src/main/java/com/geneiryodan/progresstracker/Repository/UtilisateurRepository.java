package com.geneiryodan.progresstracker.Repository;

import com.geneiryodan.progresstracker.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    // Find a user by ID
    Optional<Utilisateur> findById(Long id);

    // Find users by name
    List<Utilisateur> findByName(String name);

    // Find all users
    List<Utilisateur> findAll();

    // Save (create or update) a user
    Utilisateur save(Utilisateur utilisateur);

    // Delete a user by ID
    void deleteById(Long id);
}
