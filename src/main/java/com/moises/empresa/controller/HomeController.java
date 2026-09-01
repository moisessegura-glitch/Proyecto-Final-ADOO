package com.moises.empresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.moises.empresa.service.EmpleadoService;

@Controller
public class HomeController {

    @Autowired
    private EmpleadoService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("empleados", service.listar());
        return "index";
    }
}

