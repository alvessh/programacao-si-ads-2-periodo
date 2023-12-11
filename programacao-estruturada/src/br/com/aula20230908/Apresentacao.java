package br.com.aula20230908;

import java.util.Scanner;

public class Apresentacao {

	public static void main(String ... args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Se Apresente por favor:");
		String messagem = scanner.nextLine();
		
		System.out.println(messagem);
		
		System.out.println("Diga uma letra: ");
		String letra = scanner.nextLine();
		System.out.println("EU digitei a letra: " + letra);
	}
}
