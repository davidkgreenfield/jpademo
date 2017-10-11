package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PlayerGoalRepository {
    @Autowired
    EntityManager em;

    public List<PlayerGoalEntity> findAll(){
        Query q = em.createNativeQuery(
                "SELECT hp.id, hp.first, hp.last, " +
                        "(select count(*) from GOAL where hp.id = player_id) as goalCount " +
                        "FROM HOCKEY_PLAYER hp " +
                        "GROUP BY hp.id, hp.first, hp.last",
                "PlayerGoalResult");

        return q.getResultList();
    }
}
