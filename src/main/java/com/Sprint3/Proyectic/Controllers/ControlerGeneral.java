package com.Sprint3.Proyectic.Controllers;


import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.Empresa;
import com.Sprint3.Proyectic.Entities.MovimientoDeDinero;
import com.Sprint3.Proyectic.Services.ServicioEmpleado;
import com.Sprint3.Proyectic.Services.ServicioEmpresa;
import com.Sprint3.Proyectic.Services.ServicioMovimientoDeDinero;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ControlerGeneral {

    @Autowired
    ServicioEmpresa servicioEmpresa;

    @Autowired
    ServicioEmpleado servicioEmpleado;

    @Autowired
    ServicioMovimientoDeDinero servicioMovimientoDeDinero;

    @GetMapping("/empresas")
    public List<Empresa> verEmpresas() {
        return servicioEmpresa.getAllEmpresas();

    }

    @PostMapping("/empresas")
    public Empresa guardarEmpresa(@RequestBody Empresa emp) {
        return this.servicioEmpresa.saveOrUpdateEmpresa(emp);

    }

    @GetMapping(path = "empresas/{id}")
    public Empresa empresaPorID(@PathVariable("id") Integer id) {
        return this.servicioEmpresa.getEmpresaById(id);
    }

    @PatchMapping("/empresas/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody @NotNull Empresa empresa) {
        Empresa emp = servicioEmpresa.getEmpresaById(id);
        emp.setNombre(empresa.getNombre());
        emp.setDireccion(empresa.getDireccion());
        emp.setTelefono(empresa.getTelefono());
        emp.setNIT(empresa.getNIT());
        return servicioEmpresa.saveOrUpdateEmpresa(emp);
    }

    @DeleteMapping(path = "empresas/{id}")
    public String DeleteEmpresa(@PathVariable("id") Integer id) {
        boolean respuesta = this.servicioEmpresa.deleteEmpresa(id);
        if (respuesta) { //Si respuesta es true me dice:
            return "Se le elimino la empresa con id" + id;
        } else {
            return "Se le elimino la empresa con id" +  id;
        }
    }

    // Controlador Empleados
    @GetMapping("/empleados")
    public List<Empleado> verEmpleados() {
        return servicioEmpleado.getAllEmpleado();
    }

    @PostMapping("/empleados")
    public Optional<Empleado> guardarEmpleado(@RequestBody Empleado empl) {
        return Optional.ofNullable(this.servicioEmpleado.saveOrUpdateEmpleado(empl));
    }

    @GetMapping(path = "/empleados/{id}")
    public Optional<Empleado> empleadoPorID(@PathVariable("id") Integer id){
        return this.servicioEmpleado.getEmpleadoById(id);
    }

    @GetMapping("/enterprises/{id}/empleados")
    public ArrayList<Empleado> EmpleadoPorEmpresa(@PathVariable("id") Integer id){
        return this.servicioEmpleado.obtenerPorEmpresa(id);
    }

    @DeleteMapping("/empleados/{id}")
    public String DeleteEmpleado(@PathVariable("id") Integer id) {
        boolean respuesta = servicioEmpleado.deleteEmpleado(id);
        if (respuesta) {
            return "Se pudo eliminar correctamente el empleado con id " + id;
        }//Si la respuesta booleana es false, no se eliminó
        return "Se pudo eliminar correctamente el empleado con id " + id;
    }
    //Controlador Movimientos

    @GetMapping("/movimientos")
    public List<MovimientoDeDinero> verMovimientos(){
        return servicioMovimientoDeDinero.getAllMovimientos();
    }

    @PostMapping("/movimientos")
    public MovimientoDeDinero guardarMovimiento(@RequestBody MovimientoDeDinero movimiento){
        return servicioMovimientoDeDinero.saveOrUpdateMovimiento(movimiento);
    }

    @GetMapping("/movimientos/{id}")
    public MovimientoDeDinero movimientoPorId(@PathVariable("id") Integer id) {
        return servicioMovimientoDeDinero.getMovimientoById(id);
    }
    @PatchMapping("/movimientos/{id}")
    public MovimientoDeDinero actualizarMovimiento(@PathVariable("id") Integer id, @RequestBody @NotNull MovimientoDeDinero movimiento) {
        MovimientoDeDinero mov = servicioMovimientoDeDinero.getMovimientoById(id);
        mov.setConcepto(movimiento.getConcepto());
        mov.setMonto(movimiento.getMonto());
        mov.setUsuario(movimiento.getUsuario());
        return servicioMovimientoDeDinero.saveOrUpdateMovimiento(mov);
    }
    @DeleteMapping("/movimientos/{id}")
    public String deleteMovimiento(@PathVariable("id") Integer id){
        boolean respuesta= servicioMovimientoDeDinero.deleteMovimiento(id);
        if (respuesta){
            return "Se elimino correctamente el movimiento con id" +id;
        }
        return "No se pudo eliminar el movimiento con id" +id;
    }

    @GetMapping("/empleados/{id}/movimientos")
    public ArrayList<MovimientoDeDinero> movimientosPorEmpleado(@PathVariable("id") Integer id){
        return servicioMovimientoDeDinero.obtenerPorEmpleado(id);
    }

    @GetMapping("/empresas/{id}/movimientos")
    public ArrayList<MovimientoDeDinero> movimientosPorEmpresa(@PathVariable("id") Integer id){
        return servicioMovimientoDeDinero.obtenerPorEmpresa(id);
    }

}