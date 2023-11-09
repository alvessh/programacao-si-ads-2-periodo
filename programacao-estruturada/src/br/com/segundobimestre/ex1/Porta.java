package br.com.segundobimestre.ex1;

public class Porta {

	public static void main(String[] args) {
		Boolean portaFechada = true;

		while (portaFechada == true) {
			System.out.println("Tiro a chave do bolso, levo a chave até a fechadura e giro para abrir!");

			System.out.println("Estou abrindo a porta....");
			
			portaFechada = false;

			System.out.println("entro....");
		}
		
		System.out.println("fecho a porta...");
		portaFechada = true;
		
	}

}
