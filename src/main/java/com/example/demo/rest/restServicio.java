package com.example.demo.rest;

import com.example.demo.model.Consulta;
import com.example.demo.model.Servicio;
import com.example.demo.service.serviceServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicios")
public class restServicio {
    
    @Autowired
    serviceServicio servicioService;

    @PostMapping("/solicitar")
    public Servicio requestService(@RequestBody Servicio servicio){
        return this.servicioService.requestServicioService(servicio);
    }

    @PostMapping("/emparejar")
    public String matchService(@RequestBody Consulta props){
        return this.servicioService.matchServicioService(props);
    }

}
