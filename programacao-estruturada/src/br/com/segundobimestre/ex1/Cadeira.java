package br.com.segundobimestre.ex1;

class Cadeira {
	
	String material;
	String cor;
	double altura;
	double largura;
	double comprimento;
	boolean possuiApoioBracos;
	boolean possuiApoioPernas;
	boolean reclinavel;
	boolean giratoria;
	boolean ajustavelAltura;

	void ajustarAltura(int novaAltura) {
		altura = novaAltura;
		System.out.println("A altura da cadeira foi ajustada para " + novaAltura + " cm.");
	}

	void reclinar() {
		if (reclinavel) {
			System.out.println("A cadeira foi reclinada.");
		} else {
			System.out.println("Essa cadeira não é reclinável.");
		}
	}

	void girar() {
		if (giratoria) {
			System.out.println("A cadeira foi girada.");
		} else {
			System.out.println("Essa cadeira não é giratória.");
		}
	}

	void adicionarApoioBracos() {
		if (!possuiApoioBracos) {
			possuiApoioBracos = true;
			System.out.println("A cadeira agora possui apoio de braços.");
		} else {
			System.out.println("Essa cadeira já possui apoio de braços.");
		}
	}

	void removerApoioBracos() {
		if (possuiApoioBracos) {
			possuiApoioBracos = false;
			System.out.println("O apoio de braços foi removido da cadeira.");
		} else {
			System.out.println("Essa cadeira não possui apoio de braços.");
		}
	}

	void adicionarApoioPernas() {
		if (!possuiApoioPernas) {
			possuiApoioPernas = true;
			System.out.println("A cadeira agora possui apoio de pernas.");
		} else {
			System.out.println("Essa cadeira já possui apoio de pernas.");
		}
	}

	void removerApoioPernas() {
		if (possuiApoioPernas) {
			possuiApoioPernas = false;
			System.out.println("O apoio de pernas foi removido da cadeira.");
		} else {
			System.out.println("Essa cadeira não possui apoio de pernas.");
		}
	}

	void ajustarInclinacaoPernas(int inclinacao) {
		if (ajustavelAltura) {
			System.out.println("A inclinação das pernas foi ajustada para " + inclinacao + " graus.");
		} else {
			System.out.println("Essa cadeira não possui ajuste de altura para as pernas.");
		}
	}

	void mudarCor(String novaCor) {
		cor = novaCor;
		System.out.println("A cadeira foi pintada de " + novaCor + ".");
	}

	void aumentarLargura(double novaLargura) {
		largura = novaLargura;
		System.out.println("A largura da cadeira foi aumentada para " + novaLargura + " cm.");
	}

	void mostrarConfiguracoes() {
		System.out.println("Material: " + material);
		System.out.println("Cor: " + cor);
		System.out.println("Altura: " + altura + " cm");
		System.out.println("Largura: " + largura + " cm");
		System.out.println("Comprimento: " + comprimento + " cm");
		System.out.println("Possui apoio de braços: " + possuiApoioBracos);
		System.out.println("Possui apoio de pernas: " + possuiApoioPernas);
		System.out.println("É reclinável: " + reclinavel);
		System.out.println("É giratória: " + giratoria);
		System.out.println("É ajustável em altura: " + ajustavelAltura);
	}
}