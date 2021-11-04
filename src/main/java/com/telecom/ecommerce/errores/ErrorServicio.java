package com.telecom.ecommerce.errores;

@SuppressWarnings("serial")
public class ErrorServicio extends Exception{

	public ErrorServicio(String msn) {
		super(msn);
	}
}
