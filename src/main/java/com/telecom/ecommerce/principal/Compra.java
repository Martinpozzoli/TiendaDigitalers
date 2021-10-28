package com.telecom.ecommerce.principal;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class Compra {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_compra;
	@Column
	private Integer id_cliente; //es clave foranea
	@Column
	private Integer id_producto; //es clave foranea
	@Column
	private Date comprado;
	@Column
	private Date despachado;
	@Column
	private Date recibido;
}
