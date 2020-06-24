package clase9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CuadradoNumero {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int num;
		boolean continuar=true;
		do {	
			try {
				continuar=false;
				System.out.print("Ingrese un valor entero:");
				num = teclado.nextInt();
				int cuadrado = num * num;
				System.out.print("El cuadrado de " + num + " es " + cuadrado);
			}catch (InputMismatchException e) {
				System.out.println("ingresar numero entero, el error es "+e);
				teclado.next();
				continuar=true;
			}catch (Exception ex) {
				System.out.println("Se presento otro error "+ex);
				teclado.next();
				continuar=true;
			}
		} while (continuar);
	}

}
