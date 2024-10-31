//implementar a classe principal.

package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioRelogio radio = new RadioRelogio();
		
		radio.ligar();
		System.out.println("Estação atual: " + radio.obterEstacaoAtual());
		
		radio.trocarEstacao(110.5);
		System.out.println("Estação atual: " + radio.obterEstacaoAtual());
		System.out.println("Hora: " + radio.obterHoras());
		
		radio.desligar();
		
	}

}
