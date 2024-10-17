package abstrato;

public class JogoXadrez extends Jogo {
	String tabuleiro;

	public JogoXadrez(String nome, int nJogadores, String tabuleiro) {
		super(nome, nJogadores);
		this.tabuleiro = tabuleiro;
	}
	
	//utilizando os métodos abstratos
	public void iniciar() {
		System.out.println("Start: jogo Xadrez");
	}
	public void regras() {
		System.out.println("Regras: Cada jogador deve mover suas peças");
	}
	
	public String toString() {
		return super.toString() + 
				"\nTabuleiro: " + tabuleiro;
	}
}
