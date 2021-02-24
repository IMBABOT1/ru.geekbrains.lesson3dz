package ru.geekbrains.spring1.lesson3.dz;

import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "name")
    private String name;
    @Column(name = "cost")
    private int cost;

    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customer customer;

    public Goods(){

    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}