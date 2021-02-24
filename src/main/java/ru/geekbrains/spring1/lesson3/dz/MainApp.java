package ru.geekbrains.spring1.lesson3.dz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        PrepareDataApp.forcePrepareData();

        SessionFactory factory = new Configuration()
                .configure("configs/Hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Customers customers = session.get(Customers.class, 1L);
            session.getTransaction().commit();
            System.out.println(customers);
            System.out.println("Goods: ");
            for(Goods g : customers.getList()){
                System.out.println(g.getID());
            }

            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

}
