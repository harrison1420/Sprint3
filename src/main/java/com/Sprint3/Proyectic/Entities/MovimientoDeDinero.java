package com.Sprint3.Proyectic.Entities;

import javax.persistence.*;

@Entity
@Table(name = "MovimientoDeDinero")
public class MovimientoDeDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "monto")
    private double Monto;
    @Column(name = "concepto")
    private String Concepto;

    public MovimientoDeDinero(){

    }

    public MovimientoDeDinero(double monto, String concepto) {
        Monto = monto;
        Concepto = concepto;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }
    public double CrearMonto(){
        return -1;
    }
    public String Encargado(){
        return "-1";
    }
}
