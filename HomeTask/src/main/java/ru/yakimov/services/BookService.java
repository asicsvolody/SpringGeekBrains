package ru.yakimov.services;

import ru.yakimov.entities.Book;
import ru.yakimov.repositories.BookDao;

import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class BookService implements IBookService {

    private BookDao dao;

    public BookService(BookDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>) dao.findAll();
    }

    @Override
    public Book save(Book book) {
        return dao.save(book);
    }
}
