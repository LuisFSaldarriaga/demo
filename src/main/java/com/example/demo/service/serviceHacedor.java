package com.example.demo.service;

import java.util.ArrayList;
import java.util.Objects;

import com.example.demo.model.Consulta;
import com.example.demo.model.Hacedor;
import com.example.demo.repository.repositoryHacedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceHacedor {
    
    @Autowired
    repositoryHacedor hacedorRepository;

    public Hacedor getLogin(Consulta props){
        Hacedor user = hacedorRepository.findByEmail(props.getEmail());

        if(user.getPassword().matches(props.getPassword())){
            return user;
        }else{
            return null;
        }
    }

    public ArrayList<Hacedor> getUserListService(){
        return (ArrayList<Hacedor>) hacedorRepository.findAll();
    }

    public Hacedor getUserService(Consulta props){

        if( Objects.nonNull(props.getID()) ){
            return hacedorRepository.findByID(Long.parseLong(props.getID()));
        }else if( Objects.nonNull(props.getEmail()) ){
            return hacedorRepository.findByEmail(props.getEmail());
        }else{
            return hacedorRepository.findByDocument(props.getDocument());    
        }
    
    }

    public Hacedor saveUserService(Hacedor hacedor){
        return hacedorRepository.save(hacedor);
    }
    

}