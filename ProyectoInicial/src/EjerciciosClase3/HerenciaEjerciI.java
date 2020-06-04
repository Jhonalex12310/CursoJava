package EjerciciosClase3;

import java.util.Scanner;

public class HerenciaEjerciI extends HerenciaEjercI{
	private int salary;
	private Scanner teclado;
	
	public HerenciaEjerciI() {
		super();
	}
	

	public void asigsueldo() {		
		 teclado=new Scanner(System.in);
		 System.out.println("Ingrese salario: ");
		 salary=teclado.nextInt();
	}
	
	public int salario() {
		return this.salary;
	}

}
