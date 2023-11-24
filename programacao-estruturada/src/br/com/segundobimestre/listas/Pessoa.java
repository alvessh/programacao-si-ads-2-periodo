package br.com.segundobimestre.listas;

public class Pessoa {
	private String nome; //"Itamar"
	private Integer idade; //32
	private String endereco; //Rua do não te interessa
	private String telefone; // 69 9 9999-9999
	private String email;
	private Boolean ehCasado; //true
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Boolean getEhCasado() {
		return ehCasado;
	}
	public void setEhCasado(Boolean ehCasado) {
		this.ehCasado = ehCasado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}