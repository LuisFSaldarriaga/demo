package com.example.demo.rest;

import com.example.demo.model.Consulta;
import com.example.demo.model.TipoServicio;
import com.example.demo.service.serviceTipoServicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tiposervicio")
public class restTipoServicio {
    
    @Autowired
    serviceTipoServicio servicioTipoService;

    @GetMapping("/solicitar")
    public ArrayList<TipoServicio> requestServices(){
        return servicioTipoService.getServices();
    }

    @GetMapping("/disponibles")
    public ArrayList<String> requestAvailable(){
        return servicioTipoService.getAvailable();
    }
    
    @PostMapping("/solicitarc")
    public ArrayList<TipoServicio> requestServicesByHacedor(@RequestBody Consulta props){
        return servicioTipoService.getServicesByHacedor(props);
    }

    @PostMapping("/nuevo")
    public TipoServicio requestService(@RequestBody TipoServicio servicio){
        return this.servicioTipoService.requestNewType(servicio);
    }

    @PostMapping("/nuevos")
    public void requestServiceMultiple(@RequestBody ArrayList<TipoServicio> servicios){
        this.servicioTipoService.requesNewTypeMultiple(servicios);
    }

}