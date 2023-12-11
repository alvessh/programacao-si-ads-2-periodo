package br.com.segundobimestre.listas;

import java.util.List;
import java.util.ArrayList;

public class ListaDeFrutas {
	public static void main(String[] args) {
		List<String> frutaList = new ArrayList<String>();
		frutaList.add("Goiaba");//posicao 1: 0
		frutaList.add("Arroz");//posicao 2: 1
		frutaList.add("Tomate");//posicao 3: 2
		frutaList.add("Batata");//posicao 4: 3
		
//		System.out.println(frutaList.get(0));
		
		for (int i =0; i < 4; i++) {
			System.out.println("O nome da fruta é: " + frutaList.get(i));
		}
	}
}
