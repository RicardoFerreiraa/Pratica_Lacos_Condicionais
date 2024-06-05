package atividadelacocondicao;

import java.util.Scanner;

public class Lista1Atividade1 {

	public static void main(String[] args) {
		//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

		Scanner leia = new Scanner(System.in);

		int A, B, C;

		System.out.println("Entre com o valor de A: ");
		A = leia.nextInt();

		System.out.println("Entre com o valor de B: ");
		B = leia.nextInt();

		System.out.println("Entre com o valor de C: ");
		C = leia.nextInt();

		leia.close();

		if(A + B > C) {
			System.out.println("A soma de A + B é maior que C");
		}
		if (A + B < C) {
			System.out.println("A soma de A + B é menor que C");
		}
		if (A + B == C) {
			System.out.println("A soma de A + B é igual a C");
		}
	}

}
