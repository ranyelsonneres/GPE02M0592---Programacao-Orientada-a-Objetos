package construtor;

public class Pessoa {
	//atributos
	private String nome;
	private int idade;
	
	//metodos de acesso
	//get
	//set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//construtores
	//construtor vazio
//	public Pessoa () {
//		System.out.println("Construtor criado!");
//	}
	
	//construtor parametrizado
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//metodos
	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
	

}
