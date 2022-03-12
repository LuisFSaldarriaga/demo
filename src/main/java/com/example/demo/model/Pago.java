package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "pagos")
public class Pago {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long ID;

    @OneToOne
    private Servicio servicioid;

    @Column(length = 45, nullable = false)
    private String remitente;

    @Column(length = 45, nullable = false)
    private String receptor;

    @Column(nullable = false)
    private Double value;

    @Column(length = 45, nullable = false)
    private String date;

// ------Gettters & Setters-------

    public Long getID() {
        return ID;
    }

    public void setPagoID(Long iD) {
        ID = iD;
    }

    public Servicio getServicioid() {
        return servicioid;
    }

    public void setServicioid(Servicio Servicioid) {
        this.servicioid = Servicioid;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String Remitente) {
        this.remitente = Remitente;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String Receptor) {
        this.receptor = Receptor;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double Value) {
        this.value = Value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

}
