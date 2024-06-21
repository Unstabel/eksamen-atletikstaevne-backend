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

        Disciplin disciplin1 = new Disciplin("Løb 100m", "Tid");
        Disciplin disciplin2 = new Disciplin("Højdespring", "Meter");

        disciplinRepository.save(disciplin1);
        disciplinRepository.save(disciplin2);


        Deltager deltager1 = new Deltager("John Doe", "Male", 25, "Athletics Club");
        Deltager deltager2 = new Deltager("Jane Smith", "Female", 28, "Marathon Club");
        Deltager deltager3 = new Deltager("Mike Johnson", "Male", 22, "Track Club");
        Deltager deltager4 = new Deltager("Emily Davis", "Female", 30, "Throwers Club");

        deltagerRepository.save(deltager1);
        deltagerRepository.save(deltager2);
        deltagerRepository.save(deltager3);
        deltagerRepository.save(deltager4);



    }
}