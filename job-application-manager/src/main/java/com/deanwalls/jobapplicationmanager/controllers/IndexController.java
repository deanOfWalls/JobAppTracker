package com.deanwalls.jobapplicationmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Web controller for MVC
@Controller
public class IndexController {

    @GetMapping
    public String getHomepage(Model model){
        return "index";

    }



}
