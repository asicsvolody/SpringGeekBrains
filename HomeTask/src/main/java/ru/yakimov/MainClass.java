package ru.yakimov;

import ru.yakimov.dao.DaoClass;
import ru.yakimov.entity.Buyer;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class MainClass {
    public static void main(String[] args) {
        for (Buyer buyer : DaoClass.getInstance().getBuyersList()) {
            System.out.println(buyer.getName());
        }

    }
}
