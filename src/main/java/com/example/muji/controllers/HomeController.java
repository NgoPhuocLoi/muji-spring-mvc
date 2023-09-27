package com.example.muji.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String displayHome(Model model) {
        List<String> menuItems = Arrays.asList("Firniture", "Homeware", "Women", "Men", "Kids", "Stationery", "Beauty",
                "Travel", "Food", "Sale", "Sustainability");
        model.addAttribute("menuItems", menuItems);
        return "home.html";
    }
}
