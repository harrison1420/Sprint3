package com.Sprint3.Proyectic.Repositories;


import com.Sprint3.Proyectic.Entities.MovimientoDeDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RepoMovimiento extends JpaRepository <MovimientoDeDinero , Integer> {


    @Query(value ="select * from movimientos where empleado_id= ?1", nativeQuery = true)
    public abstract ArrayList<MovimientoDeDinero> findByEmpleado(Integer id);


    @Query(value="select * from movimientos where empleado_id in (select id from empleado where empresa_id= ?1)", nativeQuery = true)
    public abstract ArrayList<MovimientoDeDinero> findByEmpresa(Integer id);
}
