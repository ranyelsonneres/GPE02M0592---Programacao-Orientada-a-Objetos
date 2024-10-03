package heranca;

public class Professor extends Pessoa{
	
	private String curso;

	public Professor(String nome, int idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void apresentar() {
		//super.apresentar();
		System.out.println("Nome: "  + super.nome + " Idade: "  + super.idade + " Curso: " + curso);
	}
	
	
	

}
