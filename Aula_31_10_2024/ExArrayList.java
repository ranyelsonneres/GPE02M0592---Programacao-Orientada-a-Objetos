package colecoes;

//import java.util.Collection;
//import java.util.List; //traz a interface especifica

//import java.util.*; //traz todas as interfaces

import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nomes = new ArrayList<>();
		
		//adicionar
		nomes.add("Teste 0"); //0
		nomes.add("Teste 1"); //1
		nomes.add("Teste 2"); //2
		
		nomes.set(0, "Teste 00");
		//remover
		//nomes.remove(0);
		//nomes.remove("Teste 0");
		
		System.out.println(nomes);
		System.out.println(nomes.size()); //tamanho do arraylist
		
		//percorrer a lista
		for (String nome : nomes) {
			System.out.println(nome);
			//ação aqui dentro
		}
		
		//for-Each (class map)
		nomes.forEach(nome -> System.out.println(nome));

	}

}
