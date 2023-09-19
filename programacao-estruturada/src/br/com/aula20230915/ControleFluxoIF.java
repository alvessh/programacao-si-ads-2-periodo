package br.com.aula20230915;

public class ControleFluxoIF {
	
	public static void main(String ... args) {
		// IF
		
		// Cria uma variável 'idade' e a inicializa com o valor 21
		Integer idade = 21;
		
		// Verifica se a 'idade' é maior ou igual a 18
		if (idade >= 18) {
			// Se a condição for verdadeira, imprime "Maior de Idade!"
			System.out.println("Maior de Idade!");
		} else {
			// Se a condição for falsa, imprime "Menor de Idade!"
			System.out.println("Menor de Idade!");
		}
	}
}