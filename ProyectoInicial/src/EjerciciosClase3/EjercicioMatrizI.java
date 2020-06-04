package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa que captura los datos de un grupo de alumnos (tipo y numero de documento, nombre y nivel de ingles) y permite operar
 * @author Jhonattan
 *
 */
public class EjercicioMatrizI {
private String [][] academia;
private Scanner teclado;
	/**
	 * Recibe el parametro para determinar tamaño del arreglo y captura datos basicos
	 * @param cantidad
	 */
	public void inicio(int cantidad) {
		teclado=new Scanner(System.in);
		academia=new String[cantidad][4];
		for(int a=0;a<cantidad;a++) {
			System.out.println("Ingrese el tipo de identificación:");
			academia[a][0]=teclado.next();
			System.out.println("Ingrese el número de identificación:");
			academia[a][1]=teclado.next();
			System.out.println("Ingrese el Nombre:");
			academia[a][2]=teclado.next();
			System.out.println("Ingrese el nivel de inglés:");
			academia[a][3]=teclado.next();			
		}		
		this.continuar();
	}
	/**
	 * Permite al usuario navegar con las opciones del programa
	 */
	private void continuar() {
		int cant=0;
		while(true) {
			System.out.println("Acontinuación seleccione una opción:");
			System.out.println("1. Ver el listado de estudiantes");
			System.out.println("2. Buscar un estudiante");
			cant=teclado.nextInt();
			switch (cant) {
			case 1:	
				this.imprimir();
				break;
			case 2:		
				this.buscar();
				break;
			default:
				break;
			}
		}
		
	}
	/**
	 * Busca un usuario por medio de numero de documento o el nombre
	 */
	private void buscar() {
		String criterio;
		System.out.println("por favor ingrese un criterio de busqueda: ");
		criterio=teclado.next();
		for(int a=0;a<academia.length;a++) {
			if(criterio.equals(academia[a][1])||criterio.equals(academia[a][2])) {
				System.out.println("El nivel de inglés de: "+academia[a][2]+" es: "+academia[a][3]);				
			}
		}
	}
	/**
	 * Imprime el arreglo por pantalla
	 */
	private void imprimir() {
		for(int a=0;a<academia.length;a++) {
			System.out.println("Tipo documento es:  "+academia[a][0]+" número de documento: "+academia[a][1]+" Nombre: "+academia[a][2]);
		}		
	}

}
