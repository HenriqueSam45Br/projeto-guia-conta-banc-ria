package projeto_guia_contabancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.model.conta;
import conta.util.cores;

public class menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

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
				System.out.println("Digite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {

					System.out.println("Digite o tipo de conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o saldo da conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {

				case 1 -> {

					System.out.println("Digite o limite de crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));

				}
				case 2 -> {

					System.out.println("Digite o aniversário da conta:");
					aniversario = leia.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));

				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Listar todas as contas \n\n");
				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND
						+ "Consultar dados da conta - por número\n\n");

				keyPress();
				break; 

			case 4:
				System.out
						.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Atualizar dados da conta \n\n");

				keyPress();
				break;

			case 5:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "apagar a conta \n\n");

				keyPress();
				break;

			case 6:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Saque \n\n");

				keyPress();
				break;

			case 7:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Depósito \n\n");

				keyPress();
				break;

			case 8:
				System.out.println(cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "Tranferência\n\n");

				keyPress();
				break;

			default:
				System.out.println(
						cores.TEXT_GREEN_BOLD + cores.ANSI_BLACK_BACKGROUND + "\nOpção inválida\n" + cores.TEXT_RESET);

				keyPress();
				break;

			}

		}

	}

	public static void keyPress() {

		try {

			System.out.println(cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}

	}
}
