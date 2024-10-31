package colecoes;

import java.util.*; 

//import java.util.HashSet;
//import java.util.Set;



public class eXsET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> frutas = new LinkedHashSet<>(); //ordenada
		
		//adicionar
		frutas.add("laranja");
		frutas.add("maça");
		frutas.add("uva");
		frutas.add("uva"); //não vai ser adecionado
		frutas.add("Uva");
		frutas.add("UvA");
		

		System.out.println(frutas);
		
		Set<String> frutas2 = new HashSet<>(); //não ordenada
		frutas2.add("abacaxi");
		frutas2.add("pera");
		frutas2.add("melão");
		System.out.println(frutas2);
		
		frutas.addAll(frutas2);
		
		System.out.println(frutas);
		
		

	}

}
