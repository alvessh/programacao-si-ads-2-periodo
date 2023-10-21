package br.com.prova;

/*
 * Tabuada: Escreva um programa em Java que exiba a tabuada de multiplicação de 1 até 10.
 */
public class Questao03 {
	public static void main(String[] args) {

		System.out.println("Bem vindo ao sistema de tabuada!");
		System.out.println("=====================================");

		for (int i = 1; i <= 10; i++) {
			System.out.println("Vamos calcular a tabuada do número: " + i );
			for (int y = 1; y <= 10; y++) {
				int resultado = i * y;
				System.out.println(i + " x " + y + " = " + resultado);
			}
			System.out.println("=====================================");
		}

	}}
