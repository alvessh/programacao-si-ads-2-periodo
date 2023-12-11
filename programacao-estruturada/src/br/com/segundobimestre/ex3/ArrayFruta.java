package br.com.segundobimestre.ex3;

public class ArrayFruta {
	public static void main(String[] args) {
		String[] arrayDeFrutas = new String[10];
		arrayDeFrutas[0] = "Fruta 1";
		arrayDeFrutas[1] = "Fruta 2";
		arrayDeFrutas[2] = "Fruta 3";
		arrayDeFrutas[3] = "Fruta 4";
		arrayDeFrutas[4] = "Fruta 5";
		arrayDeFrutas[5] = "Fruta 6";
		arrayDeFrutas[6] = "Fruta 7";
		arrayDeFrutas[7] = "Fruta 8";
		arrayDeFrutas[8] = "Fruta 9";
		arrayDeFrutas[9] = "Fruta 10";
		
		//Exemplo 01
		for (int i = 0; i < 10; i++) {
			System.out.println("Fruta " + (i+1) + ": " + arrayDeFrutas[i]);
		}
		
		//Exemplo 02
		for (String fruta : arrayDeFrutas) {
			System.out.println(fruta);
		}
	}
}
