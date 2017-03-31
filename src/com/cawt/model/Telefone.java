package com.cawt.model;

public class Telefone {
	private Integer codigo;
	private String numero;
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Telefone(Integer codigo, String numero) {
		super();
		this.codigo = codigo;
		this.numero = numero;
	}


	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Telefone [codigo=" + codigo + ", numero=" + numero + "]";
	}
	
	
	
}
