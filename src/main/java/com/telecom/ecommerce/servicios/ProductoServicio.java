package com.telecom.ecommerce.servicios;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.ecommerce.entidades.Producto;
import com.telecom.ecommerce.errores.ErrorServicio;
import com.telecom.ecommerce.repositorios.IProductoDAO;

@Service
public class ProductoServicio {

	@Autowired
	IProductoDAO productoDAO;

	@Transactional
	public void crearProducto(Integer stock, String nombre, String imagen, String descripcion,
			String marca, Integer vistas,  float calificacion, float precio) throws ErrorServicio {

		validar(stock, nombre, imagen, descripcion, marca, vistas, calificacion, precio);

		Producto p = new Producto();
		p.setStock(stock);
		p.setNombre(nombre);
		p.setImagen(imagen);
		p.setDescripcion(descripcion);
		p.setMarca(marca);
		p.setVistos(vistas);
		p.setCalificacion(calificacion);
		p.setPrecio(precio);

		productoDAO.save(p);
	}
	
	@Transactional
	public void modificarProducto(Integer id, Integer stock, String nombre, String imagen, String descripcion,
			String marca, Integer vistas,  float calificacion, float precio) throws ErrorServicio {

		validar(stock, nombre, imagen, descripcion, marca, vistas, calificacion, precio);

		Producto p = productoDAO.findById(id).get();
		p.setStock(stock);
		p.setNombre(nombre);
		p.setImagen(imagen);
		p.setDescripcion(descripcion);
		p.setMarca(marca);
		p.setVistos(vistas);
		p.setCalificacion(calificacion);
		p.setPrecio(precio);

		productoDAO.save(p);
	}
	
	@Transactional
	public void quitarProducto(Integer id) throws ErrorServicio{
		if(!productoDAO.findById(id).isPresent()) {
			throw new ErrorServicio("No se encontró el producto con id = " + id);
		}
		productoDAO.deleteById(id);
	}
	
	public List<Producto> listarProductos(){
		return productoDAO.findAll();
	}
	
	private void validar(Integer stock, String nombre, String imagen, String descripcion,
			String marca, Integer vistas,  float calificacion, float precio) throws ErrorServicio {

		if (String.valueOf(stock).isBlank() || stock == null) {
			throw new ErrorServicio("Stock sin especificar");
		}
		if (nombre == null || nombre.isEmpty()) {
			throw new ErrorServicio("Nombre sin especificar");
		}
		if (imagen == null || imagen.isEmpty()) {
			throw new ErrorServicio("imagen sin especificar");
		}
		if (descripcion == null || descripcion.isEmpty()) {
			throw new ErrorServicio("Descripción vacia");
		}
		if (marca == null || marca.isEmpty()) {
			throw new ErrorServicio("Marca sin especificar");
		}
		if (String.valueOf(calificacion).isBlank()) {
			throw new ErrorServicio("Calificación sin especificar");
		}
		if (String.valueOf(precio).isBlank()) {
			throw new ErrorServicio("Precio sin especificar");
		}
	}
}
