package EjerciciosClase1;

import java.util.Scanner;

/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 5 Taller 1
 */

public class Ejercicio5 {
	private static Scanner teclado;
	private static int  cant, aciertos, resul;
	

	public static void main(String[] args) {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de preguntas realizadas:");
		cant=teclado.nextInt();
		System.out.println("Ingrese la cantidad de preguntas, contestadas de forma correcta:");
		aciertos=teclado.nextInt();
		resul=(aciertos*100)/cant;
		if(resul>=90) {
			System.out.println("Nivel Máximo");			
		}if(resul>=75 && resul<90) {
			System.out.println("Nivel Medio");			
		}if(resul>=50 && resul<75) {
			System.out.println("Nivel Regular");			
		}if(resul<50) {
			System.out.println("Fuera de nivel");			
		}
	}

}
