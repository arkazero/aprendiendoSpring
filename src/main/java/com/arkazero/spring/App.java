package com.arkazero.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arkazero.beans.AppConfig;
import com.arkazero.beans.AppConfig2;
import com.arkazero.beans.Barcelona;
import com.arkazero.beans.Ciudad;
import com.arkazero.beans.Jugador;
import com.arkazero.beans.Mundo;
import com.arkazero.beans.Persona;
import com.arkazero.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		//cargo el beans.xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/arkazero/xml/beans.xml");
		
		Jugador jug = (Jugador) appContext.getBean("messi");
		
		//Podria utilizar el contexto el bean Juventus
		//IEquipo bar = (IEquipo) appContext.getBean("barcelona");
		
		//System.out.println(bar.mostrar());
		System.out.println(jug.getNombre() + "-" + jug.getEquipo().mostrar());
		((ConfigurableApplicationContext)appContext).close();
	}

}
