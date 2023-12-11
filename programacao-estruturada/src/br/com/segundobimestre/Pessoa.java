package br.com.segundobimestre;

public class Pessoa {
	String nome;
	Integer idade;
	String sexo;
	Double altura;
	
	public void mostrarAtributos() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Altura: " + altura);
	}
	
	public void andar() {
		System.out.println("Estou andando...");
	}
	
	public void falar() {
		System.out.println("Estou falando...");
	}
	
	public void comer() {
		System.out.println("Estou me alimentando...");
	}
	
	public void dormir() {
		System.out.println("Estou off...");
	}
	
	public void pensar() {
		System.out.println("..................");
	}
	
	public void nadar() {
		System.out.println("Estou nadando...");
	}

}
