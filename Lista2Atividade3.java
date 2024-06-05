package atividadelacocondicao;

import java.util.Scanner;

public class Lista2Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float Numero1, Numero2;
		float resultado = 0;
		int operacao;

		System.out.println("Digite o primeiro numero: ");
		Numero1 = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		Numero2 = leia.nextFloat();

		System.out.println("--  Escolha uma das operações: --");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Divisão");
		System.out.println("4. Multiplicação");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			resultado = Numero1 + Numero2;
			break;
		case 2:
			resultado = Numero1 - Numero2;
			break;
		case 3:
			resultado = Numero1 / Numero2;
			break;
		case 4:
			resultado = Numero1 * Numero2;
			break;
		default:
			System.out.println("Operação inválida!");
		}
	System.out.println("Resultado "+ resultado);
		leia.close();
	}
}

