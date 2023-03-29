package projeto_guia_contabancaria;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.model.conta;
import conta.util.cores;

public class menu {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);

		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		while (true) {

			System.out.println(
					cores.TEXT_WHITE + cores.ANSI_BLUE_BACKGROUND + "******************************************");
			System.out.println("                                          ");
			System.out.println("            BANCO AGIOTA CRENTE           ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.println("                                          ");
			System.out.println("         1- CRIAR CONTA                   ");
			System.out.println("         2- LISTAR TODAS AS CONTAS        ");
			System.out.println("         3- BUSCAR CONTA POR NÚMERO       ");
			System.out.println("         4- ATUALIZAR DADOS DA CONTA      ");
			System.out.println("         5- APAGAR CONTA                  ");
			System.out.println("         6- SACAR                         ");
			System.out.println("         7- DEPOSITAR                     ");
			System.out.println("         8- TRANSFERÊNCIA                 ");
			System.out.println("         9- SAIR                          ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.println("  ENTRE COM A OPÇÃO DESEJADA:             ");
			System.out.println("                                          " + cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND
						+ "\nBANCO AGIOTA CRENTE, JUNTOS PROSPERAMOS!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Criar conta \n\n");
				break;

			case 2:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Listar todas as contas \n\n");
				break;

			case 3:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND
						+ "Consultar dados da conta - por número\n\n");
				break;

			case 4:
				System.out
						.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Atualizar dados da conta \n\n");
				break;

			case 5:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "apagar a conta \n\n");
				break;

			case 6:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Saque \n\n");
				break;

			case 7:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Depósito \n\n");
				break;

			case 8:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Tranferência\n\n");
				break;

			default:
				System.out.println(
						cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "\nOpção inválida\n" + cores.TEXT_RESET);
				break;

			}

		}

	}

}
