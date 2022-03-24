package com.example.demo.rest;

import com.example.demo.model.Cliente;
import com.example.demo.model.Consulta;
import com.example.demo.service.serviceCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class restCliente {
    
    @Autowired
    serviceCliente clienteService;

    @PostMapping("/ingresar")
    public Cliente loginData(@RequestBody Consulta props ){
        return clienteService.getLogin(props);
    }

    @PostMapping("/registrar")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return this.clienteService.saveUserService(cliente);
    }

    

    

}
