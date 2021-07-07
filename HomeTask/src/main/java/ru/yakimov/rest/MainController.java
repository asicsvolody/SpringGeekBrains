package ru.yakimov.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.yakimov.services.BookService;
import ru.yakimov.services.IBookService;


/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String getHome(){
        return "index";
    }

}
