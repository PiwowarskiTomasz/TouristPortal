package com.piwowarski.touristportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("error",false);
        return "loginForm";
    }
}
