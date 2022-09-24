package com.Sprint3.Proyectic;

import com.Sprint3.Proyectic.Entities.Empleado;
import com.Sprint3.Proyectic.Entities.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProyecticApplication {



	public static void main(String[] args) {
		SpringApplication.run(ProyecticApplication.class, args);

	}
}

