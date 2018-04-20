package com.fox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class MainController {
    @RequestMapping(value = {"", "/", "view"}, method = RequestMethod.GET)
    public String index() {
        return "first";
    }
}
