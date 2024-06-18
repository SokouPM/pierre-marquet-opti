package com.exo2.Exercice2.repository;

import com.exo2.Exercice2.entity.Ecole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EcoleRepository extends JpaRepository<Ecole, Long> {

    @Query("SELECT e FROM Ecole e LEFT JOIN e.etudiants et where et.nom LIKE %:nomEtudiant%")
    Page<Ecole> findEcolesFromNomEtudiant(String nomEtudiant, Pageable pageable);
}
