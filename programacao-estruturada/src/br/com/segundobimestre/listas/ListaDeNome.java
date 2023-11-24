package br.com.segundobimestre.listas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeNome {
	public static void main(String[] args) {
		List<String> nomeList = new ArrayList<String>();
		
		nomeList.add("Itamar");
		nomeList.add("Arroz");
		nomeList.add("Batata");
		nomeList.add("AC/DC");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("O nome do caboclo é: " + nomeList.get(i));
		}
	}
}
