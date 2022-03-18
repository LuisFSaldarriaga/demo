package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.repository.repositoryHacedor;
import com.example.demo.model.Consulta;
import com.example.demo.model.Hacedor;
import com.example.demo.model.Servicio;
import com.example.demo.repository.repositoryServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceServicio {
    
    @Autowired
    repositoryServicio servicioRepository;

    @Autowired
    repositoryHacedor hacedorRepository;

    protected ArrayList<Servicio> getServices(){
        return (ArrayList<Servicio>) servicioRepository.findAll();
    }

    protected Servicio getServiceById(String service){
        return servicioRepository.getById(Long.parseLong(service));
    }

    protected Hacedor getHacedorById(String hacedor){
        return hacedorRepository.getById(Long.parseLong(hacedor));
    }

    public Servicio requestServicioService(Servicio servicio){
        return servicioRepository.save(servicio);
    }

    protected ArrayList<Long> findMatchService(Consulta props, Hacedor hacedor){
        ArrayList<Long> serviceIDs = new ArrayList<Long>();
        try {
        
            ArrayList<Servicio> serviceList = servicioRepository.findByType(hacedor.getJob());
            
            for(Servicio i:serviceList){
                serviceIDs.add(i.getID());
            }

             
        } catch (Exception e) {
            System.out.println("ha ocurrido un error en el emparejamiento: "+e);
             return serviceIDs; 
         }
        return serviceIDs;
    }

    public String matchServicioService(Consulta consulta){
        
        String format = "Servicios Compatibles: \n\n";
        Hacedor hacedor = getHacedorById(consulta.getHacedor());

        try {
            for (Long I:findMatchService(consulta,hacedor)){
                Servicio sid = getServiceById(String.valueOf(I));
                format = format + "Id del servicio:"+ sid.getID() + "\n" + "Descripción: " + sid.getDescryption() + "\n" + "valor: "+sid.getValue() + "\n\n";

            }

            return format;
                
        } catch (Exception e) {
            format = " ocurrió un error. " + e;
            return format;
        }


    }
}
