package com.mallbit.genero;

public class Genero {
	
	private int idGenero;
	private String tipo;
	
	public Genero(int idGenero, String genero) {
		this.idGenero = idGenero;
		this.tipo = genero;
	}
	
	public Genero(String genero) {
		this.tipo = genero;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String genero) {
		this.tipo = genero;
	}	
	
}
