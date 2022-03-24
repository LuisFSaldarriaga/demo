package com.example.demo.rest;

import com.example.demo.model.Consulta;
import com.example.demo.service.serviceAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingresar")
public class restAuth {
    
    @Autowired
    serviceAuth authService;

    @PostMapping
    public Consulta loginData(@RequestBody Consulta props ){
        return authService.getLogin(props);
    }
}
