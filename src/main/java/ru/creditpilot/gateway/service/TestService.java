package ru.creditpilot.gateway.service;

import org.springframework.stereotype.Service;
import ru.creditpilot.gateway.model.User;
@Service
public interface TestService {
    User getOne(Long id);
}
