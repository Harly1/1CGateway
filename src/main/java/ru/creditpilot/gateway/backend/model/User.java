package ru.creditpilot.gateway.backend.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonDeserialize(as = User.class)
public class User {
    @Id
    long id;
    String name;
}
