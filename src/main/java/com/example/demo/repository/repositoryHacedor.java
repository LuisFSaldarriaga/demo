package com.example.demo.repository;

import com.example.demo.model.Hacedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryHacedor extends CrudRepository<Hacedor,Long> {
    
}
