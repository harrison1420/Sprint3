package com.Sprint3.Proyectic.Services;

import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.MovimientoDeDinero;
import com.Sprint3.Proyectic.Repositories.RepoEmpleado;
import com.Sprint3.Proyectic.Repositories.RepoMovimiento;

import java.util.List;

public class ServivioMovimientoDeDinero {
    private RepoMovimiento repositorio;

    public ServivioMovimientoDeDinero(RepoMovimiento repositorio) {
        this.repositorio = repositorio;
    }

    public List<MovimientoDeDinero> getRepositorio() {
        return this.repositorio.findAll();
    }

    public  MovimientoDeDinero nuevoMovimiento (MovimientoDeDinero mov) {
        return this.repositorio.save(mov);
    }


}
