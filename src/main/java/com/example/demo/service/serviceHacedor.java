package com.example.demo.service;

import java.util.ArrayList;


import com.example.demo.model.Hacedor;
import com.example.demo.repository.repositoryHacedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceHacedor {
    
    @Autowired
    repositoryHacedor hacedorRepository;

    public ArrayList<Hacedor> getUserService(){
        return (ArrayList<Hacedor>) hacedorRepository.findAll();
    }

    public Hacedor saveUserService(Hacedor hacedor){
        return hacedorRepository.save(hacedor);
    }
    

}