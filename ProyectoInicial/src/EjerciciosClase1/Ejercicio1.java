package EjerciciosClase1;

import java.util.Scanner;

/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 1 Taller 1
 */

public class Ejercicio1 {
	private static Scanner teclado;
	private static int num1;
	private static int num2;
	private static int num3;
	private static int num4;
	private static int suma;
	private static int multi;		

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese por favor el primer n�mero: ");
		num1= teclado.nextInt();
		System.out.println("Ingrese por favor el segundo n�mero: ");
		num2= teclado.nextInt();
		System.out.println("Ingrese por favor el tercer n�mero: ");
		num3= teclado.nextInt();
		System.out.println("Ingrese por favor el cuarto n�mero: ");
		num4= teclado.nextInt();
		suma=num1+num2;
		multi=num3*num4;
		System.out.println("La suma de los dos primeros n�meros es: "+suma);
		System.out.println("La multiplicaci�n de los otros dos n�meros es: "+multi);
	}
}
