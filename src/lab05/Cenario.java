/**
* Laboratorio de Programacao 2 - Lab 5
*
* @author Matheus da Silva Coimbra Patriota - 117210391
*/

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
	
	/**
	 * Construtor da classe Cenario responsavel por iniciar a classe e seus atributos.
	 * 
	 * @param descricao - Descricao do cenario possivel
	 */
	public Cenario(String descricao) {
		
		if (descricao.equals(null)) {
			
			throw new NullPointerException("Descrição nula!");
		}
		if (descricao.equals("")) {
			
			throw new IllegalArgumentException("Descrição Vazia!");
		}
		
		this.descricao = descricao;
		this.status = "Não finalizado";
		this.arrayDeApostas = new ArrayList<>();
		this.valorTotalApostas = 0;
		this.totalDeApostas = 0;
		this.ganhadores = 0;
		this.caixaCenario = 0;
	}
	
	/**
	 * metodo responsavel por cadastrar apostas recebendo como parametro
	 * apostador, valor e previsao. 
	 * 
	 * @param apostador - Nome de quem esta apostando.
	 * @param valor - Valor da aposta a ser feita.
	 * @param previsao - Prever se o cenario vai acontecer ou nao.
	 */
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
	
	/**
	 * toString para padronizar a exibicao da classe Cenario utilizando descricao e status.
	 * 
	 * @return - Retorna uma representacao em String da classe Cenario
	 */
	@Override
	public String toString() {
		
		return  descricao + " - " + status;
	}
	
	
	 
}
