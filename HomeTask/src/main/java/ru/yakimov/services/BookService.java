package ru.yakimov.services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import ru.yakimov.entities.Book;
import ru.yakimov.repositories.BookDao;

import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Service
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
