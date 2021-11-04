package com.telecom.ecommerce.entidades;

import javax.persistence.*;

@Entity
@Table
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_producto;
	private String nombre;
	private Integer stock;
	private String imagen;
	private String descripcion;
	private String marca;
	private Integer vistas;
	private float calificacion;
	private float precio;

	public Producto(Integer id_producto, Integer stock, Integer vistas, String imagen, String descripcion,
			String nombre, String marca, float calificacion, float precio) {
		this.id_producto = id_producto;
		this.stock = stock;
		this.vistas = vistas;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.marca = marca;
		this.calificacion = calificacion;
		this.precio = precio;
	}
	
	public Producto() {}

	public Integer getId() {
		return id_producto;
	}

	public void setId(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getVistos() {
		return vistas;
	}

	public void setVistos(Integer vistas) {
		this.vistas = vistas;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
