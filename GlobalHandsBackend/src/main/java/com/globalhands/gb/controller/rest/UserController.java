package com.globalhands.gb.controller.rest;

import com.globalhands.gb.dto.UserDto;
import com.globalhands.gb.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //devuelve json
@RequestMapping("/api/users")  //def ruta

public class UserController {

    private final UserService userService;

    public UserController(UserService userService){

        this.userService = userService;

    }




    // Obtener todos los usuarios
    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }  //Atiende peticiones HTTP GET.

    // Obtener un usuario por su ID
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Integer id) {  //@PathVariable: Recoge el ID que llega en la URL
        return userService.getUserById(id);
    }
}
