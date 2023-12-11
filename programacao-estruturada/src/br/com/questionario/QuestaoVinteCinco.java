package br.com.questionario;

public class QuestaoVinteCinco {

	public static void main(String[] args) {
		for (int k = 15; k > 0; k++) {
			System.out.println("Resultado: " + k);

			if (k == 15) {
				k = -1;
			}
		}
	}
	//Saída: Resultado: 15
}
