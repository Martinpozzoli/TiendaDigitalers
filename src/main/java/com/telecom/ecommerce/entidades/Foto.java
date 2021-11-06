package com.telecom.ecommerce.entidades;

import javax.persistence.*;

@Entity
public class Foto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String nombre;
	private String mime;
	
	@Lob @Basic(fetch = FetchType.LAZY)
	private byte[] contenido;

	public Foto(Integer id, String nombre, String mime, byte[] contenido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.mime = mime;
		this.contenido = contenido;
	}

	public Foto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public byte[] getContenido() {
		return contenido;
	}

	public void setContenido(byte[] contenido) {
		this.contenido = contenido;
	}
	
	
}
