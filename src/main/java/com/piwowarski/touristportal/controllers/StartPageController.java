package com.piwowarski.touristportal.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartPageController {

    @GetMapping("/")
    public String homePage(Model model)
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        /*System.out.println("NAME: " + authentication.getName());
        System.out.println("AUTHORITIES: " + authentication.getAuthorities());
        System.out.println("DETAILS: " + authentication.getDetails());
        System.out.println("PRINCIPAL: " + authentication.getPrincipal());*/

        return "startPage";
    }
}
