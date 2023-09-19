package br.com.aula20230915;

public class ControleFluxoIFOperadorLogico {
	
	public static void main(String ... args) {
		
		// IF COM OPERADORES LÓGICOS
		
		// Cria uma variável 'idade2' e a inicializa com o valor 21
		Integer idade2 = 21;
		
		// Cria uma variável 'ehAluno' e a inicializa como falso
		Boolean ehAluno = false;
		
		// Verifica se 'idade2' é maior ou igual a 18 e 'ehAluno' é falso
		if (idade2 >= 18 && ehAluno == false) {
			System.out.println("Maior de Idade!");
		} else {
			System.out.println("Menor de Idade!");
		}
		
		// Verifica se 'idade2' é maior ou igual a 18 ou 'ehAluno' é falso
		if (idade2 >= 18 || ehAluno == false) {
			System.out.println("Maior de Idade!");
		} else {
			System.out.println("Menor de Idade!");
		}
	}
}
