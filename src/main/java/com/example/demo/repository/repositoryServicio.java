package com.example.demo.repository;

import com.example.demo.model.Servicio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryServicio extends CrudRepository<Servicio, Long> {
    
}
