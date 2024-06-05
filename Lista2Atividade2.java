package atividadelacocondicao;

import java.util.Scanner;

public class Lista2Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome ;
		String nomecargo ="";
		int codigo;
		float salario;
		float novosalario;
		float reajuste =0;

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("De 1 a 6, qual seu cargo: ");
		codigo = leia.nextInt();
		System.out.println("Salario atual: ");
		salario = leia.nextFloat();

		switch(codigo) {
		case 1:
			reajuste = 0.10f;
			break;
		case 2:
			reajuste = 0.7f;
			break;
		case 3:
			reajuste= 0.9f;
			break;
		case 4:
			reajuste = 0.6f;
			break;
		case 5:
			reajuste = 0.5f;
			break;
		case 6:
			reajuste = 0.8f;
			break;
		default:
			System.out.println("Escolha uma opção válida!");
		}

		novosalario = salario + (reajuste * salario);

		switch(codigo){
		case 1:
			nomecargo ="Gerente";
			break;
		case 2:
			nomecargo = "vendedor";
			break;
		case 3:
			nomecargo = "Supervisor";
			break;
		case 4:
			nomecargo = "Motorista";
			break;
		case 5:
			nomecargo = "Estoquista";
			break;
		case 6:
			nomecargo = "Técnico de TI";
			break;
		default:
			System.out.println("Escolha uma opção válida!");
		}
		System.out.println("Nome: "+ nome);
		System.out.println("Cargo: "+ nomecargo);
		System.out.println("Salario: " + novosalario);
		leia.close();
	}
}
