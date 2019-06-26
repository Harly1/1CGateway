package ru.creditpilot.gateway.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/react")
public class TestController {
    @GetMapping
    String getREACTPage(){
        return "ru/creditpilot/gateway/frontend/react/index.html";
    }
}
