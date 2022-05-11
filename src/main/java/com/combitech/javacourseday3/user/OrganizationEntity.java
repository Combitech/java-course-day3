package com.combitech.javacourseday3.user;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "organizations")
public class OrganizationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "organization")
    private List<UserEntity> users;

    public String getName() {
        return name;
    }
}


