package EjercicioClase5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEjercicio1 {
	private  Scanner teclado;
	private static MainEjercicio1 main;
	private int cantidad;
	private String nombre;
	private Double estatura;
	
	
	public static void main(String[] args) {		
;		main=new MainEjercicio1();
		main.numeroAlumnos();
	}
	
	private void numeroAlumnos() {
		teclado=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos: ");
		cantidad=teclado.nextInt();
		main.leerAlturas();
	}
	private void leerAlturas() {
		ArrayList<Ejercicio1> Ejer1 = new ArrayList<Ejercicio1>();
		for(int a=0; a<cantidad;a++) {
			System.out.println("Ingrese el nombre:");
			nombre=teclado.next();
			System.out.println("Ingrese la estatura");
			estatura=teclado.nextDouble();
			Ejercicio1 Ejer= new Ejercicio1(nombre,estatura);
			Ejer1.add(Ejer);
		}main.calcularMedias(Ejer1);
	}
	
	private void calcularMedias(ArrayList<Ejercicio1> ejer1) {
		Double promedio=0.0;
		int altos=0, bajos=0;
		for(int a=0; a<cantidad;a++) {
			promedio=promedio+ejer1.get(a).getEstatura();
		}
		promedio=promedio/cantidad;
		for(int b=0;b<cantidad;b++) {
			if(ejer1.get(b).getEstatura()>=promedio) {
				altos++;
			}else {
				bajos++;
			}
		}
		main.mostrarResultados(promedio,altos,bajos,ejer1);
		
	}
	private void mostrarResultados(Double promedio, int altos, int bajos, ArrayList<Ejercicio1> ejer1) {
		for(int a=0; a<cantidad;a++) {
			System.out.println("El alumno: "+ejer1.get(a).getNombre()+" mide: "+ejer1.get(a).getEstatura());
		}
		System.out.println("El promedio de estatura es: "+promedio);
		System.out.println("Hay "+altos+" alumnos por encima del promedio");
		System.out.println("Hay "+bajos+" por debajo del promedio");
	}

}
