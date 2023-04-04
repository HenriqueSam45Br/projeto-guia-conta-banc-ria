package conta.controller;

import java.util.ArrayList;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.model.conta;
import conta.repository.ContaRepository;

public class ContaController {

	public class contacontroller implements ContaRepository {

		private ArrayList<conta> listarContas = new ArrayList<conta>();
		int numero = 0;

		@Override
		public void procurarPorNumero(int numero) {
			// TODO Auto-generated method stub

		}

		@Override
		public void listarTodas() {
			for (var conta : listarContas) {
				conta.visualizar();
			}
			// TODO Auto-generated method stub

		}

		@Override
		public void cadastrar(conta conta) {
			listarContas.add(conta);
			System.out.println("\nA conta número: " + conta.getNumero() + " foi criada com sucesso!");

		}

		@Override
		public void atualizar(conta conta) {
			// TODO Auto-generated method stub

		}

		@Override
		public void deletar(int numero) {
			// TODO Auto-generated method stub

		}

		@Override
		public void sacar(int numero, float valor) {
			// TODO Auto-generated method stub

		}

		@Override
		public void depositar(int numero, float valor) {
			// TODO Auto-generated method stub

		}

		@Override
		public void transferir(int numeroOrigem, int numeroDestino, float valor) {
			// TODO Auto-generated method stub

		}

	}
	public int gerarNumero() {
		int numero = 0;
		return ++ numero;
	}
	public void listarTodas() {

	}
	public void cadastrar(ContaCorrente contaCorrente) {
		// TODO Auto-generated method stub
		
	}
	public void cadastrar(ContaPoupanca contaPoupanca) {
		// TODO Auto-generated method stub
		
	}
}
