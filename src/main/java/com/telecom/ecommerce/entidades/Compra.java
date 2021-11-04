package com.telecom.ecommerce.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Compra {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_compra;
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	@OneToMany
	private List<Producto> productos;
	private Date comprado;
	private Date despachado;
	private Date recibido;
	
	/*Con este mapeo, en la BD queda la tabla de compras con su id_compra y el id_cliente
	 *A la vez se genera otra tabla que relaciona cada compra con los productos que la componen
	 *se llama compra_productos y contiene las columnas compra_id_compra y productos_id_producto 
	 *(No se como cambiarle los nombres a esas 2)*/
	
	public Compra() {
		super();
	}


	public Compra(Integer id_compra, Cliente cliente, List<Producto> productos, Date comprado, Date despachado,
			Date recibido) {
		super();
		this.id_compra = id_compra;
		this.cliente = cliente;
		this.productos = productos;
		this.comprado = comprado;
		this.despachado = despachado;
		this.recibido = recibido;
	}


	public Integer getId_compra() {
		return id_compra;
	}


	public void setId_compra(Integer id_compra) {
		this.id_compra = id_compra;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	public Date getComprado() {
		return comprado;
	}


	public void setComprado(Date comprado) {
		this.comprado = comprado;
	}


	public Date getDespachado() {
		return despachado;
	}


	public void setDespachado(Date despachado) {
		this.despachado = despachado;
	}


	public Date getRecibido() {
		return recibido;
	}


	public void setRecibido(Date recibido) {
		this.recibido = recibido;
	}
	
	
}
