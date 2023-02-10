package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	///atributos e variaveis	
	private Pedido pedido = new Pedido();
	private ItensCompra itens = new ItensCompra();
	private List<CarrinhoCompras> carrinho = new ArrayList<CarrinhoCompras>();
	
	//getter e setters	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public ItensCompra getItens() {
		return itens;
	}
	public void setItens(ItensCompra itens) {
		this.itens = itens;
	}
	public List<CarrinhoCompras> getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(List<CarrinhoCompras> carrinho) {
		this.carrinho = carrinho;
	}
	
	//metodos
	public void inserirProduto() {
		
	}
	public void excluirProduto() {
		
	}
	public void alterarProduto() {
		
	}
	public void finalizarCompra() {
		
	}

}

