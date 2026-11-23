package com.globalhands.gb.dto;

public record UserRequestDTO(
        String firstName,
        String lastName,
        String email,
        String password
) { }