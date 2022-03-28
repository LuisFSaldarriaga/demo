package com.example.demo.model;

import javax.persistence.*;

public class Consulta {

    @Id
    @Column
    private String hacedor;

    @Column
    private String cliente;

    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String document;

    @Column
    private String direccion;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String job;

    @Column
    private String workrange;

    @Column
    private String type;

    @Column
    private String value;

    @Column
    private String status;

    @Column
    private String rol;

    

 // ------Constructor-------

    public Consulta(String hacedor, String cliente, String id, String name, String document, String direccion,
            String email, String password, String job, String workrange, String type, String value, String status,
            String rol) {
        this.hacedor = hacedor;
        this.cliente = cliente;
        this.id = id;
        this.name = name;
        this.document = document;
        this.direccion = direccion;
        this.email = email;
        this.password = password;
        this.job = job;
        this.workrange = workrange;
        this.type = type;
        this.value = value;
        this.status = status;
        this.rol = rol;
    }

 // ------Gettters & Setters-------

    public String getHacedor() {
        return hacedor;
    }

    public void setHacedor(String hacedor) {
        this.hacedor = hacedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getID() {
        return id;
    }

    public void setID(String iD) {
        this.id = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getWorkrange() {
        return workrange;
    }

    public void setWorkrange(String workrange) {
        this.workrange = workrange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
