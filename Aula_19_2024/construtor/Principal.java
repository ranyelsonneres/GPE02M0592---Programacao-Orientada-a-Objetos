package construtor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Fulano";
		int idade = 10;
		Pessoa p1 = new Pessoa (nome, idade);
		
		
		String nome1 = "Andre";
		Pessoa p2 = new Pessoa(nome1);
		p2.getNome();
		p2.setNome("Pedro");
		
		p1.exibir();
		p2.exibir();
		

	}

}
