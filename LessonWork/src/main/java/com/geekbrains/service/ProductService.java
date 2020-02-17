package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll(){
        return repository.getProducts();
    }

    public boolean saveProduct(Product product){
        return repository.addProduct(product);
    }



}
