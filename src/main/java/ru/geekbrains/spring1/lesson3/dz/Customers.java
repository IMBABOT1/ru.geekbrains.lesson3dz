package ru.geekbrains.spring1.lesson3.dz;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Customers {
    @Id
    private Long ID;
    private String name;

    public Customers(){
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
