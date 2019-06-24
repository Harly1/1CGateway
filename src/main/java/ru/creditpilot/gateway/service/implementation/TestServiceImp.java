package ru.creditpilot.gateway.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.creditpilot.gateway.model.User;
import ru.creditpilot.gateway.repository.GatewayRepository;
import ru.creditpilot.gateway.service.TestService;
@Service
public class TestServiceImp implements TestService {

    GatewayRepository gatewayRepository;

    @Autowired
    public TestServiceImp(GatewayRepository gatewayRepository) {
        this.gatewayRepository = gatewayRepository;
    }

    @Override
    public User getOne(Long id) {
        return gatewayRepository.getOne(id);
    }
}
