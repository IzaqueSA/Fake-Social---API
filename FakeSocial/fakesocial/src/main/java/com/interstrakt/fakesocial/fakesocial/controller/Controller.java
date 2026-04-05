package com.interstrakt.fakesocial.fakesocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.interstrakt.fakesocial.fakesocial.service.ApiService;
import com.interstrakt.fakesocial.fakesocial.domain.User;
import com.interstrakt.fakesocial.fakesocial.domain.UsuarioRepository;

@RequestMapping("/API")
@RestController
public class Controller {
    @Autowired
    private ApiService apiservice;

    @GetMapping("/hello")
    public String hello() {
        return apiservice.getHello("World");
    }

    @PostMapping("/criar")
    public String criar(@RequestBody User novoUsuario) {
        return apiservice.postUser(novoUsuario.getId(), novoUsuario.getName(), novoUsuario.getEmail());
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        return apiservice.deleteUser(id);
    }

    // public String postUser(@RequestBody User body,
    // @RequestParam(value = "classe", defaultValue = "default") String classe) {
    // return "User " + body.getName() + " with email " + body.getEmail() + " has
    // been created with class " + classe
    // + ".";
    // }
}
