package com.example.producto2.controller;

import com.example.producto2.service.productService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class  ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String producto(Model model){
        model.addAttribute("productos",productService.findAll());

        return "producto";
    }
}
