package com.example.producto2.controller;

import com.example.producto2.service.marcaService.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("menus", marcaService.findAll());

        return "home";
    }
}

