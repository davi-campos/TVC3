package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	///atributos e variaveis
	private int codigoProduto;
	private String nome;
	private String descricao;
	private float preco;
	private EspecificacaoProduto especificacao = new EspecificacaoProduto();
	
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
	public EspecificacaoProduto getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(EspecificacaoProduto especificacao) {
		this.especificacao = especificacao;
	}
	
	///metodos
	public ArrayList<Produto> buscarProduto(Produto produto){
		ArrayList<Produto> produtos = new ArrayList<>();
		return produtos;
	}
	

}
