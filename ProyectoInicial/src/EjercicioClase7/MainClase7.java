package EjercicioClase7;

import java.util.Scanner;

public class MainClase7 extends Thread {	

	Scanner teclado = new Scanner(System.in);
	String nombre, dia;
	int hora;

	public MainClase7() {
		
	}

	

	public static void main(String[] args) throws InterruptedException {
		for (int a=0; a<21;a++) {
			System.out.println("el número de la secuencia es: "+(a+1));
			Thread.sleep(1500);
		}
	}
	

}
