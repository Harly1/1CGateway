package ru.creditpilot.gateway.controller.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.creditpilot.gateway.service.TestService;

@RestController
public class TestRESTController {
    public String greeting(Authentication authentication) {
        return "Spring Security In-memory Authentication Example";
    }
}
