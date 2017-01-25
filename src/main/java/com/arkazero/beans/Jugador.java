package com.arkazero.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.arkazero.interfaces.IEquipo;

public class Jugador {
	
	private int numero;
	private String nombre;

	private IEquipo equipo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	//Accion que hace que la propiedad sea definida - Es propia de Spring
	//@Required
	
	@Autowired
	@Qualifier("barcelonaQualifier")
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
}
