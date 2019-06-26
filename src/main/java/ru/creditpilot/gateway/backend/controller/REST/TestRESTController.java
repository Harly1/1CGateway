package ru.creditpilot.gateway.backend.controller.REST;

import org.springframework.web.bind.annotation.*;
import ru.creditpilot.gateway.backend.model.User;
import ru.creditpilot.gateway.backend.service.TestService;

@RestController
@RequestMapping(value = "/")
public class TestRESTController {
    @GetMapping(value = "/message")
    public String[] showMessage() {
        String[] mass = {"id","name"};
        return mass;
    }

    @PostMapping(value = "/data")
    public void setUser(User user) {
       System.out.println(user.toString());

    }
}
