package veiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar o objeto
		Carro meuCarro = new Carro();
		Carro meuCarro2 = new Carro();
		
		//chamar os atributos e métodos
		meuCarro.modelo = "Sedan";
		meuCarro.cor = "Vermelho";
		meuCarro.ano = 2022;
		meuCarro.placa = "QCX-1223";
		
		meuCarro2.modelo = "SUV";
		meuCarro2.cor = "Azul";
		meuCarro2.ano = 2023;
		meuCarro2.placa = "QCX-0021";
		meuCarro2.proprietario = "Fulano";
		
		//impressao
		meuCarro.exibirInformacoes();
		meuCarro2.exibirInformacoes();

	}

}
