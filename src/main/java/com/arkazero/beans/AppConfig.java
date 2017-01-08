package com.arkazero.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	//hace referencia al bean manejado 
	@Bean
	public Mundo mundo(){
		return new Mundo();
	}
}
