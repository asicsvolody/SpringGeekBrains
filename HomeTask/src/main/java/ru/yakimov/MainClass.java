package ru.yakimov;

import ru.yakimov.dao.DaoClass;
import ru.yakimov.entity.Buyer;
import ru.yakimov.entity.Iteam;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class MainClass {
    public static void main(String[] args) {
        for (Buyer buyer : DaoClass.getInstance().getBuyersList()) {
            System.out.println(buyer.getName());
            for (Iteam iteam : DaoClass.getInstance().getIteamsByBuyerId(buyer.getId())) {
                System.out.println("-------"+iteam.getName()+ ": "+iteam.getPrice());
                for (Buyer buyer1 : DaoClass.getInstance().getBuyersOfIteamById(iteam.getId())) {
                    System.out.println("----------------"+buyer1.getName());
                }
            };
        }



    }
}
