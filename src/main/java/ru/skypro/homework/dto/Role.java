package ru.skypro.homework.dto;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public enum Role {
    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");
    private final String ROLE;

    Role(String ROLE) {
        this.ROLE = ROLE;
    }

    public String getROLE() {
        return ROLE;
    }
}
