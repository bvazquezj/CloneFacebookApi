package com.upiicsos.clonefacebookapi.service;

import com.upiicsos.clonefacebookapi.entity.Credenciales;
import com.upiicsos.clonefacebookapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Credenciales> getCredenciales(){
        return userRepository.findAll();
    }

    public Optional<Credenciales> getCredencial(Long id){
        return userRepository.findById(id);
    }

    public void saveUser(Credenciales credencial){
        userRepository.save(credencial);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }


}
