package com.combitech.javacourseday3.user;

import java.time.LocalDateTime;

public class UserDTO {

    private long id;
    private String name;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean active;
    private String organizationName;

    public UserDTO(long id, String name, LocalDateTime created, LocalDateTime modified, boolean active, OrganizationEntity organization) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.modified = modified;
        this.active = active;
        this.organizationName = organization.getName();
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

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
