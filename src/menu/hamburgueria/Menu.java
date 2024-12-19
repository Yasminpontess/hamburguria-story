package menu.hamburgueria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		String cliente, endereco, telefone, produto;
		float valor;
		int opcao = 0, quantidade = 0;

		Scanner leia = new Scanner(System.in);

		while (true) {
			System.out.println("_____________________________________________________");
			System.out.println("        Bem-Vindos a Haburgueria Story!!!            ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar Menu                          ");
			System.out.println("            3 - Listar todos os Pedidos              ");
			System.out.println("            4 - Fazer o pagamento                    ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("Entre com a opção desejada:                          ");

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta:");

				break;
			case 2:
				System.out.println("Criar Conta:");

				break;
			case 3:
				System.out.println("Criar Conta:");

				break;
			case 4:
				System.out.println("Criar Conta:");

				break;
			case 5:
				System.out.println("Pedido Finalizado logo será entregue!");

				break;

			default:
				System.out.println("Opção invelida!");

			}
		}

	}

}
