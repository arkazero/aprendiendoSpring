package com.arkazero.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arkazero.beans.AppConfig;
import com.arkazero.beans.AppConfig2;
import com.arkazero.beans.Mundo;
import com.arkazero.beans.Persona;

public class App {

	public static void main(String[] args) {
		//cargo el beans.xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/arkazero/xml/beans.xml");
		
		//Clase java donde se define el bean
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		//otra manera para registrar los beans seria
		/**
		 * ApplicationContext appContext = new AnnotationConfigApplicationContext();
		 * appContext.register(AppConfig.class);
		 * appContext.register(AppConfig2.class);
		 * appContext.refresh();
		 * 
		 * Si se necesitan mas beans se registrat y estarias listo para ser usados
		 * Mundo m = (Mundo) appContext.getBean("marte"); 
		 */
		
		//Hago referencia a la propiedad del beans
		//Mundo m = (Mundo) appContext.getBean("mundo");
		Persona per = (Persona) appContext.getBean(Persona.class);
		
		
		//Accedo al get del bean, e imprimo el valor cargo dentro del beans.xml
		System.out.println(per.getId() + " " + per.getNombre() + " "+per.getPais().getNombre());
		//cerrar el contexto
		((ConfigurableApplicationContext)appContext).close();
	}

}
