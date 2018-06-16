package lab05;

public class Apostas {
	
	private String apostador;
	private int valor;
	private String previsao;

	public Apostas(String apostador, int valor, String previsao) {
		
		this.valor = valor;
		this.apostador = apostador;
		this.previsao = previsao;
	}
	
	public String getPrevisao() {
		return previsao;
	}
	
	public int getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		
		return apostador + " - R$" + valor + " - " + previsao;
	}
}
