package EjerciciosClase1;

import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner teclado;
	private static int num1,num2,num3,num4,suma,prom;
	public static void main(String args[]) {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese por favor el primer n�mero: ");
		num1= teclado.nextInt();
		System.out.println("Ingrese por favor el segundo n�mero: ");
		num2= teclado.nextInt();
		System.out.println("Ingrese por favor el tercer n�mero: ");
		num3= teclado.nextInt();
		System.out.println("Ingrese por favor el cuarto n�mero: ");
		num4= teclado.nextInt();
		suma=num1+num2+num3+num4;
		prom=suma/4;
		System.out.println("La suma es: "+suma+" El promedio es: "+prom);
	}
}
