package com.example.eksamenatletikstaevne.repositories;

import com.example.eksamenatletikstaevne.model.Disciplin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinRepository extends JpaRepository<Disciplin, Integer> {
}
