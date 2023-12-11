package br.com.segundobimestre.ex1;

class Bolacha {
	
	String sabor;
	String tipo;
	String tamanho;
	boolean recheio;
	boolean integral;
	boolean chocolate;
	boolean acucar;
	boolean sal;
	boolean gluten;
	boolean lactose;

	void comer() {
		System.out.println("A bolacha está sendo comida.");
	}

	void quebrar() {
		System.out.println("A bolacha foi quebrada.");
	}

	void compartilhar() {
		System.out.println("A bolacha está sendo compartilhada.");
	}

	void verificarRecheio() {
		if (recheio) {
			System.out.println("A bolacha tem recheio.");
		} else {
			System.out.println("Essa bolacha não tem recheio.");
		}
	}

	void verificarIntegral() {
		if (integral) {
			System.out.println("A bolacha é integral.");
		} else {
			System.out.println("Essa bolacha não é integral.");
		}
	}

	void verificarChocolate() {
		if (chocolate) {
			System.out.println("A bolacha tem chocolate.");
		} else {
			System.out.println("Essa bolacha não tem chocolate.");
		}
	}

	void verificarAcucar() {
		if (acucar) {
			System.out.println("A bolacha tem açúcar.");
		} else {
			System.out.println("Essa bolacha não tem açúcar.");
		}
	}

	void verificarSal() {
		if (sal) {
			System.out.println("A bolacha tem sal.");
		} else {
			System.out.println("Essa bolacha não tem sal.");
		}
	}

	void verificarGluten() {
		if (gluten) {
			System.out.println("A bolacha tem glúten.");
		} else {
			System.out.println("Essa bolacha não tem glúten.");
		}
	}

	void verificarLactose() {
		if (lactose) {
			System.out.println("A bolacha tem lactose.");
		} else {
			System.out.println("Essa bolacha não tem lactose.");
		}
	}

	void trocarSabor(String novoSabor) {
		sabor = novoSabor;
	}

	void trocarTipo(String novoTipo) {
		tipo = novoTipo;
	}

	void trocarTamanho(String novoTamanho) {
		tamanho = novoTamanho;
	}

	void trocarRecheio(boolean novoRecheio) {
		recheio = novoRecheio;
	}

	void mostrarInformacoes() {
		System.out.println("Sabor: " + sabor);
		System.out.println("Tipo: " + tipo);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Recheio: " + recheio);
		System.out.println("Integral: " + integral);
		System.out.println("Chocolate: " + chocolate);
		System.out.println("Açúcar: " + acucar);
		System.out.println("Sal: " + sal);
		System.out.println("Glúten: " + gluten);
		System.out.println("Lactose: " + lactose);
	}
}
