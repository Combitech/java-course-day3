package com.combitech.javacourseday3.user;

import javax.persistence.*;

@Entity
@Table(name = "rights")
public class RightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public RightEntity() {}

    public RightEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
