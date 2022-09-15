package com.Sprint3.Proyectic.Repositories;


import com.Sprint3.Proyectic.Entities.MovimientoDeDinero;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepoMovimiento extends JpaRepository <MovimientoDeDinero , Long> {

}
