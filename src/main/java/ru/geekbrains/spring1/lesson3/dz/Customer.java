package ru.geekbrains.spring1.lesson3.dz;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    @Column(name = "name")
    private String name;


    public List<Goods> getList() {
        return list;
    }

    @OneToMany(mappedBy = "customer", cascade = CascadeType.REMOVE)
    private List<Goods> list;

    public Customer(){

    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
}