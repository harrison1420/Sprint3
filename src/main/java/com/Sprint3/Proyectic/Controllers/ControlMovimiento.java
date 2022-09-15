package com.Sprint3.Proyectic.Controllers;


import com.Sprint3.Proyectic.Entities.MovimientoDeDinero;
import com.Sprint3.Proyectic.Services.ServivioMovimientoDeDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ControlMovimiento {

    ServivioMovimientoDeDinero servicioMovimiento1;

    public ControlMovimiento(ServivioMovimientoDeDinero servicioMovimiento1){
        this.servicioMovimiento1 = servicioMovimiento1;

    }
    @GetMapping("/movimiento")
    public List<MovimientoDeDinero> informacion(){

        return this.servicioMovimiento1.getRepositorio();
    }
    @PostMapping("/movimiento")
    public MovimientoDeDinero CrearMovimiento(@RequestBody MovimientoDeDinero mov){
        return this.servicioMovimiento1.nuevoMovimiento(mov);
    }
}


