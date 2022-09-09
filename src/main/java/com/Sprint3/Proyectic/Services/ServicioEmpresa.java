package com.Sprint3.Proyectic.Services;


import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.Empresa;
import com.Sprint3.Proyectic.Repositories.RepoEmpresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpresa {

    private RepoEmpresa repositorio;

    public ServicioEmpresa(RepoEmpresa repositorio) {
        this.repositorio = repositorio;
    }

    public List<Empresa> getRepositorio() {
        return this.repositorio.findAll();
    }

    public Empresa nuevoRegistro(Empresa emp1) {
        return this.repositorio.save(emp1);
    }


}