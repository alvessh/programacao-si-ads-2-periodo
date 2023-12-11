package br.com.segundobimestre;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Itamar";
		pessoa.idade = 10;
		pessoa.sexo = "F";
		pessoa.altura = 2.10;
		
		pessoa.mostrarAtributos();

		System.out.println("==================================");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Batata";
		pessoa2.idade = 15;
		pessoa2.sexo = "M";
		pessoa2.altura = 3.5;
		
		pessoa2.mostrarAtributos();
		
	}
}
