package cadastro.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cadastro.cliente.Cliente;
import cadastro.usuario.Usuario;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Usuario.class);
		cfg.addAnnotatedClass(Cliente.class);
		return cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
