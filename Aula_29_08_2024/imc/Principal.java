package imc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Teste");
		Scanner sc = new Scanner(System.in);
		
		//criar o objeto IMC
		CalculadoraIMC calcIMC = new CalculadoraIMC();
		
		System.out.println("Peso: ");
		calcIMC.peso = sc.nextDouble();
		
		System.out.println("Altura: ");
		calcIMC.altura = sc.nextDouble();
		
		//calcular o IMC
		double imc = calcIMC.calcularIMC();
		
		//interpretar o resultado
		String resultado = calcIMC.interpretarIMC(imc);
		
		System.out.printf("IMC: %.2f\n" , imc);
		System.out.println("Interpretação: " + resultado);
		
		
		sc.close();
		

	}

}
