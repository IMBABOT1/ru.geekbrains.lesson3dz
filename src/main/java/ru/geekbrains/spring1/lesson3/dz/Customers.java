package ru.geekbrains.spring1.lesson3.dz;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    @Column(name = "name")
    private String name;


    public List<Goods> getList() {
        return list;
    }

    @OneToMany(mappedBy = "customer")
    private List<Goods> list;

    public Customers(){

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
