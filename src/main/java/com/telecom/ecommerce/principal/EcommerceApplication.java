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

import com.telecom.ecommerce.entidades.Cliente;
import com.telecom.ecommerce.entidades.Producto;
import com.telecom.ecommerce.repositorios.IClienteDAO;
import com.telecom.ecommerce.repositorios.IProductoDAO;

@SpringBootApplication
@ComponentScan("com.telecom.ecommerce")
@EntityScan("com.telecom.ecommerce")
@EnableJpaRepositories("com.telecom.ecommerce")
public class EcommerceApplication implements CommandLineRunner {
	
	@Autowired
	IClienteDAO cd;
	IProductoDAO pd;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		DateFormat d = new SimpleDateFormat("dd/mm/yyyy");
//		Cliente c1 =  new Cliente();
//		Producto p1 = new Producto();
//		c1.setNombre("Alexis Cabrera");
//		c1.setCodigo_postal(3100);
//		Cliente c2 = new Cliente();
//		c2.setNombre("Marcos Gabriel Miller");
//		c2.setContrasenia("noEnTextoPlano");
//		p1.setNombre("iPhone 11");
//		
//		cd.save(c2);
//		cd.save(c1);
//		pd.save(p1);
	}

}
