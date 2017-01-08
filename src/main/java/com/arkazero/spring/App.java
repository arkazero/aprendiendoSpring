package com.arkazero.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arkazero.beans.Mundo;

public class App {

	public static void main(String[] args) {
		//cargo el beans.xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/arkazero/xml/beans.xml");
		//Hago referencia a la propiedad del beans
		Mundo m = (Mundo) appContext.getBean("mundo");
		//Accedo al get del bean, e imprimo el valor cargo dentro del beans.xml
		System.out.println(m.getSaludo());
		//cerrar el contexto
		((ConfigurableApplicationContext)appContext).close();
	}

}
