package com.Sprint3.Proyectic.Services;


import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.Empresa;
import com.Sprint3.Proyectic.Services.ServicioEmpresa;
import com.Sprint3.Proyectic.Repositories.RepoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioEmpresa {

    @Autowired
    RepoEmpresa empresaRepository;


    public List<Empresa> getAllEmpresas() {
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));
        return empresaList;
    }


    public Empresa getEmpresaById(Integer id) {

        return  empresaRepository.findById(id).get();
    }

    public Empresa saveOrUpdateEmpresa(Empresa empresa) {
        Empresa emp=empresaRepository.save(empresa);
        return emp;
    }


    public boolean deleteEmpresa(Integer id) {
        empresaRepository.deleteById(id);
        if(empresaRepository.findById(id)==null) {
            return true;
        }
        return false;
    }

}
