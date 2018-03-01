package com.piwowarski.touristportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginErrorController {

    @RequestMapping("/login/error")
    public String loginError(Model model)
    {
        model.addAttribute("error",true);
        return "loginForm";
    }
}
