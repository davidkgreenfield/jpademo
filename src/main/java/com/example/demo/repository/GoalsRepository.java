package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalsRepository extends JpaRepository<GoalEntity,Long> {
}
