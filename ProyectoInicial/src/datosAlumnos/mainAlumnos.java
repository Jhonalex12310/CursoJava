package datosAlumnos;

import java.util.Scanner;

public class mainAlumnos {
	private static Scanner teclado;
	private static int opcion;
	static gestion gest= new gestion();

	public static void main(String[] args) {
		mainAlumnos main= new mainAlumnos();		
		gest.plazascurso();
		main.iniciar();
	}	
	
	public void iniciar() {	
		teclado= new Scanner(System.in);
		System.out.println("Seleccione una opción");
		System.out.println("1. Matricular");
		System.out.println("2. Buscar Alumno");
		System.out.println("3. Ver datos curso");
		System.out.println("4. Salir");
		opcion =teclado.nextInt();
		switch (opcion) {
		case 1:
			gest.ingresar();
			break;
		case 2:	
			gest.busqueda();
			break;
		case 3:			
			gest.imprimir();
			break;
		case 4:
			System.exit(0);
		default:
			iniciar();
		}
		
	}
	
	
}
