package com.Sprint3.Proyectic.Controllers;


import com.Sprint3.Proyectic.Entities.Empresa;
import com.Sprint3.Proyectic.Services.ServicioEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpresa {

    ServicioEmpresa servicioEmpresa1;

    public ControlEmpresa(ServicioEmpresa servicioEmpresa1){
        this.servicioEmpresa1 = servicioEmpresa1;

  }
    @GetMapping("/empresa")
    public List<Empresa> informacion(){
        return this.servicioEmpresa1.getRepositorio();
  }
   @PostMapping("/empresa")
    public Empresa CrearEmpresa(@RequestBody Empresa emp){
        return this.servicioEmpresa1.nuevoRegistro(emp);
   }
}
