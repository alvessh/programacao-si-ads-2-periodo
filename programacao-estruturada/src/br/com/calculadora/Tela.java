package br.com.calculadora;

import java.util.Scanner;

public class Tela {
	Scanner scanner = new Scanner(System.in);
	public void menu() {
		String opcao = null;
		Double resultado = 0.0;
		
		do {
			System.out.println("====Bem vindo ao sistema de calculadora====");
			System.out.println("Informe o primeiro número: ");
			Double numero1 = scanner.nextDouble();
			
			System.out.println("Informe o segundo número: ");
			Double numero2 = scanner.nextDouble();
			
			scanner.nextLine();
			System.out.println("Informe a opção ao qual Você deseja calcular: ");
			System.out.println("+ : Somar");
			System.out.println("- : Subtrair");
			System.out.println("* : Multiplicar");
			System.out.println("/ : Divisão");
			System.out.println("0 : Sair da calculadora!");
			opcao = scanner.nextLine();
			
			if (opcao.equals("+")) {
				//somar
				resultado = numero1 + numero2;
			} else if (opcao.equals("-")) {
				//subtrair
				resultado = numero1 - numero2;
			} else if (opcao.equals("*")) {
				//multiplicar
				resultado = numero1 * numero2;
			} else if (opcao.equals("/")) {
				//dividir
				resultado = numero1 / numero2;
			} else if (opcao.equals("0")) {
				resultado = 0.0;
				System.out.println("Saindo do sistema calculadora....");
			} else {
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Resultado do cálculo: " + resultado);
		} while (opcao.equals("0") == false);
	}
}
