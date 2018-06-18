package lab05;

public class SistemaDeApostas {
	
	public static void main(String[] args) {
		
		
		OperacoesFacade operacao = new OperacoesFacade();
		operacao.inicializarSistema(100000, 0.01);
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
		operacao.cadastrarApostas(1, "Matheus Patriota", 50, "VAI ACONTECER");
		operacao.cadastrarApostas(1, "Matheus Patriota", 50, "N VAI ACONTECER");
		operacao.cadastrarApostas(2, "Matheus Patriota", 50, "N VAI ACONTECER");
		operacao.cadastrarApostas(2, "Matheus Patriota", 20, "VAI ACONTECER");
		operacao.cadastrarApostas(2, "Matheus Patriota", 30, "VAI ACONTECER");
		operacao.cadastrarApostas(2, "Matheus Patriota", 10, "VAI ACONTECER");
		System.out.println(operacao.valorTotalDeApostas(2));
		System.out.println();
		System.out.println(operacao.totalDeApostas(2));
		System.out.println();
		System.out.println(operacao.exibeApostas(2));
		operacao.fecharAposta(2, false);
		System.out.println(operacao.getCaixa());
		System.out.println(operacao.getCaixaCenario(2));
		System.out.println(operacao.getTotalRateioCenario(2));
		System.out.println(operacao.exibirCenario(2));
		
	}

}
