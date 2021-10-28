package com.telecom.ecommerce.principal;

import javax.persistence.*;

@Entity
@Table
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_producto;
	@Column
	private Integer stock;
	@Column
	private Integer vistas;
	@Column
	private String imagen;
	@Column
	private String comentario;
	@Column
	private String descripcion;
	@Column
	private String nombre;
	@Column
	private String marca;
	@Column
	private float calificacion;
	@Column
	private float precio;

	public Producto(Integer id_producto, Integer stock, Integer vistas, String imagen, String comentario, String descripcion,
			String nombre, String marca, float calificacion, float precio) {
		this.id_producto = id_producto;
		this.stock = stock;
		this.vistas = vistas;
		this.imagen = imagen;
		this.comentario = comentario;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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
