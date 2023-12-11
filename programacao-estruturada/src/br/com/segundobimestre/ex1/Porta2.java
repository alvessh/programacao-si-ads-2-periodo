package br.com.segundobimestre.ex1;

public class Porta2 {
	public static void main(String[] args) {
		Boolean portaFechada = true;
		Boolean tenhoAChave;
		
		int count = 0;
		while (portaFechada == true) {
			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) {
					//par
					tenhoAChave = true;
					System.out.println("abro a porta");
					portaFechada = false;
				} else {
					//impar
					tenhoAChave = false;
					if (tenhoAChave == false) {
						System.out.println("fecho a porta");
						portaFechada = true;
					}
				}
				count++;
			}
		}
		System.out.println(count + " ---- "+ portaFechada);
	}
}
