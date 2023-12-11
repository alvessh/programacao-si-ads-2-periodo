package br.com.prova;

/**
 * 
 * Problematica:
 * João tinha uma quantia, gastou 35% e ainda ficou com R$ 97,50. 
 * Qual o valor que João tinha inicialmente?
 * Quando trabalhamos com porcentagem, sempre precisamos nos lembrar 
 * de que o valor corresponde a 100%. Dos 100%, 
 * João gastou 35%, então: 100% – 35% = 65%.
 * Os 65% restante, correspondem a R$ 97,50. Dessa forma, temos que:
 * 
 * Solução: Implemente um codigo que resolva qual problematica 
 * considerando que pode haver mudanças de percentual 
 * e aplicar o mesmo calculo para outros Personagens
 *  
 */
public class Questao05 {

	public static void main(String[] args) {
		double percentualGastoJoao = 40;
		double valorFinalJoao = 97.50;
		
		double percentualRestante = 100 - percentualGastoJoao;

		double valorInicialJoao = (valorFinalJoao / (percentualRestante / 100));

		System.out.printf("João tinha inicialmente R$%.2f", valorInicialJoao);
	}
}
