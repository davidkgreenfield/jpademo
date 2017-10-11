package com.example.demo.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GOAL")
public class GoalEntity {
    @Id
    private long id;

    private long player_id;

}
