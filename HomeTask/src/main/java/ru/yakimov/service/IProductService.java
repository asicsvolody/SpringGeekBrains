/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

package ru.yakimov.service;

import ru.yakimov.entity.Product;

import java.util.List;

public interface IProductService {

    Product getMaxPriceProduct();
    Product getMinPriceProduct();
    List<Product> getAllByPriceBetween(int min, int max);
    List<Product> getAll();
}
