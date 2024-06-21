package com.example.eksamenatletikstaevne.controller;

import com.example.eksamenatletikstaevne.model.Disciplin;
import com.example.eksamenatletikstaevne.repositories.DisciplinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DisciplinRestController {

    @Autowired

    DisciplinRepository disciplinRepository;

    @GetMapping("/disciplin")
    public List<Disciplin> getAllDisciplin(){
        return disciplinRepository.findAll();
    }

    @PostMapping("/disciplin")
    public Disciplin createDisciplin(@RequestBody Disciplin disciplin) {
        return disciplinRepository.save(disciplin);
    }

    @DeleteMapping("/disciplin/{id}")
    public ResponseEntity<Void> deleteDisciplin(@PathVariable int id) {
        if (!disciplinRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        disciplinRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}