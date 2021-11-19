package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String employer;
    @NotNull
    @Size(min=2,max=100)
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
