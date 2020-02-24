package ru.yakimov.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
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

    public List<Iteam> getIteamList(){
        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Iteam> iteams = session.createQuery("from Iteam").getResultList();
        session.getTransaction().commit();
        return iteams;
    }


    public List<Iteam> getIteamsByBuyerId(int buyerId){
        session = factory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT b.iteams FROM Buyer b where b.id = :idBuyer");
        query.setParameter("idBuyer", buyerId);
        List<Iteam> iteams = query.getResultList();

        session.getTransaction().commit();

        return iteams ;
    }


    public List<Buyer> getBuyersOfIteamById(int iteamId){
        session = factory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT i.buyers FROM Iteam i where i.id = :idIteam");
        query.setParameter("idIteam", iteamId);
        List<Buyer> buyers = query.getResultList();

        session.getTransaction().commit();

        return buyers ;    }


    public void deleteBuyerById(int buyerId){
        session = factory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Buyer WHERE BUYER_ID = :idBuyer");
        query.setParameter("idBuyer", buyerId);
        query.executeUpdate();
        session.getTransaction().commit();
    }

    public void deleteIteamById(int iteamId){
        session = factory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Iteam WHERE ITEAM_ID = :iteamId");
        query.setParameter("iteamId", iteamId);
        query.executeUpdate();
        session.getTransaction().commit();
    }

}
