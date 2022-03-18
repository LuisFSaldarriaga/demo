package com.example.demo.repository;

import com.example.demo.model.Hacedor;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryHacedor extends JpaRepository<Hacedor,Long> {

    ArrayList<Hacedor> findByJob(String job);
}
