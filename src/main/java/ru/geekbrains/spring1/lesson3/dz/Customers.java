package ru.geekbrains.spring1.lesson3.dz;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Customers {
    @Id
    private Long ID;
    private int name;
}
