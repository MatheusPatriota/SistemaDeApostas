package lab05;

public class SistemaDeApostas {
	
	public static void main(String[] args) {
		
		
		Operacoes operacao = new Operacoes();
		operacao.inicializarSistema(100000, 0.01);
		/**
		 *  Operacoes realacionadas a Cenario
		 */
		operacao.cadastrarCenario("RED vai ganhar o CBLOL");
		operacao.cadastrarCenario("RED vai ganhar da Kabum");
		operacao.cadastrarCenario("RED vai ganhar o mundial ");
		System.out.println(operacao.exibirCenario(1));
		System.out.println();
		System.out.println(operacao.listarCenarios());
		
		/**
		 * Operacoes relacionadas a Aposta
		 */
		// cadastrar aposta
		operacao.cadastrarApostas(1, "Matheus Patriota", 50, "Vai acontecer!");
		operacao.cadastrarApostas(1, "Matheus Patriota", 50, "Vai acontecer!");
		operacao.cadastrarApostas(2, "Matheus Patriota", 50, "Vai acontecer!");
		System.out.println(operacao.valorTotalDeApostas(1));
		System.out.println(operacao.exibeApostas(2));
	}

}
