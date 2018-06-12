package lab05;

import java.util.HashMap;

public class Operacoes {

	private HashMap<String, String> mapaCenarios = new HashMap<>();
	private int caixa;
	private double taxa;
	private int rateioCenario;
	private int numeracaoCenario;

	
	public Operacoes() {
		
	}
	
	public void inicializarSistema(int caixa, double taxa) {
		
		this.caixa = caixa;
		this.taxa = taxa;
		
	}
	
	public void cadastrarCenarior(String descricao) {
		
		
	}
	
	public void exibirCenario(int numeracaoCenario) {
		

	}
	
	public void listarCenarios() {
		
	}
	
	public void cadastrarApostas(int numeracaoCenario, String apostador, int valor, String previsao) {
			
	}
	
	public void valorTotalDeApostas(int posicaoCenario) {
		
	}
	
	public void totalDeApostas() {
		
	}
	
	public void exibeApostas(int Cenario) {
		
	}
	
	public void fecharAposta() {
		
	}
	
	
	public int getCaixa() {
		return caixa;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
	public int getRateioCenario() {
		return rateioCenario;
	}
}
