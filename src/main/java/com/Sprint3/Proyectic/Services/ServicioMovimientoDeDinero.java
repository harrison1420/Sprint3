package com.Sprint3.Proyectic.Services;


import com.Sprint3.Proyectic.Entities.MovimientoDeDinero;
import com.Sprint3.Proyectic.Repositories.RepoMovimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioMovimientoDeDinero {

    @Autowired
    RepoMovimiento movimientosRepository;


    public List<MovimientoDeDinero> getAllMovimientos() {
        List<MovimientoDeDinero> movimientoList = new ArrayList<>();
        movimientosRepository.findAll().forEach(movimiento -> movimientoList.add(movimiento));
        return movimientoList;
    }


    public  MovimientoDeDinero getMovimientoById(Integer id) {

        return movimientosRepository.findById(id).get();
    }

    public  MovimientoDeDinero saveOrUpdateMovimiento(MovimientoDeDinero movimientoDinero) {
        MovimientoDeDinero mov = movimientosRepository.save(movimientoDinero);
        return mov;
    }

    public boolean deleteMovimiento(Integer id){
        movimientosRepository.deleteById(id);
        if(this.movimientosRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }

    public ArrayList<MovimientoDeDinero> obtenerPorEmpleado(Integer id) {
        return movimientosRepository.findByEmpleado(id);
    }

    public ArrayList<MovimientoDeDinero> obtenerPorEmpresa(Integer id){
        return movimientosRepository.findByEmpresa(id);
    }

}