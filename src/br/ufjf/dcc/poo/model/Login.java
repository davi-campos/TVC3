package br.ufjf.dcc.poo.model;

public class Login {
	//atributos e variaveis
	private String usuario;
	private String senha;
	
	private CarrinhoCompras carrinho = new CarrinhoCompras();
	
	//getters e setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public CarrinhoCompras getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}
	//metodos
	public void createUsuario() {
		
	}
	public void efetudarLogin() {
		
	}

}
