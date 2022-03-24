package com.example.demo.repository;

import com.example.demo.model.Hacedor;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryHacedor extends JpaRepository<Hacedor,Long> {
    
    Hacedor findByID(Long ID);
    ArrayList<Hacedor> findByName(String name);
    Hacedor findByDocument(String document);
    ArrayList<Hacedor> findByDireccion(String direccion);
    Hacedor findByEmail(String email);
    ArrayList<Hacedor> findByWorkrange(String workrange);
    ArrayList<Hacedor> findByJob(String job);
    
}
