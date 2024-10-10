package contabancaria;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	//construtor
	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	//getters e setters
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	//metodos
	public void calcularNovoSaldo(double taxaRendimento) {
		if (this.diaRendimento == 5) {
			double saldoAntigo = super.getSaldo();
			double novoSaldo = saldoAntigo + (taxaRendimento * saldoAntigo);
			super.setSaldo(novoSaldo);
		} else {
			System.out.println("Não houve rendimento!");
		}
	}
	
	@Override
	public String toString() {
		return 	super.toString()
				+ "\nDia rendimento: " + diaRendimento;
	}
	
	

}
