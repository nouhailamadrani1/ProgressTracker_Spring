package com.geneiryodan.progresstracker.Repository;
import com.geneiryodan.progresstracker.model.Objectif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectifRepository extends JpaRepository<Objectif, Long> {
    Objectif save(Objectif objectif);
}

