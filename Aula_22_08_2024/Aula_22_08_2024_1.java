import java.util.Scanner;
public class Aula_22_08_2024_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número: ");
		double num = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.printf("Número digitado: %.2f\n", num);
		System.out.printf("Nome digitado: %s\n", nome);
		
		sc.close();
		
		

	}

}
