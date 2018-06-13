package lab05;

public class SistemaDeApostas {
	
	public static void main(String[] args) {
		
		
		Operacoes operacao = new Operacoes();
		operacao.inicializarSistema(100000, 0.01);
		/**
		 *  Operacoes realacionadas a Cenario
		 */
		operacao.cadastrarCenario("aaa");
		operacao.cadastrarCenario("ccc");
		operacao.cadastrarCenario("ddd");
		System.out.println(operacao.exibirCenario(1));
		System.out.println(operacao.listarCenarios());
		
		/**
		 * Operacoes relacionadas a Aposta
		 */
		// cadastrar aposta
		operacao.cadastrarApostas(1, "Matheus Patriota", 50, "Vai acontecer!");
		operacao.cadastrarApostas(1, "Matheus Patriota", 50, "Vai acontecer!");
		operacao.cadastrarApostas(2, "Matheus Patriota", 50, "Vai acontecer!");
		System.out.println(operacao.valorTotalDeApostas(1));
	}

}
