package Clase8;

import java.util.Stack;

public class stack {
	/** Pilas
	 * Recorrer LIFO
	 * @param args
	 */
	public static void main(String[] args) {
		DatosPersona dp= new DatosPersona();
		Stack<DatosPersona> pila1= new Stack<DatosPersona>();
		System.out.println("Insertando elementos en pila");
		/*pila1.push("Juan");
		pila1.push("Jhon");
		pila1.push("Margis");*/
		System.out.println("Tamaño"+pila1.size());
		System.out.println("primer elementos"+pila1.peek());
		System.out.println("extraer"+pila1.pop());
		//System.out.println("limpiar pila"+pila1.clear());		
		dp.setNombre("jhon");
		dp.setNumer(123);
		pila1.push(dp);
		
	}

}
