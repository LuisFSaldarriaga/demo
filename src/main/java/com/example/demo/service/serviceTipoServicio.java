package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.TipoServicio;
import com.example.demo.repository.repositoryTipoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceTipoServicio {
    
    @Autowired
    repositoryTipoServicio servicioTipoRepository;

    public ArrayList<TipoServicio> getServices(){
        return (ArrayList<TipoServicio>) servicioTipoRepository.findAll();
    }

    public TipoServicio requestNewType(TipoServicio servicio){
        return servicioTipoRepository.save(servicio);
    }

}