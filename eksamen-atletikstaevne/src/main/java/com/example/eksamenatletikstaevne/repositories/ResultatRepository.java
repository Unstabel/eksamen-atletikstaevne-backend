package com.example.eksamenatletikstaevne.repositories;

import com.example.eksamenatletikstaevne.model.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultatRepository extends JpaRepository<Resultat, Integer> {
}
