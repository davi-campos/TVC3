package br.ufjf.dcc.poo.model;

import java.util.Date;

public class Pagamento {
	///atributos e variaveis
	private int codigoProduto;
	private String nome;
	private String descricao;
	private float preco;
	private Date dataPagamento;
	
	//getters e setters	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
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