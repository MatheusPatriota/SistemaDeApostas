/**
* Laboratorio de Programacao 2 - Lab 5
*
* @author Matheus da Silva Coimbra Patriota - 117210391
*/

package lab05;


public class Apostas {
	
	private String apostador;
	private int valor;
	private String previsao;
	
	/**
	 * Construtor de Apostas responsavel por inicializar sua classe e atributos.
	 * 
	 * @param apostador - Nome de quem está apostando
	 * @param valor - Valor da aposta
	 * @param previsao - Prever se o cenario vai acontecer ou não
	 */
	public Apostas(String apostador, int valor, String previsao) {
		
		if (apostador.equals(null)) {
			
			throw new NullPointerException("Nome do apostador Nulo");
		}
		
		if (previsao.equals(null)) {
			
			throw new NullPointerException("Previsao da aposta está Nula!");
		}
		
		if (valor < 0) {
			
			throw new IllegalArgumentException("Valor negativo não!");
		}
		
		if (apostador.equals("")) {
			
			throw new IllegalArgumentException("Nome do apostador Vazio!");
		}
		
		if (previsao.equals("")) {
			
			throw new IllegalArgumentException("Previsao para a aposta está Vazia!");
		}
		
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
	
	/**
	 * toString para padronizar a exibicao da classe Apostas, usando apostador, valor e previsao.
	 * 
	 * @return - retorna uma string que representa as Apostas
	 */
	@Override
	public String toString() {
		
		return apostador + " - R$" + valor + " - " + previsao;
	}
}
