package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "tiposervicio")
public class TipoServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID;

    @Column(length = 45, nullable = false)
    private String type;

    @Column
    private Long hacedorid;

// ------Gettters & Setters-------

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getHacedorid() {
        return hacedorid;
    }

    public void setHacedorid(Long hacedorid) {
        this.hacedorid = hacedorid;
    }

    

}

