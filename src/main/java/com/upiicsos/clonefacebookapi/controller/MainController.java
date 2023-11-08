package com.upiicsos.clonefacebookapi.controller;

import com.upiicsos.clonefacebookapi.entity.Credenciales;
import com.upiicsos.clonefacebookapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/face")
public class MainController {

    private UserService userService;

    @GetMapping
    public List<Credenciales> getAll(){
        return userService.getCredenciales();
    }

    @GetMapping("{id}")
    public Optional<Credenciales> getById(@PathVariable("id") Long id){
        return userService.getCredencial(id);
    }

    @PostMapping
    public void saveUser(@RequestBody Credenciales credenciales){
        userService.saveUser(credenciales);
    }
}
