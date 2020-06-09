package Clase8;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
/**Colas
 * Recorrer FIFO
 * @param args
 */
	public static void main(String[] args) {
		DatosPersona dp= new DatosPersona();
		Queue<String> cola1= new LinkedList<String>();
		cola1.add("Juan");
		cola1.add("Jhon");
		cola1.add("Margis");
		System.out.println("Elementos total: "+cola1.size());
		System.out.println("Extraer primero: "+cola1.poll());
		System.out.println("consultar primero de la cola "+cola1.peek());
		for (String elemento: cola1)
			System.out.print(elemento + "-");
		
		/**
		 Priority Queue
		 */
		System.out.println("");
		PriorityQueue<Integer> cola2= new PriorityQueue<Integer>();
		cola2.add(70);
		cola2.add(120);
		cola2.add(7);
		System.out.println("Impresion de la cola con prioridades de enteros");
		while(!cola2.isEmpty()) {
			System.out.print(cola2.poll()+"-");
		}
		System.out.println("");
		PriorityQueue<String> cola3= new PriorityQueue<String>();
		cola3.add("Juan");
		cola3.add("Jhon");
		cola3.add("Margis");
		System.out.println("Impresion de la cola con prioridades alfabetico");
		while(!cola3.isEmpty()) {
			System.out.print(cola3.poll()+"-");
		}
		
		PriorityQueue<DatosPersona> cola4= new PriorityQueue<DatosPersona>();
		dp.setNombre("Juan");
		dp.setNumer(122);
		cola4.add(dp);
		dp.setNombre("Jhonson");
		dp.setNumer(123);
		cola4.add(dp);
		System.out.println("Impresion de la cola con prioridades alfabetico");
		while(!cola4.isEmpty()) {
			System.out.print(cola4.poll()+"-");
		}
	}

}
