package com.arkazero.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona implements InitializingBean, DisposableBean{
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	/*
	 * Otra manera de ejecutar que un metodo se ejcute al momento de iniciar o finalizar podemos utilizar, es importante
	 * que se aliminen en el bean.xml las propiedades init-method="init" destroy-method="destroy" y marcar que bean sera 
	 * el reponsable de manejo de las anotaciones
	 * <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"></bean>
	 * 
	 * @PostConstruct
	 */
	/*
	private void init(){
		System.out.println("Metodod llamado al iniciar el bean, el nombre del metodo puede ser cualquiera");
	}
	*/
	/*
	 * Otra manera de ejecutar que un metodo se ejcute al momento de iniciar o finalizar podemos utilizar
	 * @PreDestroy
	 */
	/*
	private void destroy(){
		System.out.println("Metodod llamado al cerrar o destruir el bean, el nombre del metodo puede ser cualquiera");
	}*/

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	//Es el metodo que se ejecuta antes de inicializar el bean, esta forma se usa cuando usamos iterfaces
	
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Metodod llamado al iniciar el bean, el nombre del metodo puede ser cualquiera");
	}

	public void destroy() throws Exception {
		System.out.println("Metodod llamado al cerrar o destruir el bean, el nombre del metodo puede ser cualquiera");
	}
}
