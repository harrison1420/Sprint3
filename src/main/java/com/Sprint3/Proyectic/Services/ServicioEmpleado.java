package com.Sprint3.Proyectic.Services;

import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Repositories.RepoEmpleado;

import java.util.List;

public class ServicioEmpleado {

    private RepoEmpleado repositorio;

    public ServicioEmpleado(RepoEmpleado repositorio) {
        this.repositorio = repositorio;
    }

    public List<Empleado> getRepositorio() {
        return this.repositorio.findAll();
    }

    public  Empleado nuevoEmpleado (Empleado emp1) {
        return this.repositorio.save(emp1);
    }


    }

