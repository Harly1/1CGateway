package ru.creditpilot.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class TestController {
    @GetMapping
    String getMainPage(){
        return "test";
    }
}
