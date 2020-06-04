package EjerciciosClase2;

import java.util.Scanner;
/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 2 Taller 2
 */
public class Club {
	private static Socio atrib1;
	private static Socio atrib2;
	private static Socio atrib3;
	private static Scanner teclado;
	/**
	 * Se inicia el programa con llamado a los metodos de captura de datos
	 * @param args
	 */
	public static void main(String args[]) {
		teclado=new Scanner(System.in);
		atrib1=new Socio(asignarNombre(), asignarTiempo());
		atrib2=new Socio(asignarNombre(), asignarTiempo());
		atrib3=new Socio(asignarNombre(), asignarTiempo());
		masAntiguo();
	}
	
	/**
	 * Metodo para evaluar socio mas antiguo
	 */
	private static void masAntiguo() {
		int num1,num2,num3;
		num1=atrib1.antiguedad();
		num2=atrib2.antiguedad();
		num3=atrib3.antiguedad();
		if(num1>num2 && num1>num3) {
			System.out.println("El socio con mayor antiguedad es: " +atrib1.socio());
		}if(num2>num1 && num2>num3) {
			System.out.println("El socio con mayor antiguedad es: " +atrib2.socio());
		}if(num3>num2 && num3>num1) {
			System.out.println("El socio con mayor antiguedad es: " +atrib3.socio());
		}
	}
	/**
	 * Captura del nombre del socio
	 * @return
	 */
	private static String asignarNombre() {
		String name;
		System.out.println("ingrese el nombre del socio: ");
		name=teclado.next();	
		return name;
	}
	/**
	 * Captura de la antiguedad del socio
	 * @return
	 */
	private static int asignarTiempo() {
		int antig;
		System.out.println("Ingrese la antiguedad en años: ");
		antig=teclado.nextInt();
		return antig;
	}
}
