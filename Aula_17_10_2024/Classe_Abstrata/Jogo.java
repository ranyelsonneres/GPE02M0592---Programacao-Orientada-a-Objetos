package abstrato;

public abstract class Jogo {
	
	//atributos
	String nome;
	int nJogadores;
	
	public Jogo(String nome, int nJogadores) {
		this.nome = nome;
		this.nJogadores = nJogadores;
	}
	
	//metodo abstrato
	public abstract void iniciar();
	public abstract void regras();
	
	//metodo concreto
	public String toString() {
		return "Nome: " + nome
				+ "\nNº jogadores: " + nJogadores;
	}
	
}
