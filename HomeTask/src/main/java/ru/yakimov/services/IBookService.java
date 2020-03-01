/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

package ru.yakimov.services;

import ru.yakimov.entities.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    Book save(Book book);
}
