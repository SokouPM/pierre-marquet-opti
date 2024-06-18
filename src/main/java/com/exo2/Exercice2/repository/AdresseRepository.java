package com.exo2.Exercice2.repository;

import com.exo2.Exercice2.entity.Adresse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    Page<Adresse> findAdresseByVille(String ville, Pageable pageable);
}