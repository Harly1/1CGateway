package ru.creditpilot.gateway.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class User {
    @Id
    long id;
    String name;
}
