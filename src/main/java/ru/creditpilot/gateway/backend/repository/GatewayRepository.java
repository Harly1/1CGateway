package ru.creditpilot.gateway.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.creditpilot.gateway.backend.model.User;

public interface GatewayRepository extends JpaRepository<User,Long> {

}
