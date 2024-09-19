package m1;

public class Carro {
	//modificador (public)
	public String modelo;
	
	//modificador privado
	private double preco;
	
	//modificador: default
	double quilometragem;
	
	//construtor
	public Carro (String modelo, double preco, double quilometragem) {
		this.modelo = modelo;
		this.preco = preco;
		this.quilometragem = quilometragem;
	}
	
	public void exibirModelo() {
		System.out.println("Modelo: " + modelo);
	}
	
	public void atualizarPreco(double novoPreco) {
		if (novoPreco > 0) {
			preco = novoPreco;
		}
		else {
			System.out.println("Preço invalido");
		}
	}
	
	
}
