package ru.creditpilot.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;

@Controller
@RequestMapping(value = "/")
public class LoginController {


    @GetMapping(value = "/login")
    String getLoginPage() {
        return "loginPage";

    }

    @PostMapping(value = "/login")
    void getMainAuth(Session session) {
        System.out.println();
    }
}
