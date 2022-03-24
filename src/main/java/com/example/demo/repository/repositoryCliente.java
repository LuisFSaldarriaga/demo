package com.example.demo.repository;

import com.example.demo.model.Cliente;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryCliente extends JpaRepository<Cliente,Long>{
    
    Cliente findByID(String ID);
    ArrayList<Cliente> findByName(String name);
    Cliente findByDocument(String document);
    ArrayList<Cliente> findByDireccion(String direccion);
    Cliente findByEmail(String email);

}
