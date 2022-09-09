package com.Sprint3.Proyectic.Entities;


import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "EmpresaEmpleadoPertenece")
    private String EmpresaEmpleadoPertenece;
    @Column(name = "RolEmpleado")
    private String RolEmpleado;

    @Transient
    MovimientoDeDinero primerMovimiento ;

    public Empleado(){

    }

    public Empleado(String nombre, String correo, String empresaEmpleadoPertenece,
                    String rolEmpleado, MovimientoDeDinero primerMovimiento) {
        this.nombre = nombre;
        this.correo = correo;
        EmpresaEmpleadoPertenece = empresaEmpleadoPertenece;
        RolEmpleado = rolEmpleado;
        this.primerMovimiento = primerMovimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleadoPertenece() {
        return EmpresaEmpleadoPertenece;
    }

    public void setEmpresaEmpleadoPertenece(String empresaEmpleadoPertenece) {
        EmpresaEmpleadoPertenece = empresaEmpleadoPertenece;
    }

    public String getRolEmpleado() {
        return RolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        RolEmpleado = rolEmpleado;
    }

    public MovimientoDeDinero getPrimerMovimiento() {
        return primerMovimiento;
    }

    public void setPrimerMovimiento(MovimientoDeDinero primerMovimiento) {
        this.primerMovimiento = primerMovimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", EmpresaEmpleadoPertenece='" + EmpresaEmpleadoPertenece + '\'' +
                ", RolEmpleado='" + RolEmpleado + '\'' +
                ", primerMovimiento=" + this.primerMovimiento +
                '}';
    }
}
