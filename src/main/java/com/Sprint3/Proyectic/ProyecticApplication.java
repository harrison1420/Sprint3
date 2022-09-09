package com.Sprint3.Proyectic;

import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyecticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyecticApplication.class, args);}{


	Empleado emplado1= new Empleado("harrison","nacho2282@hotmail.com",
			"proyectic","vendedor",null);

	Empresa empresa1= new Empresa ("proyectic","calle 80 avenida 26",
			3142526,"1234",emplado1);
		System.out.println(empresa1.toString());

  }
}

