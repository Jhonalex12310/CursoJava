package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa que captura la cantidad de números a almacenar, los almacena y los suma
 * @author Jhonattan
 *
 */
public class MainVectorEjerII {
	private static Scanner teclado;
	private static VectoresEjerc2 vec;
/**
 * Metodo principal
 * @param args
 */
	public static void main(String[] args) {
		vec= new VectoresEjerc2();
		teclado=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de números a almacenar: ");
		vec.Inicio(teclado.nextInt());	
	}

}
