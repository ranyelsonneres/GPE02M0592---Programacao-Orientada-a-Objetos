package interfaces;

public class RadioRelogio implements Radio, Relogio{
	
	boolean ligado;
	double estacaoAtual;
	
	public RadioRelogio() {
		this.ligado = false;
		this.estacaoAtual = 0.0;
	}
	
	public void ligar() {
		ligado = true;
		System.out.println("Radio Ligado!!");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("Radio Desligado!!");
	}
	
	public void trocarEstacao(double novaEstacao) {
		this.estacaoAtual = novaEstacao;
	}
	
	public String obterHoras() {
		java.time.LocalTime agora = java.time.LocalTime.now();
		return agora.toString();
	}
	
	public double obterEstacaoAtual() {
		return estacaoAtual;
	}


}
