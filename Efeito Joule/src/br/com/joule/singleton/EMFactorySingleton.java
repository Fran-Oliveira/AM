package br.com.joule.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * EntityManagerFactorySingleton: classe para gerenciar
 * a �nica inst�ncia de EntityManagerFactory
 * @author Natalia
 */
public class EMFactorySingleton {
	
	private static EntityManagerFactory factory;
	
	private EMFactorySingleton() { }
	
	public static EntityManagerFactory getInstance(){
		if (factory == null){
			factory = 
		Persistence
		.createEntityManagerFactory("joule");
		}
		return factory;
	}
}