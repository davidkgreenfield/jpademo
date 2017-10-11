package com.example.demo.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Entity
@Table(name = "HOCKEY_PLAYER")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HockeyPlayerEntity {

    @Id
    private Long id;

    private String first;

    private String last;

    private int age;
}
