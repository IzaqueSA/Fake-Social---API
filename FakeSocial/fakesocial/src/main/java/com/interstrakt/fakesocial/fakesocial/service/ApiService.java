package com.interstrakt.fakesocial.fakesocial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interstrakt.fakesocial.fakesocial.domain.UsuarioRepository;
import com.interstrakt.fakesocial.fakesocial.domain.User;

@Service
public class ApiService {

    @Autowired
    private UsuarioRepository repository;

    public String getHello(String name) {
        return "Hello, " + name + "!";
    }

    public String postUser(Long id, String name, String email) {
        User user = new User(id, name, email);
        repository.save(user);
        return "User " + name + " with email " + email + " has been created.";
    }

    public String deleteUser(Long id) {
        repository.findById(id);
        if (!repository.existsById(id)) {
            return "User with id " + id + " does not exist.";
        }
        repository.deleteById(id);
        return "User with id " + id + " has been deleted.";
    }
}
