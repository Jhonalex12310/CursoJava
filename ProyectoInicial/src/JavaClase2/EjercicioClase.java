package JavaClase2;

import java.util.Scanner;
/**
 * Ejercicio Clase 2
 * 
 * @author JhonattanDiaz
 * @since 05/26/2020
 * @version 1
 * 
 */
public class EjercicioClase {
	private Scanner teclado;
	private static String nombre;
	private static int salario;

	public void inicio() {
		teclado = new Scanner(System.in);
        System.out.println("Digite su nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su salario: ");
        salario = teclado.nextInt();
	}
	
	public void mostrarDatos(String name,int salary){
		System.out.println("Su nombre es: "+name+" y su salario es: $"+salary);
	}
	
	public void pagoImp(int sala) {
		if(sala>3000000) {
			System.out.println("Debe pagar impuesto");
		}else {
			System.out.println("No debe pagar impuesto");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjercicioClase eje = new EjercicioClase();
		eje.inicio();
		eje.mostrarDatos(nombre,salario);
		eje.pagoImp(salario);		

	}
	

}
