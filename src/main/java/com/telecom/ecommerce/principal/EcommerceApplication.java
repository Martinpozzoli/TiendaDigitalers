package com.telecom.ecommerce.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.telecom.ecommerce.principal")
@EntityScan("com.telecom.ecommerce.principal")
@EnableJpaRepositories("com.telecom.ecommerce.principal")

public class EcommerceApplication implements CommandLineRunner {
	@Autowired
	IClienteDAO cd;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat d = new SimpleDateFormat("dd/mm/yyyy");
		Cliente c1 =  new Cliente();
		c1.setNombre("Alexis Cabrera");
		c1.setCodigo_postal(3100);
		Cliente c2 = new Cliente();
		c2.setNombre("Marcos Gabriel Miller");
		c2.setContrasenia("noEnTextoPlano");
		cd.save(c2);
		cd.save(c1);
	}

}
