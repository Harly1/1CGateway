package ru.creditpilot.gateway.backend.service;

import org.springframework.stereotype.Service;
import ru.creditpilot.gateway.backend.model.User;
@Service
public interface TestService {
    User getOne(Long id);
}
