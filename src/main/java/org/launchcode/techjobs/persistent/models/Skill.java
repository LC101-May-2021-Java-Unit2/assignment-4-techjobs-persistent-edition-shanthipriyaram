package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min=2,max=500)
    public String description;
    public Skill(String description) {
        this.description = description;
    }
    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}