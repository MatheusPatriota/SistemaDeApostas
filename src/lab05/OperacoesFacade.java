package lab05;

public class OperacoesFacade {

	OperacoesController operacao;
	
	public OperacoesFacade() {
		
		this.operacao = new OperacoesController();
	}
	
	public void inicializarSistema(int caixa, double taxa) {
		
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
	
	public void cadastrarApostas(int numeracaoCenario, String apostador, int valor, String previsao) {
		
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
