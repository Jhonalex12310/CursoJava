package EjerciciosClase2;

import java.util.Scanner;
/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 1 Taller 2
 */
public class LlamadaOper {
	private static int num1,num2;
	private static Scanner teclado;
	public static void main(String args[]) {		
		teclado= new Scanner(System.in);
		System.out.println("ingrese el n�mero 1");
		num1=teclado.nextInt();
		System.out.println("ingrese el n�mero 2");
		num2=teclado.nextInt();
		new Operaciones(num1,num2);
	}

}
