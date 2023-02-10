package br.ufjf.dcc.poo.model;

public class Cliente {
	///atributos e variaveis
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	
	private Login login = new Login();
	
	//getters e setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	//metodos
	public void alterarDados() {
		
	}
	public void excluirConta() {
		
	}

}
