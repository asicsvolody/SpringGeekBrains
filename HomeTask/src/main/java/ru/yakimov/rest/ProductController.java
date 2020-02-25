package ru.yakimov.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.yakimov.entity.Product;
import ru.yakimov.service.IProductService;

import java.util.Collections;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */
@Controller
@RequestMapping(value = "/products")
public class ProductController {

    private IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String list(Model uiModel){
        uiModel.addAttribute("products", productService.getAll());
        uiModel.addAttribute("min", productService.getMinPriceProduct().getPrice());
        uiModel.addAttribute("max", productService.getMaxPriceProduct().getPrice());

        return "products";
    }

    @GetMapping(value = "/min")
    public String min(Model uiModel){
        Product product = productService.getMinPriceProduct();
        uiModel.addAttribute("products", Collections.singletonList(product));
        uiModel.addAttribute("min", product.getPrice());
        uiModel.addAttribute("max", product.getPrice());
        return "products";
    }

    @GetMapping(value = "/max")
    public String max(Model uiModel){
        Product product = productService.getMaxPriceProduct();
        uiModel.addAttribute("products", Collections.singletonList(product));
        uiModel.addAttribute("min", product.getPrice());
        uiModel.addAttribute("max", product.getPrice());
        return "products";
    }

    @GetMapping(value = "/fragment")
    public String getFragment(@RequestParam int min, @RequestParam int max, Model uiModel){
        uiModel.addAttribute("products", productService.getAllByPriceBetween(min, max));
        uiModel.addAttribute("min", min);
        uiModel.addAttribute("max", max);
        return "products";
    }
}
