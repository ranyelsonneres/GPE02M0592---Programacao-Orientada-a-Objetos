//Aula 15/08/2024
import java.util.Scanner; //importar a biblioteca
public class hello {

	public static void main(String[] args) {
		
		//biblioteca de leitura de dados
		Scanner sc = new Scanner(System.in);
		
		//mecanismo de impressão
		System.out.println("Olá mundo!");
		
		//declaração de variáveis
		String nome = "Fulano";
		int num1 = 10;
		double num2 = 12.4;
		float num3 = 12.4f;
		char letra = 'A';
		boolean booleano = true;
		
		//entrada de dados
		System.out.println("Informe uma palavra: ");
		String palavra = sc.next();
		
		System.out.println("Valor inteiro: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Valor decimal: ");
		double valor2 = sc.nextDouble();
		
		System.out.println("Informe um caractere: ");
		char x = sc.next().charAt(0);
		
		//saída de dados
		System.out.println("Palavra digitada: " + palavra);
		System.out.println("Caractere: " + x);
		sc.close(); //fechar o recurso do Scanner
	}
	
}
