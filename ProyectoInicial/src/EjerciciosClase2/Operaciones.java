package EjerciciosClase2;
/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 1 Taller 2
 */
public class Operaciones {
	private int num1;
	private int num2;
	private int sum,resta,multi;
	private double div;
	
	public Operaciones(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		this.suma();
		this.resta();
		this.multi();
		this.div();
	}
	private void div() {
		this.div=Double.valueOf(this.num1)/Double.valueOf(this.num2);
		System.out.println("Divisi�n: "+div);
	}
	private void multi() {
		this.multi=this.num1*this.num2;
		System.out.println("Multiplicaci�n: "+multi);
	}
	private void resta() {
		this.resta=this.num1-this.num2;
		System.out.println("Resta: "+resta);
	}
	private void suma() {
		this.sum=this.num1+this.num2;
		System.out.println("Suma: "+sum);
	}
}