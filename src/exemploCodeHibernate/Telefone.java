package exemploCodeHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONES")
public class Telefone {
	@Id
	@Column(name = "NUMERO_TELEFONE")
	private String numero;

	@ManyToOne
	private Pessoa pessoa;

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "CODIGO_PAIS")
	private Pais pais;

	public Telefone() {
	}
	public Telefone(String numero, Pais pais) {
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

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public String toString() {
		return pais + "." + numero;
	}

}
