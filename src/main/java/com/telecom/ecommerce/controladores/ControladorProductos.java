package com.telecom.ecommerce.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telecom.ecommerce.servicios.ProductoServicio;

@Controller
@RequestMapping("/productos")
public class ControladorProductos {
	
	@Autowired
	ProductoServicio pServicio;

	@GetMapping("")
	public String productos(Model model) {
			model.addAttribute("lista", pServicio.listarProductos());
			
		return("productos/listarproductos");
	}
}
