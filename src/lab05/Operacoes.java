package lab05;

import java.util.ArrayList;
import java.util.HashMap;

public class Operacoes {

	private HashMap<Integer, Cenario> mapaDeCenarios = new HashMap<>();
	private HashMap<Integer, ArrayList<String>> mapaDeApostas = new HashMap<>();
	private ArrayList<String> arrayDeApostas = new ArrayList<>();
	private String dadosAposta ="";
	private int caixa = 0;
	private double taxa = 0;
	private int rateioCenario = 0;
	private int numeracaoDoCenario = 1;


	
	public Operacoes() {
		
	}
	
	public void inicializarSistema(int caixa, double taxa) {
		
		this.caixa = caixa;
		this.taxa = taxa;
		
	}
	
	public void cadastrarCenario(String descricao) {
		
		Cenario cenario = new Cenario(descricao);
		mapaDeCenarios.put(numeracaoDoCenario, cenario);
		cenario.setNumeracaoDoCenario(this.numeracaoDoCenario);
		numeracaoDoCenario++;
		
	}
	
	public Cenario exibirCenario(int numeracaoCenario) {
		
		return mapaDeCenarios.get(numeracaoCenario);

	}
	
	public String listarCenarios() {
		
		String listaDeCenarios = "";
		for (int i = 0; i < mapaDeCenarios.size(); i++) {
			
			listaDeCenarios += mapaDeCenarios.get(i+1) + System.lineSeparator();
		}
		
		return listaDeCenarios;
	}
	
	public void cadastrarApostas(int numeracaoCenario, String apostador, int valor, String previsao) {
		

		dadosAposta = apostador + " - " + valor + " - " + previsao;
		arrayDeApostas.add(dadosAposta);
		mapaDeApostas.put(numeracaoCenario, arrayDeApostas);

	}
	
	public int valorTotalDeApostas(int posicaoCenario) {
		
		return 0;
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
