package EjerciciosClase1;

import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner teclado;
	private static int nota1,nota2,nota3,prom;
	public static void main(String args[]) {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese por favor la primer nota: ");
		nota1= teclado.nextInt();
		System.out.println("Ingrese por favor la segunda nota: ");
		nota2= teclado.nextInt();
		System.out.println("Ingrese por favor la tercer nota: ");
		nota3= teclado.nextInt();
		prom=(nota1+nota2+nota3)/3;
		if(prom>=7) {
			System.out.println("Promocionado");
		}else {
			System.out.println("No promocionado");	
		}
	}
}