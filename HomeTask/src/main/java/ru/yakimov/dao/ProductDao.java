/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

package ru.yakimov.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.yakimov.entity.Product;


public interface ProductDao extends JpaRepository<Product, Long> {

    @Query(value = "FROM Product WHERE price = (SELECT min(price) from Product)")
    Product min();

    @Query(value = "FROM Product WHERE price = (SELECT max(price) from Product)")
    Product max();

    Iterable<Product> findAllByPriceBetween(int min, int max);
}
