package clase3;

import java.util.Scanner;

public class Operaciones {
	protected Scanner teclado;
	protected int valor1, valor2, resultado;
	
	public Operaciones() {
		teclado= new Scanner(System.in);
	}
	
	public void cargar() {
		System.out.println("Digite el valor de a:");
		valor1=teclado.nextInt();
		System.out.println("Digite el valor de b:");
		valor2=teclado.nextInt();
	}
	
	public void mostrarResultado () {
		System.out.println("El resultado es: "+this.resultado);
	}

}
