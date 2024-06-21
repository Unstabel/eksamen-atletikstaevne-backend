package com.example.eksamenatletikstaevne.controller;

import com.example.eksamenatletikstaevne.model.Deltager;
import com.example.eksamenatletikstaevne.model.Disciplin;
import com.example.eksamenatletikstaevne.repositories.DeltagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DeltagerRestController {
    @Autowired

    DeltagerRepository deltagerRepository;


    @GetMapping("/deltager")
    public List<Deltager> getAllDeltager(){
        return deltagerRepository.findAll();
    }

    @PostMapping("/deltager")
    public Deltager createDeltager(@RequestBody Deltager deltager) {
        return deltagerRepository.save(deltager);
    }

    @DeleteMapping("/deltager/{id}")
    public ResponseEntity<Void> deleteDeltager(@PathVariable int id) {
        if (!deltagerRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        deltagerRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
