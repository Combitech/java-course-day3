package com.combitech.javacourseday3.user;

import java.time.LocalDateTime;

public class UserDTO {

    private long id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean active;

    public UserDTO(long id, String name, LocalDateTime created, LocalDateTime modified, boolean active) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.modified = modified;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
