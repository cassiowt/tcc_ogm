package exemploCodeJava;

public class Fornecedor extends Pessoa {

	private String cnpj;

	public Fornecedor() {
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void validarCnpj() {
		if( this.cnpj.length() > 14) System.out.println("OK CNPJ");
	}
	public void imprimePessoa() {
		super.imprimePessoa();
		System.out.println(" CNPJ: " + this.cnpj);
	}
}
