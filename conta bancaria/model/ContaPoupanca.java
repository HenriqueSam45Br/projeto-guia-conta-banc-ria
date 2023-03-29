package conta.model;

public class ContaPoupanca extends conta {

	private int aniversario;

	public ContaPoupanca(int numero, int agengia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agengia, tipo, titular, saldo);
		this.aniversario = aniversario;

	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversáriio da conta: ");
	}

}
