package lab05;

import java.util.ArrayList;


public class Operacoes {

	private ArrayList<Cenario> cenarios = new ArrayList<>();
	private int caixa = 0;
	private double taxa = 0;
	private int rateioCenario = 0;
	private int totalDeApostas = 0;


	
	public Operacoes() {
		
	}
	
	public void inicializarSistema(int caixa, double taxa) {
		
		this.caixa = caixa;
		this.taxa = taxa;
		
	}
	
	public void cadastrarCenario(String descricao) {
		
		Cenario cenario = new Cenario(descricao);
		cenarios.add(cenario);
		
	}
	
	public Cenario exibirCenario(int numeracaoCenario) {
		
		return cenarios.get(numeracaoCenario);

	}
	
	public String listarCenarios() {
		
		String listaDeCenarios = "";
		for (int i = 0; i < cenarios.size(); i++) {
			
			listaDeCenarios += i+1 + " - " + cenarios.get(i) + System.lineSeparator();
		}
		
		return listaDeCenarios;
	}
	
	public void cadastrarApostas(int numeracaoCenario, String apostador, int valor, String previsao) {
		
		cenarios.get(numeracaoCenario).cadastrarApostas(apostador, valor, previsao);
		totalDeApostas ++;
		
	}
	
	public int valorTotalDeApostas(int posicaoCenario) {
		
		return 0;
	}
	
	public int totalDeApostas() {
		
		return totalDeApostas;
	}
	
	public String exibeApostas(int numeracaoCenario) {
		
		String exibindoApostas = "";
		
		for (int i = 0; i < cenarios.size(); i++) {
			
			exibindoApostas += cenarios.get(i);
		}
		return exibindoApostas;
		
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
