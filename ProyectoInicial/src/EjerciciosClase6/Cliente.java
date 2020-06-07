package EjerciciosClase6;

import java.util.Scanner;

/***
 * Clase que almacena los datos de cada cliente
 * @author Jhonattan
 *
 */
public class Cliente {
	String tipodoc;
	public int numdoc;
	public String nombre;
	Scanner teclado;
	
	public Cliente() {
		teclado = new Scanner(System.in);
		System.out.println("Digite el tipo de identificación: ");
		this.tipodoc = teclado.next();
		System.out.println("Digite el número de identificación: ");
		this.numdoc = teclado.nextInt();
		System.out.println("Digite su nombre completo: ");
		this.nombre = teclado.next();
		
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public int getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(int numdoc) {
		this.numdoc = numdoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

}
