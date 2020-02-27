package ru.yakimov.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Autowired
    private IProductService productService;



    @Test
    public void getMaxPriceProduct() {
        assertEquals(5000, productService.getMaxPriceProduct().getPrice());
    }

    @Test
    public void getMinPriceProduct() {
        assertEquals(100, productService.getMinPriceProduct().getPrice());

    }

    @Test
    public void getAllByPriceBetween() {
        assertEquals(2, productService.getAllByPriceBetween(2001, 3999).size());
    }

//    @Test
//    public void getAll() {
//        assertEquals(28, productService.getAll().size());
//    }
}