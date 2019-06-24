package ru.creditpilot.gateway.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    long id;
    String name;
}
