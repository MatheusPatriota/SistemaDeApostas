package lab05;

import java.util.ArrayList;


public class Operacoes {

	private ArrayList<Cenario> cenarios = new ArrayList<>();
	private int caixa = 0;
	private double taxa = 0;
	private int rateioCenario = 0;


	
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
	
	public String exibirCenario(int numeracaoCenario) {
		
		return numeracaoCenario + " - " + cenarios.get(numeracaoCenario-1);

	}
	
	public String listarCenarios() {
		
		String listaDeCenarios = "";
		for (int i = 0; i < cenarios.size(); i++) {
			
			listaDeCenarios += i+1 + " - " + cenarios.get(i) + System.lineSeparator();
		}
		
		return listaDeCenarios;
	}
	
	public void cadastrarApostas(int numeracaoCenario, String apostador, int valor, String previsao) {
		
		cenarios.get(numeracaoCenario-1).cadastrarApostas(apostador, valor, previsao);
		cenarios.get(numeracaoCenario-1).setTotalDeApostas();
		cenarios.get(numeracaoCenario-1).setValorTotalApostas(valor);
		
	}
	
	public int valorTotalDeApostas(int numeracaoCenario) {
		
		return cenarios.get(numeracaoCenario-1).getValorTotalApostas();
	}
	
	public int totalDeApostas(int numeracaoCenario) {
		
		return cenarios.get(numeracaoCenario-1).getTotalDeApostas();
	}
	
	public String exibeApostas(int numeracaoCenario) {
		
		String exibindoApostas = "";
		for (int i = 0; i < cenarios.get(numeracaoCenario-1).getArrayDeApostas().size(); i++) {
			exibindoApostas += "- " + cenarios.get(numeracaoCenario-1).getArrayDeApostas().get(i) + System.lineSeparator();
		}
		
		
		return exibindoApostas;
		
	}
	
	public void fecharAposta(int numeracaoCenario, boolean ocorreu) {
		
		if (ocorreu  == true) {
			
			for (int i = 0; i <cenarios.get(numeracaoCenario-1).getArrayDeApostas().size(); i++) {
				
				if (cenarios.get(numeracaoCenario-1).getArrayDeApostas().get(i).getPrevisao().equals("N VAI ACONTECER")) {
					
					cenarios.get(numeracaoCenario-1).setCaixaCenario(cenarios.get(numeracaoCenario-1).getArrayDeApostas().get(i).getValor());
					
				}
				
				else {
					cenarios.get(numeracaoCenario-1).setPerdedores();
				}
			}
			
			caixa += (cenarios.get(numeracaoCenario-1).getCaixaCenario() * taxa) * 100;
			rateioCenario = (int) (cenarios.get(numeracaoCenario-1).getCaixaCenario() - cenarios.get(numeracaoCenario-1).getCaixaCenario() * taxa);
			cenarios.get(numeracaoCenario-1).setStatus("Finalizado (ocorreu)");
		}
		
		else {
			
			for (int i = 0; i <cenarios.get(numeracaoCenario-1).getArrayDeApostas().size(); i++) {
				
				if (cenarios.get(numeracaoCenario-1).getArrayDeApostas().get(i).getPrevisao().equals("VAI ACONTECER")) {
					
					cenarios.get(numeracaoCenario-1).setCaixaCenario(cenarios.get(numeracaoCenario-1).getArrayDeApostas().get(i).getValor());
				}
				
				else {
					cenarios.get(numeracaoCenario-1).setPerdedores();
				}
				
			}
			
			caixa += (cenarios.get(numeracaoCenario-1).getCaixaCenario() * taxa) * 100;
			rateioCenario = (int) (cenarios.get(numeracaoCenario-1).getCaixaCenario() - cenarios.get(numeracaoCenario-1).getCaixaCenario() * taxa);
			cenarios.get(numeracaoCenario-1).setStatus("Finalizado (não ocorreu)");
		}
		
	}
	
	
	public int getCaixaCenario(int numeracaoCenario) {
		
		return cenarios.get(numeracaoCenario-1).getCaixaCenario();
	}
	
	public int getTotalRateioCenario(int numeracaoCenario) {
		
		return rateioCenario/cenarios.get(numeracaoCenario-1).getGanhadores();
	}
	
	public int getCaixa() {
		return caixa;
	}
	
}
