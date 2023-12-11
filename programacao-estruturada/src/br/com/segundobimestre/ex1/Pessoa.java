package br.com.segundobimestre.ex1;

class Pessoa {
	
	String nome;
	int idade;
	String sexo;
	double altura;
	double peso;
	String endereco;
	String telefone;
	String email;
	String nacionalidade;
	String profissao;

	void cumprimentar() {
		System.out.println("Olá, meu nome é " + nome);
	}

	double calcularIMC() {
		return peso / (altura * altura);
	}

	void fazerAniversario() {
		idade++;
	}

	void alterarEndereco(String novoEndereco) {
		endereco = novoEndereco;
	}

	void atualizarTelefone(String novoTelefone) {
		telefone = novoTelefone;
	}

	void enviarEmail(String mensagem) {
		System.out.println("Enviando email para " + email + ": " + mensagem);
	}

	void mudarNacionalidade(String novaNacionalidade) {
		nacionalidade = novaNacionalidade;
	}

	void mudarProfissao(String novaProfissao) {
		profissao = novaProfissao;
	}

	void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("Nacionalidade: " + nacionalidade);
		System.out.println("Profissão: " + profissao);
	}

	void trabalhar() {
		System.out.println(nome + " está trabalhando como " + profissao);
	}

	void comer() {
		System.out.println(nome + " está comendo.");
	}

	void dormir() {
		System.out.println(nome + " está dormindo.");
	}

	void estudar(String assunto) {
		System.out.println(nome + " está estudando " + assunto);
	}

	void fazerExercicio(String tipo) {
		System.out.println(nome + " está fazendo exercício do tipo " + tipo);
	}

	void viajar(String destino) {
		System.out.println(nome + " está viajando para " + destino);
	}
}