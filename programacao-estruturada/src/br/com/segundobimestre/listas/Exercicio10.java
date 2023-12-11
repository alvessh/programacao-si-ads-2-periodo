package br.com.segundobimestre.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 10. Escreva um programa que leia um array(lista) 
 * de números do usuário até que o usuário insira
 * um número repetido. 
 * Em seguida, imprima a quantidade de números lidos antes da
 * repetição.
 */
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>(); 
		
		Boolean ehNumeroRepetido = false;
		do {
			System.out.println("Olá, seja bem vindo ao nosso sistema!");
			System.out.println("Informe um número, por favor.");
			Integer numero = teclado.nextInt();
			
			for (int i = 0; i < numeros.size(); i++) {
				if (numeros.size() > 1 && numero == numeros.get(i)) {
					ehNumeroRepetido = true;
					System.out.println("A quantidade de números adicionado até "
							+ "agora é: " + numeros.size());
				} else {
					System.out.println("Numero: " + numeros.get(i));
				}
			}
			numeros.add(numero);
		} while(ehNumeroRepetido != true);
	}
}
