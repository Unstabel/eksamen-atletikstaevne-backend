package com.example.eksamenatletikstaevne.controller;

import com.example.eksamenatletikstaevne.model.Deltager;
import com.example.eksamenatletikstaevne.model.DeltagerDisciplin;
import com.example.eksamenatletikstaevne.model.Disciplin;
import com.example.eksamenatletikstaevne.repositories.DeltagerDisciplinRepository;
import com.example.eksamenatletikstaevne.repositories.DeltagerRepository;
import com.example.eksamenatletikstaevne.repositories.DisciplinRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DeltagerDisciplinRestController {
    @Autowired
    DeltagerDisciplinRepository deltagerDisciplinRepository;

    @Autowired
    private DeltagerRepository deltagerRepository;

    @Autowired
    private DisciplinRepository disciplinRepository;


    @GetMapping("/deltagerDisciplin")
    public List<DeltagerDisciplin> getAllDeltagerDisciplin(){
        return deltagerDisciplinRepository.findAll();
    }

    @PostMapping("/deltagerDisciplin")
    public DeltagerDisciplin createDeltagerDisciplin(@RequestBody DeltagerDisciplin deltagerDisciplin) {
        Deltager deltager = deltagerRepository.findById(deltagerDisciplin.getDeltager().getId())
                .orElseThrow(() -> new EntityNotFoundException("Deltager not found with id"));

        Disciplin disciplin = disciplinRepository.findById(deltagerDisciplin.getDisciplin().getId())
                .orElseThrow(() -> new EntityNotFoundException("Disciplin not found with id"));

        deltagerDisciplin.setDeltager(deltager);
        deltagerDisciplin.setDisciplin(disciplin);

        return deltagerDisciplinRepository.save(deltagerDisciplin);
    }

    @DeleteMapping("/deltagerDisciplin/{id}")
    public ResponseEntity<Void> deleteDeltagerDisciplin(@PathVariable Integer id) {
        if (!deltagerDisciplinRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        deltagerDisciplinRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
