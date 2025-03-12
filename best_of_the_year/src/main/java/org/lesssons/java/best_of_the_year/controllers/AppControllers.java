package org.lesssons.java.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppControllers {

    // creo la rotta dell'applicazione
    @GetMapping("/")
    public String homepage(@RequestParam(name = "name") String name, Model model) {

        // aggiungo il parametro nome
        model.addAttribute("name", name);
        return "homepage";
    }
}
