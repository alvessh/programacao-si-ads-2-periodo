package br.com.questionario;

public class QuestaoQuatorze {
	public static void main(String ... args) {
		Integer idade = 15;
		boolean aluno = false;
		if ((idade >= 18) && (aluno == true)) {
			System.out.println("O aluno é maior de idade");
		} else {
			System.out.println("Menor de idade e não é aluno");
		}

	}
	//Saída: Menor de idade e não é aluno
}
