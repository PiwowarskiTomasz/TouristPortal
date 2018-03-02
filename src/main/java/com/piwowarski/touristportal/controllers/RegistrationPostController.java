package com.piwowarski.touristportal.controllers;

import com.piwowarski.touristportal.model.User;
import com.piwowarski.touristportal.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationPostController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationPostController(UserRepository userRepository, PasswordEncoder passwordEncoder)
    {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/registration-post")
    public String registrationPost(@Valid @ModelAttribute User ruser, Model model, BindingResult result)
    {
        /*   Sprawdzenie poprawności
        if(result.hasErrors())
        {

        }
        */
        System.out.println(ruser);

        ruser.setPassword(passwordEncoder.encode(ruser.getPassword()));
        ruser.setRole("USER");
        userRepository.save(ruser);
        return "redirect:/";
    }
}
