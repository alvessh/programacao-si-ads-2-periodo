package br.com.segundobimestre.ex2;

import java.util.Scanner;

public class Percentagem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número, por favor");
		Double numero = scanner.nextDouble();
		
		System.out.println("Informe o percentual: ");
		Double percentagem = scanner.nextDouble();
		
		Double calculo = numero * (percentagem / 100);
		System.out.println(percentagem + "% de " + numero + " é igual: " + calculo);

	}
}
