package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Consulta {
    
    @Id
    @Column
    private String hacedor;

    public String getHacedor() {
        return hacedor;
    }

    public void setHacedor(String hacedor) {
        this.hacedor = hacedor;
    }
}
