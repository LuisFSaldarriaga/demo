package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID;

    @Column(length = 45, nullable = false)
    private String type;

    @Column(length = 500, nullable = false)
    private String descryption;

    @Column(length = 45, nullable = false)
    private String value;

    @OneToOne()
    private Cliente cliente;

    @OneToOne()
    private Hacedor hacedor;

    @Column(length = 10, nullable = false)
    private String status;

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

    public void setType(String Type) {
        this.type = Type;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String Descryption) {
        this.descryption = Descryption;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String Value) {
        this.value = Value;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.cliente = Cliente;
    }

    public Hacedor getHacedor() {
        return hacedor;
    }

    public void setHacedor(Hacedor Hacedor) {
        this.hacedor = Hacedor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

}
