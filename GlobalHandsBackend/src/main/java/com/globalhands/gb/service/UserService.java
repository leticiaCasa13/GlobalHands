package com.globalhands.gb.service;

import com.globalhands.gb.dto.UserDto;
import com.globalhands.gb.dto.UserRequestDTO;
import com.globalhands.gb.dto.UserResponseDTO;
import com.globalhands.gb.entity.User;
import com.globalhands.gb.repository.UserRepository;
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
    //crear un usuario

        public UserResponseDTO createUser(UserRequestDTO request){
         User user = new User();
         user.setFirstName(request.firstName());
         user.setLastName(request.lastName());
         user.setEmail(request.email());



    }


}
/*
Importante: he utilizado getFirstName() y getLastName() como en tu práctica.

 Tendremos que adaptar estos nombres a los atributos reales de vuestra entidad User y a las columnas de usuarios. */


