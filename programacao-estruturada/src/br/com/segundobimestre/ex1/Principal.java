package br.com.segundobimestre.ex1;

public class Principal {
	///vou brincar com a cadeira.
	public static void main(String[] args) {
		Cadeira cadeira = new Cadeira();
		cadeira.material = "Madeira";
		cadeira.cor = "zebrado";
		cadeira.altura = 1.0;
		cadeira.largura = 1.10;
		cadeira.comprimento = 2.0;
		cadeira.giratoria = true;
		cadeira.reclinavel = false;
		cadeira.possuiApoioBracos = false;
		cadeira.possuiApoioPernas = false;
		cadeira.ajustavelAltura = false;
		
//		cadeira.mostrarConfiguracoes();
//		
//		cadeira.aumentarLargura(30.0);
//		
//		cadeira.mostrarConfiguracoes();
		
//		cadeira.girar();
		
		
		///vou brincar com a pessoa.
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Ford";
		pessoa.cumprimentar();
		
		pessoa.altura = 3.0;
		pessoa.peso = 190.0;
		
		double resultadoIMC = pessoa.calcularIMC();
		System.out.println(resultadoIMC);
		
		pessoa.idade = 150;
		
		pessoa.fazerAniversario();
		System.out.println("Idade: " + pessoa.idade);
		
	}

}
