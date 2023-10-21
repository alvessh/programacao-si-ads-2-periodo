package br.com.prova;

/* Fazer um programa que implemente a solução de troco em operação de venda/compra.
 */
public class Questao04 {
	public static void main(String[] args) {


		double totalCompra = 1250.40;

		double valorPago = 1250.0;

		double troco = valorPago - totalCompra;

		if (troco < 0) {
			System.out.println("O valor pago é insuficiente. Faltam R$" + troco);
		} else {
			System.out.println("O troco a ser devolvido é de R$" + troco);
		}
	}

}





