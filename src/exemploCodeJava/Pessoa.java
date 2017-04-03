package exemploCodeJava;

public class Pessoa {

	private int codigo;
	private String nome;
	private Telefone telefone;

	public Pessoa() {}
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public void imprimePessoa() {
		System.out.println(this.codigo + " Nome: " + this.nome + ".");
	}
}
