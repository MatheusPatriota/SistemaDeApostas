package lab05;

import easyaccept.EasyAccept;

public class OperacoesFacade {
	
	public static void main(String[] args) {
		
		args = new String[] {"lab05.OperacoesFacade","acceptance_test/us1_test.txt", "acceptance_test/us2_test.txt",
		"acceptance_test/us3_test.txt",	"acceptance_test/us4_test.txt"};
		EasyAccept.main(args);
	}
	
	OperacoesController operacao;
	
	public OperacoesFacade() {
		
		this.operacao = new OperacoesController();
	}
	
	public void inicializa(int caixa, double taxa) {
		
		operacao.inicializarSistema(caixa, taxa);
	}
	
	public int cadastrarCenario(String descricao) {
		
		return operacao.cadastrarCenario(descricao);
	}
	
	public String exibirCenario(int numeracaoCenario) {
		
		return operacao.exibirCenario(numeracaoCenario);
	}
	
	public String listarCenarios() {
		
		return operacao.listarCenarios();
	}
	
	public void cadastrarAposta(int numeracaoCenario, String apostador, int valor, String previsao) {
		
		operacao.cadastrarApostas(numeracaoCenario, apostador, valor, previsao);
	}
	
	public int valorTotalDeApostas(int numeracaoCenario) {
		
		return operacao.valorTotalDeApostas(numeracaoCenario);
	}
	
	public int totalDeApostas(int numeracaoCenario) {
		
		return operacao.totalDeApostas(numeracaoCenario);
	}
	
	public String exibeApostas(int numeracaoCenario) {
		
		return operacao.exibeApostas(numeracaoCenario);
	}
	
	public void fecharAposta(int numeracaoCenario, boolean ocorreu) {
		
		operacao.fecharAposta(numeracaoCenario, ocorreu);
	}
	
	public int getCaixaCenario(int numeracaoCenario) {
		
		return operacao.getCaixaCenario(numeracaoCenario);
	}
	
	public int getTotalRateioCenario(int numeracaoCenario) {
		
		return operacao.getTotalRateioCenario(numeracaoCenario);
	}
	
	public int getCaixa() {
		
		return operacao.getCaixa();
	}
	
	
}
