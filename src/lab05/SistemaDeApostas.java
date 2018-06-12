package lab05;

public class SistemaDeApostas {
	
	public static void main(String[] args) {
		
		
		Operacoes operacao = new Operacoes();
		operacao.cadastrarCenario("aaa");
		operacao.cadastrarCenario("ccc");
		operacao.cadastrarCenario("ddd");
		System.out.println(operacao.listarCenarios());
		
	}

}
