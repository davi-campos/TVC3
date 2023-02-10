package br.ufjf.dcc.poo.model;

public class Pedido {
	///atributos e variaveis
	private CarrinhoCompras carrinho = new CarrinhoCompras();
	private Pagamento pagamento = new Pagamento();
	
	//getters e setters
	public CarrinhoCompras getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	//metodos
	public void criarPagamento() {
		
	}
	public void fecharPedido() {
		
	}
	public void buscarPedido() {
		
	}
	public int gerarNumeroPedido() {
		return 0;
	}
	
	

}
