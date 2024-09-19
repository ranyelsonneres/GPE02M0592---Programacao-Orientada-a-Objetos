package m2;
import m1.Carro;

public class Principal_m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro("Fusca", 1000, 500);
		meuCarro.exibirModelo();
		
		//double km = 10;
		//meuCarro.quilometragem = km;
		
		//System.out.println("Preço: " + meuCarro.preco);
		//double preco2 = 10;
		//meuCarro.preco = preco2;
		
		meuCarro.atualizarPreco(-200);
		
	}

}
