package abstrato;

public class JogoDomino extends Jogo {

	String mesa;

	public JogoDomino(String nome, int nJogadores, String mesa) {
		super(nome, nJogadores);
		this.mesa = mesa;
	}
	
	public void iniciar() {
		System.out.println("Start: jogo de dominó");
	}
	
	public void regras() {
		System.out.println("Regras: mesmo número de peças para os jogadores");
	}
	
}
