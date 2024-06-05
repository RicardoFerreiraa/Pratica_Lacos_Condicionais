package atividadelacocondicao;

import java.util.Scanner;

public class Lista1Atividade3 {

	public static void main(String[] args) {
		//Para doar sangue é necessário ter entre 18 e 69 anos de idade.
		//Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
		// Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador
		//e se é a primeira doação (boolean). 
		//De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.


		Scanner leia = new Scanner(System.in);

		String nome;
		int idade ;
		boolean doacao ;

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira Doação de sangue (true / false )? ");
		doacao =leia.hasNextBoolean();

		if (idade >=18 && idade <=69) {

			if(idade >=60 && doacao ) {
				System.out.println(nome + " você não está apto para doar sangue!");
			
			}else {
				System.out.println(nome + " você está apto para doar sangue!");
			}

		} else {
			System.out.println(nome + " você não está apto para doar sangue!");
		}
		leia.close();
	}



}
