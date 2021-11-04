package com.telecom.ecommerce.servicios;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.ecommerce.entidades.Cliente;
import com.telecom.ecommerce.errores.ErrorServicio;
import com.telecom.ecommerce.repositorios.IClienteDAO;

@Service
public class ClienteServicio {

	@Autowired
	IClienteDAO clienteDAO;

	@Transactional
	public void crearCliente(String nombre, Integer dni, String correo, Integer telefono, Integer codPostal,
			String domicilio, String pass, Date nac) throws ErrorServicio {

		validar(nombre, dni, correo, telefono, codPostal, domicilio, pass);

		Cliente c = new Cliente();
		c.setDni(dni);
		c.setNombre(nombre);
		c.setCorreo(correo);
		c.setTelefono(telefono);
		c.setCodigo_postal(codPostal);
		c.setDomicilio(domicilio);
		c.setContrasenia(pass);
		c.setNacimiento(nac);

		clienteDAO.save(c);
	}
	
	

	private void validar(String nombre, Integer dni, String correo, Integer telefono, Integer codPostal,
			String domicilio, String pass) throws ErrorServicio {

		if (String.valueOf(dni).isBlank() || dni == null) {
			throw new ErrorServicio("DNI sin especificar");
		}
		if (nombre == null || nombre.isEmpty()) {
			throw new ErrorServicio("Nombre sin especificar");
		}
		if (correo == null || correo.isEmpty()) {
			throw new ErrorServicio("Correo sin especificar");
		}
		if (String.valueOf(telefono).isBlank() || telefono == null) {
			throw new ErrorServicio("Telefono sin especificar");
		}
		if (String.valueOf(codPostal).isBlank() || codPostal == null) {
			throw new ErrorServicio("Código postal sin especificar");
		}
		if (domicilio == null || domicilio.isEmpty()) {
			throw new ErrorServicio("Domicilio sin especificar");
		}
		if (pass == null || pass.isEmpty()) {
			throw new ErrorServicio("Contraseña sin especificar");
		}
	}
}
