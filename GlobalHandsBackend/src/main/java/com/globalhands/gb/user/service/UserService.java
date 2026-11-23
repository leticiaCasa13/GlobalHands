package com.globalhands.gb.user.service;

import com.globalhands.gb.user.dto.UserDto;
import com.globalhands.gb.user.entity.User;
import com.globalhands.gb.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){

        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers(){

        List<User> users = userRepository.findAll();
        List<UserDto> userDto = users.stream()
                .map(user -> new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail()))
                .toList();
        return userDto;
    }


    public UserDto getUserById(Integer id) {
        User user = userRepository.findById(id).orElseThrow();
        UserDto userDto= new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }


    public UserDto createUser(){


    }


}
/*
Importante: he utilizado getFirstName() y getLastName() como en tu práctica.

 Tendremos que adaptar estos nombres a los atributos reales de vuestra entidad User y a las columnas de usuarios. */


