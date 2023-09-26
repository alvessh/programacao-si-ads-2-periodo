package br.com.questionario;

import java.util.Scanner;

/**
 * Soma de Números: Escreva um programa em Java que 
 * recebe dois números e mostra a soma deles.
 */
public class QuestaoDoze {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema de soma!");
		System.out.println("=====================================");
		System.out.println("Informe o primeiro número: ");
		Double numero1 = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		Double numero2= scanner.nextDouble();

		
		Double soma = numero1 + numero2;
		
		System.out.println("Resultado da soma: " + soma);

	}
}
