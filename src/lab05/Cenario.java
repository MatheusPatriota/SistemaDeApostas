package lab05;

public class Cenario {
	
	private int numeracaoDoCenario;
	private String descricao;
	private String status;
	
	public Cenario(String descricao) {
		
		this.numeracaoDoCenario +=1;
		this.descricao = descricao;
		this.status = "Não finalizado";
	}
	
	public int getNumeracaoDoCenario() {
		return numeracaoDoCenario;
	}
	
	@Override
	public String toString() {
		
		return numeracaoDoCenario + " - " + descricao + " - " + status;
	}
	
	
	
}
