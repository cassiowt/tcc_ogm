package exemploCodeHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaRepository {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {

		entityManagerFactory = Persistence.createEntityManagerFactory("tcc_ogm");

		entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		Pais pais = new Pais(51);
		Pessoa pessoa1 = new Pessoa("Getulio Vargas");
		Pessoa pessoa2 = new Pessoa("Ada Lovelace");

		Telefone tel1 = new Telefone("999999991", pais);
		Telefone tel2 = new Telefone("999999992", pais);
		Telefone tel3 = new Telefone("999999993", pais);
		Telefone tel4 = new Telefone("999999994", pais);
		Telefone tel5 = new Telefone("999654323", pais);
		
		pessoa1.getTelefone().add(tel1);
		pessoa1.getTelefone().add(tel2);
		pessoa1.getTelefone().add(tel3);
		pessoa1.getTelefone().add(tel4);
		pessoa2.getTelefone().add(tel5);
		pessoa2.getTelefone().add(tel1);
		
		tel2.setPessoa(pessoa1);
		tel3.setPessoa(pessoa1);
		tel4.setPessoa(pessoa1);
		tel1.setPessoa(pessoa2);
		tel5.setPessoa(pessoa2);
		
		entityManager.persist(pessoa1);
		entityManager.persist(pessoa2);
		
		entityManager.getTransaction().commit();
	}

	public void save(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}
}