package br.ufjf.dcc.poo.model;

public class Pedido {
	///atributos e variaveis
	private int numero;
	private CarrinhoCompras carrinho = new CarrinhoCompras();
	private Pagamento pagamento = new Pagamento();
	
	//getters e setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
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
	
	

}
