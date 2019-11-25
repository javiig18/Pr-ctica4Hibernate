package aad.utilidades;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Responsable de crear un objeto sesi�n (gestiona la conexi�n a BD de forma
 * transparente
 * 
 * @author Laura
 *
 */
public class Utilidades {

	// Factoria de sesi�n para crear objeto sesi�n a partir de XML
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {

		try {

			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();

		} catch (HibernateException he) {
			System.out.println("Session Factory creation failure");
			throw he;
		}
	}

	/*
	 * M�todo est�tico (Fachada) para crear la factor�a de sesiones
	 */
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

}