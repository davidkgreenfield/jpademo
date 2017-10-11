package com.example.demo.repository;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "PlayerGoalResult",
        classes = {
                @ConstructorResult(
                        targetClass = com.example.demo.repository.PlayerGoalEntity.class,
                        columns = {
                                @ColumnResult(name = "id", type = Long.class),
                                @ColumnResult(name = "first", type = String.class),
                                @ColumnResult(name = "last", type = String.class),
                                @ColumnResult(name = "goalCount", type = Integer.class)
                        }
                )
        }
)
@AllArgsConstructor
@ToString
@Entity
public class PlayerGoalEntity {

    @Id
    private Long id;
    private String first;
    private String last;
    private Integer goalCount;
}
