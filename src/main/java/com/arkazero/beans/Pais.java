package com.arkazero.beans;

import java.util.List;

public class Pais {
	private String nombre;
	private List<Ciudad> ciudad;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(List<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
