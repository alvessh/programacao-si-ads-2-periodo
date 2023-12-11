package br.com.segundobimestre.ex1;

class Mochila {
	
	String marca;
	String cor;
	int capacidade;
	int compartimentos;
	boolean impermeavel;
	boolean acolchoada;
	boolean rodinha;
	String material;
	String tipoFecho;
	String estilo;

	void abrir() {
		System.out.println("A mochila foi aberta.");
	}

	void fechar() {
		System.out.println("A mochila foi fechada.");
	}

	void adicionarItem(String item) {
		System.out.println("Estou adicionando o " + item + " na mochila...");
	}

	void removerItem(String item) {
		System.out.println("Estou removendo o " + item + " na mochila...");
	}

	void verificarImpermeabilidade() {
		if (impermeavel) {
			System.out.println("A mochila é impermeável.");
		} else {
			System.out.println("Essa mochila não é impermeável.");
		}
	}

	void verificarAcolchoamento() {
		if (acolchoada) {
			System.out.println("A mochila é acolchoada.");
		} else {
			System.out.println("Essa mochila não é acolchoada.");
		}
	}

	void adicionarCompartimento() {
		compartimentos++;
		System.out.println("Foi adicionado um compartimento na mochila.");
	}

	void removerCompartimento() {
		if (compartimentos > 0) {
			compartimentos--;
			System.out.println("Foi removido um compartimento da mochila.");
		} else {
			System.out.println("A mochila não possui compartimentos para remover.");
		}
	}

	void trocarCor(String novaCor) {
		cor = novaCor;
	}

	void mostrarInformacoes() {
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Capacidade: " + capacidade);
		System.out.println("Compartimentos: " + compartimentos);
		System.out.println("Impermeável: " + impermeavel);
		System.out.println("Acolchoada: " + acolchoada);
		System.out.println("Rodinhas: " + rodinha);
		System.out.println("Material: " + material);
		System.out.println("Tipo de Fecho: " + tipoFecho);
		System.out.println("Estilo: " + estilo);
	}

	void trocarTipoFecho(String novoFecho) {
		// Lógica para trocar o tipo de fecho da mochila
	}

	void verificarRodinhas() {
		if (rodinha) {
			System.out.println("A mochila possui rodinhas.");
		} else {
			System.out.println("Essa mochila não possui rodinhas.");
		}
	}
}
