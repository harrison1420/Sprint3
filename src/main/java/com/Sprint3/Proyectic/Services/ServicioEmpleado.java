package com.Sprint3.Proyectic.Services;

import com.Sprint3.Proyectic.Entities.Empleado;

public class ServicioEmpleado {


    Empleado empleado1;

    public ServicioEmpleado(){

        this.empleado1 = new Empleado("harrison","nacho2282@hotmail.com",
                "proyectic","vendedor",null);


    }
    public Empleado getEmpleado(){
        return this.empleado1;

    }
}
