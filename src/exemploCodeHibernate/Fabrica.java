package exemploCodeHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
	static EntityManagerFactory factory;
	static EntityManager manager;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory("tcc_ogm");
		manager = factory.createEntityManager();
		manager.close();
		factory.close();
	}
}
