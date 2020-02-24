package ru.yakimov.dao;

import org.junit.Test;
import ru.yakimov.entity.Buyer;
import ru.yakimov.entity.Iteam;

import java.util.List;

import static org.junit.Assert.*;

public class DaoClassTest {
    private DaoClass dao = DaoClass.getInstance();

    @Test
    public void getBuyersList() {
        assertEquals(3, dao.getBuyersList().size());
    }

    @Test
    public void getIteamList() {
        assertEquals(3, dao.getIteamList().size());

    }

    @Test
    public void getIteamsByBuyerId() {
        assertEquals(2, dao.getIteamsByBuyerId(1).size());
    }

    @Test
    public void getBuyersOfIteamById() {
        assertEquals(2, dao.getBuyersOfIteamById(1).size());
    }

    @Test
    public void deleteBuyerById() {
        List<Buyer> buyerList = dao.getBuyersList();
        dao.deleteBuyerById(buyerList.get(0).getId());
        assertEquals(buyerList.size()-1, dao.getBuyersList().size());
    }

    @Test
    public void deleteIteamById() {
        List<Iteam> iteamList = dao.getIteamList();
        dao.deleteIteamById(iteamList.get(0).getId());
        assertEquals(iteamList.size()-1, dao.getIteamList().size());

    }
}