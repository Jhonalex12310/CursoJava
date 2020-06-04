package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa que captura la cantidad de números a almacenar, los almacena y los suma 
 * @author Jhonattan
 *
 */
public class VectoresEjerc2 {

	private int[] arreglo;
	private Scanner teclado;
/**
 * 	Captura la cantidad de números a almacenar, con el fin de construir el vector
 * @param cantidad
 */
	public void Inicio(int cantidad) {
		teclado= new Scanner(System.in);
		arreglo=new int[cantidad];
		for(int a=0; a<cantidad;a++) {
			System.out.println("Ingresa el número: "+ (a+1));
			arreglo[a]=teclado.nextInt();
		}
		this.operacion();
	}
/**
 * suma todos los números almacenados en el vector
 */
	private void operacion() {
		int suma=0;
		for(int a=0; a<arreglo.length;a++) {
			suma=suma+arreglo[a];
		}
		System.out.println("La suma de todos los elementos es: "+suma);
	}

}
