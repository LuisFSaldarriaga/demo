package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryServicio extends JpaRepository<Servicio, Long> {
    
    ArrayList<Servicio> findByType(String type);
}
