package br.com.segundobimestre.ex1;

class Animal {
	
	String nome;
	int idade;
	String tipo;
	String cor;
	String tamanho;
	String habitat;
	boolean carnivoro;
	boolean domestico;
	String alimentacao;
	boolean vertebrado;

	void emitirSom() {
		System.out.println("Som do animal.");
	}

	void mover() {
		System.out.println("O animal está se movendo.");
	}

	void comer() {
		System.out.println("O animal está comendo.");
	}

	void dormir() {
		System.out.println("O animal está dormindo.");
	}

	void reproduzir() {
		System.out.println("O animal está se reproduzindo.");
	}

	void fugir() {
		System.out.println("O animal está fugindo.");
	}

	void cacar() {
		if (carnivoro) {
			System.out.println("O animal está caçando.");
		} else {
			System.out.println("Esse animal não é carnívoro.");
		}
	}

	void verificarSaude() {
		System.out.println("O animal está sendo examinado por um veterinário.");
	}

	void mudarHabitat(String novoHabitat) {
		habitat = novoHabitat;
	}

	void alimentar(String tipoAlimento) {
		System.out.println("O animal está se alimentando com " + tipoAlimento);
	}

	void brincar() {
		if (domestico) {
			System.out.println("O animal está brincando com seu dono.");
		} else {
			System.out.println("Esse animal não é doméstico.");
		}
	}

	void nadar() {
		System.out.println("O animal está nadando.");
	}

	void voar() {
		if (tipo.equals("Ave")) {
			System.out.println("O animal está voando.");
		} else {
			System.out.println("Esse animal não voa.");
		}
	}
}