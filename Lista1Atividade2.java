package atividadelacocondicao;

import java.util.Scanner;

public class Lista1Atividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int Numero;

		System.out.println("Digite um Numero");
		Numero = leia.nextInt();

		leia.close();

		if(Numero % 2 == 0) {
			System.out.println("o Numero " + Numero + " é Par");
		}
		else {
			System.out.println("o Numero " + Numero + " é impar");
		}
		if (Numero > 0) {
			System.out.println("O numero " + Numero + " é positivo");
		}
		else if(Numero < 0) {
			System.out.println("O numero " + Numero + " é negativo");
		}

	}
}
