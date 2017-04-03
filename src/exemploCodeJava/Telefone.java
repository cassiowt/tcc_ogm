package exemploCodeJava;

public class Telefone {

	private String numero;
	private Pais pais;
	
	public Telefone() {}
	public Telefone(String numero, Pais pais) {
		super();
		this.numero = numero;
		this.pais = pais;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
