package com.example.demo.model;

import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long ID;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 11, unique= true, nullable = false)
    private String document;

    @Column(length = 45, nullable = false)
    private String direccion;

    @Column(length = 100, unique= true, nullable = false)
    private String email;

    @Column(length = 45, nullable = false)
    private String password;


// ------Gettters & Setters-------

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String Document) {
        this.document = Document;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email= Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    
}
