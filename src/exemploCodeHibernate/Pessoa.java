package exemploCodeHibernate;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PESSOAS")
public  class Pessoa  {
	
	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private UUID codigo;	

	private String nome;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private Set<Telefone> telefone =  new HashSet<>();

	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(Set<Telefone> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}

