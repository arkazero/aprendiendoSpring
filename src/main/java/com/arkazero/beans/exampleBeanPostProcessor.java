package com.arkazero.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class exampleBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Despues de inicializar el bean "+ nombreBean);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Antes de inicializar el bean "+ nombreBean);
		return bean;
	}

}
