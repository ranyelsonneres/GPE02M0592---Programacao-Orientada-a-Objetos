package heranca;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ana", 34);
		Professor professor = new Professor("João", 45, "Artes");
		Aluno aluno = new Aluno("Maria", 25, "Cinema");
		
		pessoa.idade = 60;
		
		
		pessoa.apresentar();
		professor.apresentar();
		
		System.out.println(pessoa);
		System.out.println(aluno);
		

	}

}
