package lab05;

public class SistemaDeApostas {
	
	public static void main(String[] args) {
		
		
		OperacoesFacade operacao = new OperacoesFacade();
		operacao.inicializa(10000, 0.01);
		/**
		 *  Operacoes realacionadas a Cenario
		 */
		operacao.cadastrarCenario("RED vai ganhar o CBLOL");
		operacao.cadastrarCenario("RED vai ganhar da Kabum");
		operacao.cadastrarCenario("RED vai ganhar o mundial ");
		System.out.println(operacao.exibirCenario(2));
		System.out.println();
		System.out.println(operacao.listarCenarios());
		
		/**
		 * Operacoes relacionadas a Aposta
		 */
		operacao.cadastrarAposta(1, "Matheus Patriota", 10000, "VAI ACONTECER");
		operacao.cadastrarAposta(1, "Matheus Patriota", 50, "N VAI ACONTECER");
		operacao.cadastrarAposta(2, "Matheus Patriota", 50, "VAI ACONTECER");
		operacao.cadastrarAposta(2, "Matheus Patriota", 10000, "N VAI ACONTECER");
		System.out.println(operacao.valorTotalDeApostas(1));
		System.out.println();
		System.out.println(operacao.totalDeApostas(1));
		System.out.println();
		System.out.println(operacao.exibeApostas(1));
		operacao.fecharAposta(1, false);
		operacao.fecharAposta(2, true);
		System.out.println(operacao.getCaixa());
		System.out.println(operacao.getCaixaCenario(1));
		System.out.println(operacao.getTotalRateioCenario(1));
		System.out.println();
		System.out.println(operacao.getCaixa());
		System.out.println(operacao.getCaixaCenario(2));
		System.out.println(operacao.getTotalRateioCenario(2));
		
	}

}
