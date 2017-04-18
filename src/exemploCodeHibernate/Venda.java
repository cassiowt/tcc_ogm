package exemploCodeHibernate;

import java.util.Date;

public class Venda {

	private Date dataVenda;
	private float valorTotal;
	
	public Venda() {}
	public Venda(Date dataVenda, float valorTotal) {
		super();
		this.dataVenda = dataVenda;
		this.valorTotal = valorTotal;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}	
}
