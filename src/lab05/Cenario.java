package lab05;

public class Cenario {
	
	private int numeracaoDoCenario = 1;
	private String descricao;
	private String status;
	
	public Cenario(String descricao) {
		
		this.descricao = descricao;
		this.status = "Não finalizado";
	}
	
	public int getNumeracaoDoCenario() {
		return numeracaoDoCenario;
	}
	public void setNumeracaoDoCenario(int numeracaoDoCenario) {
		this.numeracaoDoCenario = numeracaoDoCenario;
	}
	
	@Override
	public String toString() {
		
		return numeracaoDoCenario + " - " + descricao + " - " + status;
	}
	
	
	
}
