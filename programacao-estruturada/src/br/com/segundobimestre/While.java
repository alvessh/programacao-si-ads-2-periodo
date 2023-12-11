package br.com.segundobimestre;

public class While {
	public static void main(String[] args) {
		Integer idade = 15;
		while (idade < 18) {
			System.out.println("Ainda é menor de idade. "
					+ " Possui " + idade + " anos");
			idade++;
		}
	}
}
