package Clase8;

import java.util.ArrayList;

public class ArrayLst {
/**
 * array dimensiona de manera automatica los procesos de insercion y las extracicones de datos
 * @param args
 */
	public static void main(String[] args) {
		ArrayList<String> lista1= new ArrayList<String>();
		lista1.add("Juan");
		lista1.add("Jhon");
		lista1.add("Juana");
		imprimir(lista1);

	}
	
	public static void imprimir(ArrayList<String> lista) {
		for(String elemento: lista)
			System.out.print(elemento+"-");
		System.out.println("Elemento en particular: "+lista.get(1));
		System.out.println("tamaño: "+lista.size());
	}

}
