package lab05;

import java.util.ArrayList;

public class Cenario {
	
	private int numeracaoDoCenario = 0;
	private String descricao;
	private String status;
	private ArrayList<Apostas> arrayDeApostas;
	
	public Cenario(String descricao) {
		
		this.descricao = descricao;
		this.status = "Não finalizado";
		this.arrayDeApostas = new ArrayList<>();
		this.numeracaoDoCenario ++;
	}
	
	public void cadastrarApostas(String apostador, int valor, String previsao) {
		
		Apostas aposta = new Apostas(apostador, valor, previsao);
		this.arrayDeApostas.add(aposta);
		
	}
	
	public ArrayList<Apostas> getArrayDeApostas() {
		return arrayDeApostas;
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
