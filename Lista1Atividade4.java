package atividadelacocondicao;

import java.util.Scanner;

public class Lista1Atividade4 {

	public static void main(String[] args) {
		// preciso estudar  Método String.equals() ou String.equalsIgnoreCase() para comparar as palavras
		// irei voltar para finalizar essa atividade

		Scanner leia = new Scanner(System.in);

		String caracter1, caracter2, caracter3;

		System.out.println("Entre com a primeira caracteristica: ");
		caracter1 = leia.next();
		System.out.println("Entre com a segunda caracteristica: ");
		caracter2 = leia.next();
		System.out.println("Entre com a terceira caracteristica: ");
		caracter3 = leia.next();

		if(caracter1.equals("Vertebrado")) {
			if(caracter2.equals("Ave")) {
				if(caracter3.equals("Carnívoro")) {
					System.out.println("Animal escolhido: Aguia!");
				}else {
					System.out.println("Caracteristicas inválidas");
				}

			}
		}
		leia.close();

	}

}
