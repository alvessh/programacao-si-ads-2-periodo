package br.com.questionario;

import java.util.Scanner;

/**
 * Tabuada: Escreva um programa em Java que exiba a tabuada de 
 * multiplicação de um número inteiro fornecido.
 */
public class QuestaoTreze {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema de tabuada!");
		System.out.println("=====================================");
		System.out.println("Informe o número que deseja calcular a tabuada: ");
		Integer numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			
			System.out.println(numero + " x " + i + " = " + resultado);
			
		}

	}
}
