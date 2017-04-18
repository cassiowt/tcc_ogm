package exemploCodeHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Gerenciador {
	private static EntityManager em;
	private static EntityManagerFactory factory;

	public static EntityManager getFactory() {
		try {

			if (factory != null)
				return em;
			else {
				factory = Persistence.createEntityManagerFactory("tcc_ogm");
				em = factory.createEntityManager();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return em;
	}
}
