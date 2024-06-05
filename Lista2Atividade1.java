package atividadelacocondicao;

import java.util.Scanner;

public class Lista2Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int codigo;
		int quantidade ;
		String produto = "";
		double preco = 0.0;
		double valorTotal;


		System.out.println(" ##### Lanchonete ##### \n");
		System.out.println("Dgite 1 para Cachorro Quente ");
		System.out.println("Dgite 2 para X-Salada ");
		System.out.println("Dgite 3 para X-Bacon ");
		System.out.println("Dgite 4 para Bauru ");
		System.out.println("Dgite 5 para Refrigerante ");
		System.out.println("Dgite 6 para Suco de laranja ");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();

		leia.close();

		switch (codigo) {
		case 1:
			produto = "Cachorro quente";
			preco = 10.00;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		case 5:
			produto ="Refrigerante";
			preco = 8.00;
			break;
		case 6:
			produto ="Suco de laranja";
			preco = 13.00;
			break;
		default:
			System.out.println("Digite um numero valido!");
		}

			valorTotal = quantidade * preco;

			System.out.printf("Produto: %s\n", produto);
			System.out.printf("Valor total: R$ %.2f\n", valorTotal);
	}

}
