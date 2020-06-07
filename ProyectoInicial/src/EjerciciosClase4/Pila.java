package EjerciciosClase4;

import java.util.Stack;

public class Pila {
	private static int cantidad;
	private static int precio,total;

	public static void main(String[] args) {
		Stack<persona> pila = new Stack<persona>();
		cantidad=(int) Math.floor(Math.random()*50+5); 
		for(int a =0;a< cantidad; a++) {
			int valor = (int) Math.floor(Math.random()*60+5);
			precio=calcularprecio(valor);
			persona a1 = new persona(valor,precio);
	        pila.push(a1); 
	        System.out.println("Visitante número "+(a+1)+" tiene "+valor+" años y paga: $"+precio);
		}
        while (!pila.isEmpty()) { 
        	total=total+pila.pop().getPrecio();
        }
        System.out.println("El total de venta es: $"+total+ " para una cantidad de "+cantidad+ " de personas");
	}

	private static int calcularprecio(int valor) {
		int precio=0;
		if(valor>=5 && valor<=10) {
			precio=5000;
		}else if(valor>=11 && valor<=17) {
			precio=7500;
		}else if(valor>=18) {
			precio=10000;
		}
		return precio;
	}

}
