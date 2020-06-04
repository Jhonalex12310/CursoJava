package Clase6;

import java.util.Scanner;

public class DatosPersona {
	int numeroidentificacion;
	String nombre;
	Scanner teclado;
	
	public DatosPersona() {
		teclado=new Scanner(System.in);
		System.out.println("Ingrese Nombre");
		nombre=teclado.next();
		System.out.println("Ingrese ID");
		numeroidentificacion=teclado.nextInt();
	}
	
	

}
