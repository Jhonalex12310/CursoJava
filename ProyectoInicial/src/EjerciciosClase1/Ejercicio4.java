package EjerciciosClase1;

import java.util.Scanner;
/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 4 Taller 1
 */
public class Ejercicio4 {
	private static Scanner teclado;
	private static int cantidad, precio, valort;

	public static void main(String[] args) {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese el precio del articulo: ");
		precio=teclado.nextInt();
		System.out.println("Ingrese la cantidad: ");
		cantidad=teclado.nextInt();
		valort=cantidad*precio;
		System.out.println("el precio a pagar es: $"+valort);

	}

}
