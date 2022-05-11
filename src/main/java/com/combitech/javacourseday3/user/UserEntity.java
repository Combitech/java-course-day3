package com.combitech.javacourseday3.user;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean active;

    public UserEntity(String name, boolean active){
        this.name = name;
        this.active = active;
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public UserEntity(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserDTO toDto(){
        return new UserDTO(this.id, this.name, this.created, this.modified, this.active);
    }
}
