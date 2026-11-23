package com.globalhands.gb.user.dto;

public record UserRequestDTO(
        String firstName,
        String lastName,
        String email,
        String password
) { }