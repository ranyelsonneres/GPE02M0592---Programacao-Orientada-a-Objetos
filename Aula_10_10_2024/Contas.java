package contabancaria;

public class Contas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bem-vindo ao Banco UCB!");
		
		//conta simples
		ContaBancaria c1 = new ContaBancaria("Fulano", "111-X", 0);
		
		c1.setNomeCliente("Fulano Silva");
		System.out.println(c1);
		
		//depositar
		double deposito = 10;
		c1.depositar(deposito);
		System.out.println("######Conta Atualizada#####");
		System.out.println(c1);
		
		//sacar
		double saque = 50;
		c1.sacar(saque);
		System.out.println("######Conta Atualizada#####");
		System.out.println(c1);
		
		//Conta poupança
		System.out.println("######Conta Poupança#####");
		ContaPoupanca cp = new ContaPoupanca("Ciclano Carvalho", "222-X", 0, 5);
		System.out.println(cp);
		
		//depositar
		double deposito2 = 20;
		cp.depositar(deposito2);
		System.out.println("######Conta Atualizada#####");
		System.out.println(cp);
		
		//rendimento da conta poupança
		double taxaRendimento = 0.05; //5%
		cp.calcularNovoSaldo(taxaRendimento);
		System.out.println("######Conta Atualizada#####");
		System.out.println(cp);
		
		//Conta especial
		

	}

}
