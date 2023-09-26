package br.com.questionario;

import java.util.Scanner;

/**
 * Escreva um programa em Java de Apresentação, 
 * no qual quando executar o programa, vai pedir para o usuário 
 * informar o Nome, e o que faz da vida, após o usuário informar os dados solicitados, 
 * o programa tem que mostrar uma 
 * mensagem no qual vai agradecer o usuário por ter se apresentado.
 */
public class QuestaoOnze {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema de apresentação!");
		System.out.println("=====================================");
		System.out.println("Informe seu nome por gentileza:");
		scanner.nextLine();

		System.out.println("O que você faz da vida? ");
		scanner.nextLine();

		System.out.println("Obrigado por ter se apresentado!");

	}
}
