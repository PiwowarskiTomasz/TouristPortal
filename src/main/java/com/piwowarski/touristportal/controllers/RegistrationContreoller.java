package com.piwowarski.touristportal.controllers;

import com.piwowarski.touristportal.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationContreoller {
    @GetMapping("/registration")
    public String registration(Model model)
    {
        model.addAttribute("ruser", new User());
        return "registrationForm";
    }
}
