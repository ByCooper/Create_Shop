package ru.skypro.homework.model;

import lombok.Data;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String image;
    private String password;
}
