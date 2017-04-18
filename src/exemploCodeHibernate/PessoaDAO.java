package exemploCodeHibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PessoaDAO {

	private static SessionFactory factory;
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		PessoaDAO dao = new PessoaDAO();
		dao.addPessoa("Cassio Trindade", "99999991");
	
	}
	
	public Integer addPessoa(String name, String telefone ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer pessoaID = null;
	      try{
	         tx = session.beginTransaction();
	         Pais pais = new Pais(55);
	         Telefone tel = new Telefone(telefone, pais);
	         Pessoa pessoa = new Pessoa(name);
	         pessoaID = (Integer) session.save(pessoa); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return pessoaID;
	   }
}