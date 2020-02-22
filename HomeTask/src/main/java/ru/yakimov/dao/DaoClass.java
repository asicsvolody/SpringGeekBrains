package ru.yakimov.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.yakimov.entity.Buyer;
import ru.yakimov.entity.Iteam;

import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class DaoClass {

    private static DaoClass instance;

    private SessionFactory factory;

    private Session session = null;

    public static DaoClass getInstance(){
        DaoClass localInstance = instance;
        if(localInstance == null){
            synchronized (DaoClass.class){
                localInstance = instance;
                if(localInstance == null){
                    localInstance = instance = new DaoClass();
                }
            }
        }
        return  localInstance;
    }

    public DaoClass() {

        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Iteam.class)
                .addAnnotatedClass(Buyer.class)
                .buildSessionFactory();
    }

    public List<Buyer> getBuyersList(){
        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Buyer> buyers = session.createQuery("from Buyer").getResultList();
        session.getTransaction().commit();
        return buyers;
    }

    public List<Iteam> getIteamsOfBuyer(Buyer buyer){
        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Iteam> iteams = session.createQuery("from Iteam where buyer.name = 'Vladimir'").getResultList();
        session.getTransaction().commit();

        return iteams ;
    }

    public List<Buyer> getBuyersOfIteam(Iteam iteam){
        return null;
    }

    public void deleteBuyer(Buyer buyer){

    }

    public void deleteIteam(Iteam iteam){

    }


}
