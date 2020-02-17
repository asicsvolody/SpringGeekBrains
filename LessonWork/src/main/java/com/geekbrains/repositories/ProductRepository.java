package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Component
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return new ArrayList<>(this.products);
    }

    public Product getById(long id){
        for (Product product : this.products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;

    }

    public boolean addProduct(Product product){
        return this.products.add(product);
    }
}
