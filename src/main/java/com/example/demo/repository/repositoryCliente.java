package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryCliente extends CrudRepository<Cliente,Long>{
    
}
