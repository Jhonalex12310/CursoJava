package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa que captura la cantidad de personas a almacenar, crea un arreglo y alamacena las personas
 * @author Jhonattan
 *
 */
public class MainVectorEjerI {
	private static Scanner teclado;
	private static VectoresEjerc1 vec;
/**
 * Metodo principal
 * @param args
 */
	public static void main(String[] args) {
		vec= new VectoresEjerc1();
		teclado=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de personas a almacenar: ");
		vec.Inicio(teclado.nextInt());		
	}
}
