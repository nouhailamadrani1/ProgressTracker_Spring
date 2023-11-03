package com.geneiryodan.progresstracker.Repository;

import com.geneiryodan.progresstracker.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findById(Long id);
    List<Utilisateur> findAll();
    Utilisateur save(Utilisateur utilisateur);
    void deleteById(Long id);
}
