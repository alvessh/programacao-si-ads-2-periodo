package br.com.prova;

/**
 * Problemática:
	João está faturando uma nota fiscal e nesta está destacado os 
	impostos federais ICMS, IPI, PIS e COFINS.
	ICMS: 17,5 %
	IPI: 7%
	PIS: 3,75%
	COFINS: 4%

	O valor da base de cálculo da nota fiscal é R$ 1.372,22.

	O valor total da nota fiscal inclui o imposto de ICMS, já os 
	outros impostos são destacados de forma individual.

	Solução: Implemente um programa em Java para calcular e
	 retornar o valor total da nota fiscal e também o valor
	individual calculado de cada imposto.
 *  
 */
public class Questao06 {

	public static void main(String[] args) {
		double percentualIcms = 17.5 / 100;

		double percentualIpi = 7.0 / 100;

		double percentualPis = 3.75 / 100;

		double percentualCofins = 4.0 / 100;

		double valorBaseDeCalculoNotaFiscal = 1372.22;

		double valorIcms = valorBaseDeCalculoNotaFiscal * percentualIcms;
		System.out.println("Valor do imposto de ICMS: " + valorIcms);

		double valorIpi = valorBaseDeCalculoNotaFiscal  * percentualIpi;
		System.out.println("Valor do imposto de IPI: " + valorIpi);

		double valorPis = valorBaseDeCalculoNotaFiscal  * percentualPis;
		System.out.println("Valor do imposto de PIS: " + valorPis);

		double valorCofins = valorBaseDeCalculoNotaFiscal  * percentualCofins;
		System.out.println("Valor do imposto de COFINS: " + valorCofins);

		double valorTotalDaNotaFiscal = valorBaseDeCalculoNotaFiscal + valorIcms;

		System.out.println("Valor total da Nota Fiscal: " + valorTotalDaNotaFiscal);
	}
}
