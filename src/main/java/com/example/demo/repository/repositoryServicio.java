package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Hacedor;
import com.example.demo.model.Servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryServicio extends JpaRepository<Servicio, Long> {
    
    Servicio findByID(Long ID);
    ArrayList<Servicio> findByType(String type);
    ArrayList<Servicio> findByValue(String value);
    ArrayList<Servicio> findByCliente(String cliente);
    ArrayList<Servicio> findByHacedor(Hacedor hacedor);
    ArrayList<Servicio> findByStatus(String status);

}
