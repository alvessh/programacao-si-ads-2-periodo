package br.com.questionario;

public class QuestaoVinte {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if ( i % 2 == 0)
				System.out.println(i);

			i = i * 2;
		}
	}
	//Saída: 0
}
