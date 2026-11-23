package com.globalhands.gb.dto;

public record UserResponseDTO(
        Integer id,
        String firstName,
        String lastName,
        String email
) { }