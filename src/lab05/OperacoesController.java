/**
* Laboratorio de Programacao 2 - Lab 5
*
* @author Matheus da Silva Coimbra Patriota - 117210391
*/

package lab05;

import java.util.ArrayList;


public class OperacoesController {

	private ArrayList<Cenario> cenarios;
	private int caixa;
	private double taxa;
	private int rateioCenario;
	private int numeracaoCenarioCadastrado;


	/**
	 * Construtor da classe Operacoes responsavel por inicializar sua classe e seus atributos.
	 */
	public OperacoesController() {
		
		this.cenarios = new ArrayList<>();
		this.caixa = 0;
		this.taxa = 0;
		this.rateioCenario = 0;
		this.numeracaoCenarioCadastrado = 0;
		
	}
	
	/**
	 * metodo responsavel por inicializar o sistema de apostas
	 * recebendo como parametro caixa e taxa.
	 * 
	 * @param caixa - Total em centavos do caixa do sistema.
	 * @param taxa - taxa de retirada das apostas perdedoras
	 */
	public void inicializarSistema(int caixa, double taxa) {
		
		this.caixa = caixa;
		this.taxa = taxa;
;
	}
	
	/**
	 * metodo responsavel por cadastras um cenario, recebendo como
	 * parametro uma descricao.
	 * 
	 * @param descricao - Descricao de um cenario qualquer que pode ocorrer ou nao.
	 */
	public int cadastrarCenario(String descricao) {
		
		Cenario cenario = new Cenario(descricao);
		cenarios.add(cenario);
		numeracaoCenarioCadastrado ++;
		return numeracaoCenarioCadastrado;
		
	}
	
	/**
	 * metodo responsavel por exibir o Cenario especifico a partir da numeracao do cenario.
	 *  
	 * @param numeracaoCenario - Numeracao inteira do cenario.
	 * @return - Retorna uma String que representa o cenario escolhido.
	 */
	public String exibirCenario(int numeracaoCenario) {
		
		return numeracaoCenario + " - " + cenarios.get(numeracaoCenario-1);

	}
	
	/**
	 * metodo responsavel por listar todos os cenarios cadastrados.
	 * 
	 * @return - Retorna uma String com todos os cenarios cadastrados.
	 */
	public String listarCenarios() {
		
		String listaDeCenarios = "";
		for (int i = 0; i < cenarios.size(); i++) {
			
			listaDeCenarios += i+1 + " - " + cenarios.get(i) + System.lineSeparator();
		}
		
		return listaDeCenarios;
	}
	
	/**
	 * metodo responsavel por cadastrar uma nova aposta em um cenario especifico, passando como parametro
	 * a numeracaoCenario, apostador e previsao.
	 * 
	 * @param numeracaoCenario - Numeracao inteira do cenario que deve-se cadastrar a aposta.
	 * @param apostador - String com o nome do apostador.
	 * @param valor - O valor a ser apostado.
	 * @param previsao - Prever se o evento vai acontecer ou nao.
	 */
	public void cadastrarApostas(int numeracaoCenario, String apostador, int valor, String previsao) {
		
		cenarios.get(numeracaoCenario-1).cadastrarApostas(apostador, valor, previsao);
		cenarios.get(numeracaoCenario-1).setTotalDeApostas();
		cenarios.get(numeracaoCenario-1).setValorTotalApostas(valor);
		
	}
	
	/**
	 * metodo responsavel por retornar o total do valor de apostas de um cenario especifico.
	 * 
	 * @param numeracaoCenario - Numeracao inteira do cenario.
	 * @return - Retorna um numero inteiro que representa o valor total de apostas no cenario. 
	 */
	public int valorTotalDeApostas(int numeracaoCenario) {
		
		return cenarios.get(numeracaoCenario-1).getValorTotalApostas();
	}
	
	/**
	 * metodo responsavel por retornar o numero total de apostas no cenario especifico recebendo como parametro
	 * a numeracaoCenario.
	 * 
	 * @param numeracaoCenario - Numeracao inteira do cenario.
	 * @return - Retorna a quantidade em inteiro de apostas no cenario.
	 */
	public int totalDeApostas(int numeracaoCenario) {
		
		return cenarios.get(numeracaoCenario-1).getTotalDeApostas();
	}
	
	/**
	 * metodo responsavel por exibir todas as apostas feitas em um cenario recebendo como parametro
	 * a numeracaoCenario.
	 * 
	 * @param numeracaoCenario - Numeracao inteira do cenario.
	 * @return - Retorna uma String com todas as apostas feitas no cenario.
	 */
	public String exibeApostas(int numeracaoCenario) {
		
		String exibindoApostas = "";
		for (int i = 0; i < cenarios.get(numeracaoCenario-1).getArrayDeApostas().size(); i++) {
			exibindoApostas += "- " + cenarios.get(numeracaoCenario-1).getArrayDeApostas().get(i) + System.lineSeparator();
		}
		
		
		return exibindoApostas;
		
	}
	
	/**
	 * metodo responsavel por fechar uma aposta recebendo como parametro a
	 * numeracaoCenario e um boolean determinando se ocorreu ou nao.
	 * 
	 * @param numeracaoCenario - Numeracao em inteiro do cenario.
	 * @param ocorreu - valor booleano representando se o Cenario ocorreu ou nao.
	 */
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
