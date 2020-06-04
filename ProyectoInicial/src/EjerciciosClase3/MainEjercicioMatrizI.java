package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa para capturar datos de una academia de ingles (Numero y tipo de documento, nombre y nivel de ingles)
 * @param cantidad
 */
public class MainEjercicioMatrizI {
private static Scanner teclado;
private static EjercicioMatrizI mat;
	/**
	 * Metodo principal, captura el tamaño del arreglo, cantida de alumnos
	 * @param args
	 */
	public static void main(String[] args) {
		mat= new EjercicioMatrizI();
		teclado=new Scanner(System.in);		
		System.out.println("Ingrese la cantidad de alumnos:");
		mat.inicio(teclado.nextInt());	
	}

}
