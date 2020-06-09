package Clase8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {	

	public static void main(String[] args) {
		/**
		 * HashSet no permite repetidos, almacena en el cualquier orden
		 * @param args
		 */
		Set<Integer> conjunto1= new HashSet<Integer>();
		conjunto1.add(2);
		conjunto1.add(212);
		conjunto1.add(22);
		conjunto1.add(222);
		conjunto1.add(2);
		for(int elemento: conjunto1)
			System.out.print(elemento+"-");
		System.out.println("");
		
		/**
		 * TreeSet no permite repetidos, almacena en orden los valores
		 * @param args
		 */
		Set<Integer> conjunto2= new TreeSet<Integer>();
		conjunto2.add(2);
		conjunto2.add(12);
		conjunto2.add(22);
		conjunto2.add(222);
		conjunto2.add(2);
		for(int elemento: conjunto2)
			System.out.print(elemento+"-");
		System.out.println("");
		
		/**
		 * LinkedHashSet no permite repetidos, almacena en orden los valores, lista doblemente enlazada
		 * @param args
		 */
		Set<Integer> conjunto3= new LinkedHashSet<Integer>();
		conjunto3.add(2);
		conjunto3.add(1222);
		conjunto3.add(22);
		conjunto3.add(222);
		conjunto3.add(2);
		for(int elemento: conjunto3)
			System.out.print(elemento+"-");
		System.out.println("");
	}

}
