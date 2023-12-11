package br.com.segundobimestre.ex3;

public class ArrayNumero {
	public static void main(String[] args) {
		int[] arrayNumeroInteiro = new int[40];
		
		//for para popular o meu array
		for (int j = 0; j < arrayNumeroInteiro.length; j++) {
			arrayNumeroInteiro[j] = (j+1 * 5); 
		}
		
		//for para acessar o meu array
		for (int m = 0; m < arrayNumeroInteiro.length; m++) {
			System.out.println(arrayNumeroInteiro[m]);
		}

	}
}
