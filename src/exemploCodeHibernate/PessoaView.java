package exemploCodeHibernate;

public class PessoaView {
	static PessoaRepository pr = new PessoaRepository();

	public static void main(String[] args) {
	    gravaPessoa();
		/*
		pr.lista();
		Pessoa pessoa = pr.busca(4);
		pr.remove(pessoa);
	    pr.lista();
*/
	}

	private static void gravaPessoa() {
		Pais pais = new Pais(50);
		Telefone tel = new Telefone("51-7474747474", pais);
		Pessoa pessoa = new Pessoa("teste Trindade");
		pr.save(pessoa);
	}
}
