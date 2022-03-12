package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

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

    protected Optional<Servicio> getServiceById(String service){
        return servicioRepository.findById(Long.parseLong(service));
    }

    protected Optional<Hacedor> getHacedorById(String hacedor){
        return hacedorRepository.findById(Long.parseLong(hacedor));
    }

    protected Hacedor getHacedorService(Long id){
        Optional<Hacedor> h = getHacedorById(String.valueOf(id));
        try{
            if (h.isPresent()){
                return h.get();
            }
        }catch(Exception e){
            
            return null;
        }
        return h.get();
    }

    protected String serviceFormat(ArrayList<String> servicesf){

        String format = "Servicios Compatibles: \n";

        try {
            for (String I:servicesf){
                Optional<Servicio> sid = getServiceById(I);
                
                if (sid.isPresent()){
                   Servicio service=sid.get();
                    format = format + "Id del servicio:"+ service.getID() + "\n" + "Descripción: " + service.getDescryption() + "\n" + "valor: "+service.getValue();

                } else{
                    return format="error.";
                }
            }

            return format;
                
        } catch (Exception e) {
            format = " ocurrió un error. " + e;
            return format;
        }
            
    
    }

    public Servicio requestServicioService(Servicio servicio){
        return servicioRepository.save(servicio);
    }

    protected ArrayList<Long> findMatchService(Consulta props, Hacedor hacedor){
        ArrayList<Long> serviceIDs = new ArrayList<Long>();
        try {
            
            ArrayList<Servicio> serviceList = getServices();

            for (Servicio s:serviceList) {

                if(s.getType()==hacedor.getJob()){
                    serviceIDs.add(s.getID());
                } else {
                    continue;
                }
            }
             
        } catch (Exception e) {
            System.out.println("ha ocurrido un error en el emparejamiento: "+e);
             return serviceIDs; 
         }
        return serviceIDs;
    }

    public String matchServicioService(Consulta consulta){

        Hacedor hacedor = getHacedorService(Long.parseLong(consulta.getHacedor()));
        String stat = "servicios: ";
         for (Long i:findMatchService(consulta,hacedor)){
             stat = stat + i;
         }
        return stat;


    }
}
