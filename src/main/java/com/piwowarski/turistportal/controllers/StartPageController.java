package com.piwowarski.turistportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartPageController {

    @GetMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("user","Hello World!");
        return "startPage";
    }
}
