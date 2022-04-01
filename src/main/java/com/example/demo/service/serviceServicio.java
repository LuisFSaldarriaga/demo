package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.repository.repositoryHacedor;
import com.example.demo.model.Consulta;
import com.example.demo.model.Hacedor;
import com.example.demo.model.Servicio;
import com.example.demo.model.TipoServicio;
import com.example.demo.repository.repositoryServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceServicio {
    
    @Autowired
    repositoryServicio servicioRepository;

    @Autowired
    repositoryHacedor hacedorRepository;

    @Autowired
    serviceTipoServicio tipoServicioService;

    protected ArrayList<Servicio> getServices(){
        return (ArrayList<Servicio>) servicioRepository.findAll();
    }

    protected Servicio getServiceById(String service){
        return servicioRepository.getById(Long.parseLong(service));
    }

    protected Hacedor getHacedorById(String hacedor){
        return hacedorRepository.getById(Long.parseLong(hacedor));
    }

    public Servicio getConsultService(Long serviceid){
        return servicioRepository.findByID(serviceid);
    }

    public Servicio requestServicioService(Servicio servicio){
        return servicioRepository.save(servicio);
    }

    public ArrayList<Servicio> getHacedorServicios(Hacedor hacedor){
        return servicioRepository.findByHacedor(hacedor);
    }

    public ArrayList<Servicio> getServicesByH(Consulta props){
        Hacedor hacedor = hacedorRepository.findById(Long.parseLong(props.getHacedor())).get();
        ArrayList<Servicio> selected = servicioRepository.findByHacedor(hacedor);
        return selected;
    }

    protected ArrayList<Long> findMatchService(Consulta props, Hacedor hacedor){
        ArrayList<Long> serviceIDs = new ArrayList<Long>();
        try {
            ArrayList<TipoServicio> jobs = tipoServicioService.getServicesByHacedor(props);

            for(TipoServicio t:jobs){
        
                ArrayList<Servicio> serviceList = servicioRepository.findByType(t.getType());
            
                for(Servicio i:serviceList){
                    serviceIDs.add(i.getID());
                }
            }

             
        } catch (Exception e) {
            System.out.println("ha ocurrido un error en el emparejamiento: "+e);
             return serviceIDs; 
         }
        return serviceIDs;
    }

    public ArrayList<Servicio> matchServicioService(Consulta consulta){
        ArrayList<Servicio> selected = new ArrayList<Servicio>();
        Hacedor hacedor = getHacedorById(consulta.getHacedor());

        try {
            for (Long I:findMatchService(consulta,hacedor)){
                Servicio sid = getServiceById(String.valueOf(I));
                if(sid.getStatus().equals("pairing")){
                    selected.add(sid);
                } else {
                    continue;
                }
            }

            return selected;
                
        } catch (Exception e) {
            return selected;
        }


    }

    
}
