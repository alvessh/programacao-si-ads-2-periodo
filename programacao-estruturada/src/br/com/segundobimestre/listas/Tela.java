package br.com.segundobimestre.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tela {
	Scanner scanner = new Scanner(System.in);

	List<Pessoa> pessoaList = new ArrayList<Pessoa>();
	public void menu() {
        Integer opcao;

        do {
        	System.out.println("Olá!! Bem vindo ao sistema");
            System.out.println("----- MENU -----");
            System.out.println("1 - Inserir pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("0 - Sair");
            System.out.println("-----------------");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                //vou inserir pessoa
            	menuCadastroPessoa();
            } else if (opcao == 2) {
            	//vou apresentar as pessoas cadastradas
            	for (int i = 0; i < pessoaList.size(); i++) {
            		Pessoa pessoa = pessoaList.get(i);
            		System.out.println("Nome: " + pessoa.getNome() + " - Idade: " + pessoa.getIdade());
            	}
            } else if (opcao == 0) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
	}
	
	public void menuCadastroPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Informe seu nome: ");
    	String nome = scanner.nextLine();
    	pessoa.setNome(nome);
    	
    	System.out.println("Informe sua idade: ");
    	Integer idade = scanner.nextInt();
    	pessoa.setIdade(idade);
    	
    	System.out.println("Informe seu endereço: ");
    	String endereco = scanner.nextLine();
    	pessoa.setEndereco(endereco);
    	scanner.nextLine();
    	
    	System.out.println("Informe seu telefone: ");
    	String telefone = scanner.nextLine();
    	pessoa.setTelefone(telefone);
    	
    	System.out.println("Informe seu e-mail: ");
    	String email = scanner.nextLine();
    	pessoa.setEmail(email);
    	
    	System.out.println("Informe o seu estado civil: \n"
    			+ "1 - Sou Casado \n"
    			+ "2 - Não sou casado");
    	Integer opcaoEstadoCivil = scanner.nextInt();
    	if (opcaoEstadoCivil == 1) {
    		pessoa.setEhCasado(true);
    	} else {
    		pessoa.setEhCasado(false);
    	}
    	
    	pessoaList.add(pessoa);
    	
    	scanner.nextLine();
	}
}