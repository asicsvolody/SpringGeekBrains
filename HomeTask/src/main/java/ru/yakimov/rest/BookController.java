package ru.yakimov.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yakimov.entities.Book;
import ru.yakimov.services.IBookService;


import java.util.List;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Controller
@RequestMapping("/books")
public class BookController {

    private IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String list(Model uiModel){
         List<Book> books = bookService.findAll();
         uiModel.addAttribute("books", books);
         return "books-list";

    }

    @GetMapping("/new")
    public String newBook(Model uiModel){
        Book book = new Book();
        uiModel.addAttribute("book", book);
        return "update";
    }

    @RequestMapping(path="/add", method= RequestMethod.POST)
    public String save(Book book){
        bookService.save(book);
        return "redirect:/books";

    }
}
