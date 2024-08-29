package veiculo;

public class Carro{
	
	//atributos (características)
	String modelo;
	String cor;
	int ano;
	String placa;
	String proprietario;
	
	//métodos (comportamentos)
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
		System.out.println("Proprietario: " + proprietario);
	}

}
