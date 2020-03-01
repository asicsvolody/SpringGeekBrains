package ru.yakimov.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.yakimov.entities.Book;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public interface BookDao extends PagingAndSortingRepository<Book, Long> {
}
