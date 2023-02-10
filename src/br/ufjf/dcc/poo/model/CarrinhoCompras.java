package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	///atributos e variaveis
	private Pedido pedido = new Pedido();
	private List<ItensCompra> carrinho = new ArrayList<ItensCompra>();
	
	//getter e setters	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public List<ItensCompra> getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(List<ItensCompra> carrinho) {
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

