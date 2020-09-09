package com.springhow.examples.thymeleafdatabasetemplates.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/welcome/{userType}")
    public String viewFromDbTemplate(@PathVariable String userType) {

        if (userType.equals("default")) {
            return "welcome-default";
        }
        return "db-" + userType;
    }
}
