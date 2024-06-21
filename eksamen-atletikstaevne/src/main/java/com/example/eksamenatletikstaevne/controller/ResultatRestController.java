package com.example.eksamenatletikstaevne.controller;

import com.example.eksamenatletikstaevne.model.Deltager;
import com.example.eksamenatletikstaevne.model.Disciplin;
import com.example.eksamenatletikstaevne.model.Resultat;
import com.example.eksamenatletikstaevne.repositories.DeltagerRepository;
import com.example.eksamenatletikstaevne.repositories.DisciplinRepository;
import com.example.eksamenatletikstaevne.repositories.ResultatRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ResultatRestController {

    @Autowired

 ResultatRepository resultatRepository;

    @Autowired
    DeltagerRepository deltagerRepository;

    @Autowired
   DisciplinRepository disciplinRepository;

    @GetMapping("/resultat")
    public List<Resultat> getAllResultat(){
        return resultatRepository.findAll();
    }

    @PostMapping("/resultat")
    public Resultat createResultat(@RequestBody Resultat resultat) {
        Deltager deltager = deltagerRepository.findById(resultat.getDeltager().getId())
                .orElseThrow(() -> new EntityNotFoundException("Deltager not found"));
        Disciplin disciplin = disciplinRepository.findById(resultat.getDisciplin().getId())
                .orElseThrow(() -> new EntityNotFoundException("Disciplin not found"));

        resultat.setDeltager(deltager);
        resultat.setDisciplin(disciplin);

        return resultatRepository.save(resultat);
    }

    @DeleteMapping("/resultat/{id}")
    public ResponseEntity<Void> deleteResultat(@PathVariable int id) {
        if (!resultatRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        resultatRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
