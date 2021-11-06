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
	private String descripcion;
	private float precio;
	@OneToOne
	private Foto foto;

	public Producto(Integer id_producto, Integer stock, Foto foto, String descripcion,
			String nombre, float precio) {
		this.id_producto = id_producto;
		this.stock = stock;
		this.foto = foto;
		this.descripcion = descripcion;
		this.nombre = nombre;
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

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
