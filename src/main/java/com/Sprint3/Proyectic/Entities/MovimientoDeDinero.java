package com.Sprint3.Proyectic.Entities;

import javax.persistence.*;


@Entity
@Table(name = "movimientoDeDinero")
public class MovimientoDeDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long monto;

    private String concepto;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado usuario;

    public MovimientoDeDinero() {
    }

    public MovimientoDeDinero(long monto, String concepto, Empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }
}
