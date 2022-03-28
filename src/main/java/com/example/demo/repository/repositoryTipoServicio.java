package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.TipoServicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryTipoServicio extends JpaRepository<TipoServicio, Long> {
    
    TipoServicio findByID(String ID);
    ArrayList<TipoServicio> findByType(String type);
    ArrayList<TipoServicio> findByHacedorid(Long hacedorid);


}