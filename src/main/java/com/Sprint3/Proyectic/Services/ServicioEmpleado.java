package com.Sprint3.Proyectic.Services;

import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Repositories.RepoEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioEmpleado {

    @Autowired
    RepoEmpleado empleadoRepository;


    public List<Empleado> getAllEmpleado(){
        List<Empleado> empleadoList= new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }


    public Optional<Empleado> getEmpleadoById(Integer id) {
        return empleadoRepository.findById(id);
    }


    public ArrayList<Empleado> obtenerPorEmpresa(Integer id) {
        return empleadoRepository.findByEmpresa(id);
    }



    public Empleado saveOrUpdateEmpleado(Empleado empleado){

        return empleadoRepository.save(empleado);
    }


    public boolean deleteEmpleado(Integer id){
        empleadoRepository.deleteById(id);
        if (this.empleadoRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }



}
