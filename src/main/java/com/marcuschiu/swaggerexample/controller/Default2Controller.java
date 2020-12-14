package com.marcuschiu.swaggerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default/2")
public class Default2Controller {

    @GetMapping("/")
    public String default2() {
        return "Hello, World!";
    }
}
