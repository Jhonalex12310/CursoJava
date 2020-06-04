package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa que almacena 10 numeros capturados por pantalla en una matriz 2X5 y muestra la suma de las filas
 * @author Jhonattan
 *
 */
public class MainEjercicioMatrizII {
	private static Scanner teclado;
	private static int [][] matriz;
	private static int [] vector;
	/**
	 * Metodo principal, captura los valores y los almacena en un arreglo
	 * @param args
	 */
	public static void main(String args[]) {
		teclado= new Scanner(System.in);
		matriz= new int[2][5];
		vector= new int[5];
		for(int b=0;b<2;b++) {
			for(int a=0;a<5;a++) {			
				System.out.println("Ingrese número");
				matriz[b][a]=teclado.nextInt();
			}
		}
		vectorsuma();		
	}
	/**
	 * Opera los valores del arreglo, suma las filas y las almacena en un vector
	 */
	private static void vectorsuma() {
		for (int a=0;a<5;a++) {
			vector[a]=matriz[0][a]+matriz[1][a];
			System.out.println("Suma de la fila número: "+(a+1)+" es: "+vector[a] );
		}		
	}
}
