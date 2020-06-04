package EjerciciosClase3;

import java.util.Scanner;

public class HerenciaEjercI {
	/**
	 * Programa que toma atributos nombre y edad de una persona y define responsabilidades
	 */
	private String nombre;
	private int edad;
	private Scanner teclado;
	
	public HerenciaEjercI() {
		
	}
	
	public void cargar() {
		teclado=new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		this.nombre=teclado.next();
		System.out.println("Ingrese la edad: ");
		this.edad=teclado.nextInt();
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public int edad() {
		return this.edad;
	}
}
