package lab05;

import java.util.ArrayList;

public class Cenario {
	
	
	private String descricao;
	private String status;
	private ArrayList<Apostas> arrayDeApostas;
	private int valorTotalApostas;
	private int totalDeApostas;
	private int ganhadores;
	private int caixaCenario;
	
	
	public Cenario(String descricao) {
		
		this.descricao = descricao;
		this.status = "Não finalizado";
		this.arrayDeApostas = new ArrayList<>();
		this.valorTotalApostas = 0;
		this.totalDeApostas = 0;
		this.ganhadores = 0;
		this.caixaCenario = 0;
	}
	
	public void cadastrarApostas(String apostador, int valor, String previsao) {
		
		Apostas aposta = new Apostas(apostador, valor, previsao);
		arrayDeApostas.add(aposta);
		
		
	}
	
	public int getCaixaCenario() {
		return caixaCenario;
	}
	
	public int getTotalDeApostas() {
		return totalDeApostas;
	}
	
	public int getGanhadores() {
		return ganhadores;
	}
	
	public ArrayList<Apostas> getArrayDeApostas() {
		return arrayDeApostas;
	}
	
	public int getValorTotalApostas() {
		return valorTotalApostas;
	}
	
	public void setCaixaCenario(int caixaCenario) {
		this.caixaCenario += caixaCenario;
	}
	
	public void setTotalDeApostas() {
		this.totalDeApostas ++;
	}
	
	public void setPerdedores() {
		this.ganhadores ++;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setValorTotalApostas(int valorTotalApostas) {
		
		this.valorTotalApostas += valorTotalApostas;
	}
	
	
	@Override
	public String toString() {
		
		return  descricao + " - " + status;
	}
	
	
	 
}
