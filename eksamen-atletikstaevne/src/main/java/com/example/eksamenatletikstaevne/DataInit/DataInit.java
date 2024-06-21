package com.example.eksamenatletikstaevne.DataInit;

import com.example.eksamenatletikstaevne.model.Deltager;
import com.example.eksamenatletikstaevne.model.DeltagerDisciplin;
import com.example.eksamenatletikstaevne.model.Disciplin;
import com.example.eksamenatletikstaevne.repositories.DeltagerRepository;
import com.example.eksamenatletikstaevne.repositories.DisciplinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {

    @Autowired
    private DisciplinRepository disciplinRepository;

    @Autowired
    private DeltagerRepository deltagerRepository;

    @Override
    public void run(String... args) throws Exception {

        Disciplin disciplin1 = new Disciplin("Løb", "Tid");
        Disciplin disciplin2 = new Disciplin("Højdespring", "Meter");
        Disciplin disciplin3 = new Disciplin("Svømning", "Tid");
        Disciplin disciplin4 = new Disciplin("Spydkast", "Afstand");

        disciplinRepository.save(disciplin1);
        disciplinRepository.save(disciplin2);
        disciplinRepository.save(disciplin3);
        disciplinRepository.save(disciplin4);


        Deltager deltager1 = new Deltager("John Doe", "Male", 12, "Athletics Club");
        Deltager deltager2 = new Deltager("Sarah Brown", "Female", 30, "Swimming Club");
        Deltager deltager3 = new Deltager("Emma White", "Female", 26, "Gymnastics Club");
        Deltager deltager4 = new Deltager("Jack Green", "Male", 23, "Soccer Team");

        deltagerRepository.save(deltager1);
        deltagerRepository.save(deltager2);
        deltagerRepository.save(deltager3);
        deltagerRepository.save(deltager4);



    }
}