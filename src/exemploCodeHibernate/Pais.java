package exemploCodeHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAISES")
public class Pais {
	@Id
	private int codigoArea;

	public Pais() {}
	public Pais(int codigoArea) {
		this.codigoArea = codigoArea;
	}
	public int getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}
	@Override
	public String toString() {
		return Integer.toString(codigoArea);
	}
	
}
