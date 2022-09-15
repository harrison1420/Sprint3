package com.Sprint3.Proyectic.Controllers;


import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.Empresa;
import com.Sprint3.Proyectic.Services.ServicioEmpleado;
import com.Sprint3.Proyectic.Services.ServicioEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ControlEmpleado {

    ServicioEmpleado servicioEmpleado1;

    public ControlEmpleado(ServicioEmpleado servicioEmpleado){
        this.servicioEmpleado1=servicioEmpleado1;

    }
    @GetMapping("/empleado")
    public List<Empleado> informacion(){
        return this.servicioEmpleado1.getRepositorio();
    }
    @PostMapping("/empleado")
    public Empleado CrearEmpleado  (@RequestBody Empresa empl){
        return this.servicioEmpleado1.nuevoEmpleado(empl.getEmpleado1());
    }
}


