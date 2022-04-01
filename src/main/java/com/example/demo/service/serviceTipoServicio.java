package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Consulta;
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

    public ArrayList<String> getAvailable(){
        List<TipoServicio> allServices = servicioTipoRepository.findAll();
        ArrayList<String> selected = new ArrayList<String>();

        for(TipoServicio i: allServices){
            if(selected.contains(i.getType())){
                continue;
            }else{
                selected.add(i.getType());
                continue;
            }
        }
        return selected;
    }

    public ArrayList<TipoServicio> getServicesByHacedor(Consulta props){
        return servicioTipoRepository.findByHacedorid(Long.parseLong(props.getHacedor()));
    }

    public TipoServicio requestNewType(TipoServicio servicio){
        return servicioTipoRepository.save(servicio);
    }

    public String requesNewTypeMultiple(ArrayList<TipoServicio> props){
        String validated = "valid saves: \n";
        
        for (TipoServicio i:props){
            TipoServicio validator = servicioTipoRepository.save(i);
            validated = validated + validator.getID() + "\n" + validator.getType();
        }
        System.out.println(validated);
        return validated;
        
    }



}