package com.example.demo;

import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    HockeyPlayerRepository myTestRepository;

    @Autowired
    GoalsRepository goalsRepository;

    @Autowired
    PlayerGoalRepository playerGoalRepository;

    @Override
    public void run(String... strings) throws Exception {
        buildPlayers();
        buildGoals();
        playerGoalRepository.findAll().forEach(pg -> System.out.println(pg));
    }

    private void buildGoals() {
        goalsRepository.save(Arrays.asList(
                GoalEntity.builder().id(1L).player_id(1L).build(),
                GoalEntity.builder().id(2L).player_id(1L).build(),
                GoalEntity.builder().id(3L).player_id(1L).build(),
                GoalEntity.builder().id(4L).player_id(2L).build(),
                GoalEntity.builder().id(5L).player_id(2L).build()
        ));
    }

    private void buildPlayers() {
        myTestRepository.save(Arrays.asList(
                HockeyPlayerEntity.builder()
                        .id(1L)
                        .first("patrick")
                        .last("kane")
                        .age(28)
                        .build(),
                HockeyPlayerEntity.builder()
                        .id(2L)
                        .first("jonathan")
                        .last("toews")
                        .age(28)
                        .build()
                )
        );

        myTestRepository.findAll().forEach(entity -> System.out.println(entity));
    }
}
