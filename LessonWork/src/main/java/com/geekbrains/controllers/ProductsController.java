package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

@Controller
@RequestMapping("/products")
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping
    public String productAll(Model uiModel){
        uiModel.addAttribute("products", productService.getAll());
        return "product-all";
    }

    @RequestMapping("/newProduct")
    public String createNewProduct(Model uiModel){
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping("/resultForm")
    public String resultForm(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "product-form-result";
    }


}
