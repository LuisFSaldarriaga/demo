package com.example.demo.repository;

import com.example.demo.model.Pago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryPago extends CrudRepository<Pago, Long>{
    
}
