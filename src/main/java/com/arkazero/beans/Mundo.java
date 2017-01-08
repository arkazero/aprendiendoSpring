package com.arkazero.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	//Se utiliza cuando se realizan las dependencias por medio de anotaciones
	@Value("Hola Mundo")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	

}
