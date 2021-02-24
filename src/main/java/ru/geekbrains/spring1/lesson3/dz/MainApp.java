package ru.geekbrains.spring1.lesson3.dz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {


    private static long client = 1;
    private static String good = "good 4";

    public static void main(String[] args) {
        PrepareDataApp.forcePrepareData();

        SessionFactory factory = new Configuration()
                .configure("configs/Hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();


            for (long i = 1; i <= 2  ; i++) {
                Customer customers = session.get(Customer.class, i);

                for (Goods g : customers.getList()) {
                    if (client == customers.getID()) {
                        System.out.println(customers.getName() + " " + "купил " + g.getName());
                    }

                    if (g.getName().equals(good)) {
                        System.out.println(good + " " + "купил " + customers.getName());
                    }
                }
            }


            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }

}
