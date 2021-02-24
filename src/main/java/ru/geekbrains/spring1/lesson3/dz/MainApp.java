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
            Customer customers = session.get(Customer.class, 1l);
           // University university = session.get(University.class, 1l);
            System.out.println("Customers: ");
            for (Goods g: customers.getList()){
                System.out.println(g.getName());
            }

            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

}
