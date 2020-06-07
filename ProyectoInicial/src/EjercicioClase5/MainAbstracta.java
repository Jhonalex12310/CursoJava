package EjercicioClase5;

import java.util.Scanner;

public class MainAbstracta {
	private Scanner teclado;
	private static MainAbstracta main;
	private String nombre,apellido;
	private int edad,salario;
	private double extras;

	public static void main(String[] args) {
		main=new MainAbstracta();
		main.inicio();
	}

	private void inicio() {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		nombre=teclado.next();
		System.out.println("Ingrese el apellido: ");
		apellido=teclado.next();
		System.out.println("Ingrese edad: ");
		edad=teclado.nextInt();
		System.out.println("Ingrese salario: ");
		salario=teclado.nextInt();
		System.out.println("Ingrese extras: ");
		extras=teclado.nextDouble();
		Comercial comercial= new Comercial(nombre, apellido, edad, salario);		
		System.out.println("El empleado: "+comercial.getNombre()+""+comercial.getApellido()+" de edad: "+comercial.getEdad()+" devenga este mes el valor de: $"+(comercial.getSalario()+comercial.extras(extras)));
	}

}
