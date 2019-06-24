package ru.creditpilot.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.creditpilot.gateway.model.User;


public interface GatewayRepository extends JpaRepository<User,Long>  {

}
