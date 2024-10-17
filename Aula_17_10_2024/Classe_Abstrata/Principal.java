package abstrato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Jogo jogoXadrez = new Jogo("Xadrez", 2);
		
		Jogo jogoXadrez = new JogoXadrez("Xadrez", 2, "Padrão");
		
		
		System.out.println(jogoXadrez);
		jogoXadrez.iniciar();
		jogoXadrez.regras();
		
		System.out.println();
		
		Jogo jogoDomino = new JogoDomino("Dominó", 4, "Equipes");
		System.out.println(jogoDomino);
		jogoDomino.iniciar();
		jogoDomino.regras();
	}

}
