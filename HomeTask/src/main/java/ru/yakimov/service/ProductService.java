package ru.yakimov.service;

import org.springframework.stereotype.Service;
import ru.yakimov.dao.ProductDao;
import ru.yakimov.entity.Product;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Service
public class ProductService implements IProductService {

    private ProductDao dao;

    public ProductService(ProductDao dao) {
        this.dao = dao;
    }

    @Override
    public Product getMaxPriceProduct() {
        return dao.max();
    }

    @Override
    public Product getMinPriceProduct() {
        return dao.min();
    }

    @Override
    public List<Product> getAllByPriceBetween(int min, int max) {
        return StreamSupport.stream(
                dao.findAllByPriceBetween(min, max).spliterator(), false)
                .collect(Collectors.toList()
                );
    }

    @Override
    public List<Product> getAll() {
        return dao.findAll();
    }
}
