package EjerciciosClase3;

import java.util.Scanner;
/**
 * Programa que captura la cantidad de personas a almacenar, crea un arreglo y alamacena las personas
 * @author Jhonattan
 *
 */
public class VectoresEjerc1 {
	private String[] arreglo;
	private Scanner teclado;
	private int ingreso;
	
	public VectoresEjerc1() {
		
	}
/**
 * 	captura los nombres de cada persona
 * @param cantidad
 */
	public void Inicio(int cantidad) {
		teclado= new Scanner(System.in);
		arreglo=new String[cantidad];
		for(int a=0; a<cantidad;a++) {
			System.out.println("Ingresa el nombre número: "+ (a+1));
			arreglo[a]=teclado.nextLine();
		}
		this.operacion();
	}
	/**
	 * Seleccion multiple, para interaccion del usuario
	 */
	private void operacion() {
		while(true) {
			System.out.println("Ingrese un número de acuerdo a la operación que desea realizar: ");
			System.out.println("1. Contar los registros");
			System.out.println("2. Imprimir los nombres");
			System.out.println("3. Buscar un nombre en el vector");
			System.out.println("4. Actualizar un nombre en el vector");
			ingreso=teclado.nextInt();
			switch (ingreso) {
			case 1:
				contar();				
				break;
			case 2:
				imprimir();				
				break;
			case 3:
				buscarNombre();				
				break;
			case 4:
				actualizar();				
				break;
			}
		}
	}
	/**
	 * Actualiza el nombre de un usuario, ya almacenado
	 */
	private void actualizar() {
		String nombre;
		System.out.println("Ingrese el nombre a actualizar: ");
		nombre=teclado.next();
		for(int a =0; a< arreglo.length; a++) {
			if(nombre.equals(arreglo[a])) {
				System.out.println("Ingrese el nuevo nombre: ");
				arreglo[a]=teclado.next();			
			}
		}
		this.operacion();
	}
	/**
	 * Busca un usuario, y muestra su nombre y la cantidad de veces que esta almacenado
	 */
	private void buscarNombre() {
		String nombre;
		int contador=0;
		System.out.println("Ingrese el nombre que desea buscar: ");
		nombre=teclado.next();
		for(int a=0;a<arreglo.length;a++) {
			if(nombre.equals(arreglo[a])) {
				contador++;
			}
		}
		System.out.println("El nombre: "+nombre+" aparece almacenado: "+contador+" veces");
		this.operacion();
	}
	/**
	 * Imprime el arreglo de usuarios
	 */
	private void imprimir() {
		for(int a=0; a< arreglo.length;a++) {
			System.out.println("Nombre número: "+(a+1)+" es: "+ arreglo[a] );
		}
		this.operacion();
	}
	/**
	 * Muestra la cantidad de nombres almacenados
	 */
	private void contar() {
		System.out.println("El vector tiene: "+arreglo.length+" nombres almacenados");
		this.operacion();		
	}

}
