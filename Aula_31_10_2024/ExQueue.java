package colecoes;

import java.util.LinkedList;
import java.util.Queue;


public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pedidos = new LinkedList<>();
		
		//adicionar os itens na fila
		pedidos.add("pedido 1"); //add (gera erro de exceção)
		pedidos.add("pedido 2");
		
		pedidos.offer("pedido 3"); //add -> retorna false
		
		System.out.println(pedidos);
		
		//remover pedido da fila
		pedidos.remove(); //FIFO - REMOVE O PRIMEIRO 
				
		System.out.println(pedidos);
		
		//mostra o primeiro elemento da fila
		System.out.println(pedidos.peek());
		pedidos.remove();
		System.out.println(pedidos.peek());
		pedidos.remove();
		System.out.println(pedidos.peek());
	}

}
