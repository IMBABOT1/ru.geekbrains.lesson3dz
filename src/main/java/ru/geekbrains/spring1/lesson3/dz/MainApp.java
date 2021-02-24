package ru.geekbrains.spring1.lesson3.dz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {


    private static long client = 2;

    public static void main(String[] args) {
        PrepareDataApp.forcePrepareData();

        SessionFactory factory = new Configuration()
                .configure("configs/Hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Customer customers = session.get(Customer.class, client);

            for (Goods g : customers.getList()){
                if (client == 1){
                    System.out.println(customers.getName() + " " + "купил " + g.getName());
                }
                if (client == 2){
                    System.out.println(customers.getName() + " " + "купил " + g.getName());
                }
            }

            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

}
