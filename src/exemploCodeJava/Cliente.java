package exemploCodeJava;

public class Cliente extends Pessoa {

	private String cpf;

	public Cliente() {	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void validarCpf() {
		if( this.cpf.length() > 14) System.out.println("OK CPF");
	}
	public boolean validarCpf(int n) {
		if( this.cpf.length() > n) {
			System.out.println("OK CNPJ");
			return true;
		}
		return false;
	}
}
