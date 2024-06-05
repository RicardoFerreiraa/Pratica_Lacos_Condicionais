package atividadelacocondicao;

import java.util.Scanner;

public class Lista2Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float saldo = 1000.0f , deposito, saque;
		int operacao;

		System.out.println("-- Esolha uma Operação --\n");
		System.out.println("1. Saldo");
		System.out.println("2. Saque");
		System.out.println("3. Depósito");
		operacao = leia.nextInt();

		switch(operacao) {
		case 1:
			System.out.println("Saldo Atual:" + saldo);
			break;

		case 2:
			System.out.println("Digite o valor do saque: ");
			saque = leia.nextFloat();
			if (saque <= saldo) {
				saldo -= saque;

				System.out.println("Saque realizado");
				System.out.println("Novo Saldo:" +saldo);
			}else {
				System.out.println("Saldo insuficiente!");
			}
			break;

		case 3:
			System.out.println("Digite o valor do depósito: ");
			deposito = leia.nextFloat();

			saldo += deposito;

			System.out.println("Depósito realizado com Sucesso");
			System.out.println("Novo Saldo:" + saldo);
			break;

		default:
			System.out.println("Operação Inválida!");
		}
		leia.close();
	}

}
