package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Cliente;
import com.example.demo.repository.repositoryCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceCliente {
    
    @Autowired
    repositoryCliente clienteRepository;

    public ArrayList<Cliente> getUserService(){
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public Cliente saveUserService(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
}
