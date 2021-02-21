package ru.geekbrains.spring1.lesson3.dz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items {
    @Id
    private Long ID;
    private String title;
    private int cost;

}
