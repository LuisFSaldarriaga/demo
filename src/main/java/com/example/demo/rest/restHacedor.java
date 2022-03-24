package com.example.demo.rest;

import com.example.demo.model.Consulta;
import com.example.demo.model.Hacedor;
import com.example.demo.service.serviceHacedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hacedor")
public class restHacedor {
    
    @Autowired
    serviceHacedor hacedorService;

    @PostMapping("/ingresar")
    public Hacedor loginData(@RequestBody Consulta props ){
        return hacedorService.getLogin(props);
    }

    @PostMapping("/consultar")
    public Hacedor findHacedor(@RequestBody Consulta props ){
        return hacedorService.getUserService(props);
    }

    @PostMapping("/registrar")
    public Hacedor saveHacedor(@RequestBody Hacedor hacedor){
        return this.hacedorService.saveUserService(hacedor);
    }
}
