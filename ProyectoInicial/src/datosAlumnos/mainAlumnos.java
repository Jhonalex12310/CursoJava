package datosAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class mainAlumnos {
	private static Scanner teclado;
	private static int opcion;
	private static ArrayList<datosalumno> lista1= new ArrayList<datosalumno>();
	private static int plazas, cupos;

	public static void main(String[] args) {
		mainAlumnos main= new mainAlumnos();
		teclado= new Scanner(System.in);
		plazascurso();
		main.iniciar();
	}	
	
	private void iniciar() {		
		System.out.println("Seleccione una opción");
		System.out.println("1. Matricular");
		System.out.println("2. Buscar Alumno");
		System.out.println("3. Ver datos curso");
		System.out.println("4. Salir");
		opcion =teclado.nextInt();
		switch (opcion) {
		case 1:
			ingresar();
			break;
		case 2:	
			busqueda();
			break;
		case 3:			
			imprimir();
			break;
		case 4:
			System.exit(0);
		default:
			iniciar();
		}
		
	}
	
	private static void plazascurso() {
		System.out.println("Ingrese la cantidad de cupos en el curso: ");
		cupos=teclado.nextInt();
	}
	
	private void busqueda() {
		String dni;
		System.out.println("Ingrese el dni:");
		dni= teclado.next();
		if(buscar(dni)) {
			for(int a=0;a<lista1.size();a++) {
				if(dni.equals(lista1.get(a).getDni())) {
					System.out.println("El alumno: "+lista1.get(a).getNombre()+" se identifica con: "+lista1.get(a).getDni()+ " reside en: "+lista1.get(a).getDireccion()+ " su telefono es: "+lista1.get(a).getTelefono());
				}				
			}			
		}else {
			System.out.println("no encontrado");
		}
		iniciar();
	}
	
	private boolean buscar(String dni){
		int cont=0;
		for(int a=0;a<lista1.size();a++) {
			if(dni.equals(lista1.get(a).getDni())) {
				cont ++;
			}
		}
		if(cont>0) {
			return true;	
		}else {
			return false;
		}
	}
	
	private void ingresar() {
		if(!cantplazas()) {
			String nombre, direccion,dni, telefono;			
			System.out.println("Ingrese el dni");
			dni=teclado.next();
			if(buscar(dni)) {
				System.out.println("El alumno ya existe");
			}else {
				System.out.println("Ingrese el nombre");
				nombre=teclado.next();
				System.out.println("Ingrese el direccion");
				direccion=teclado.next();
				System.out.println("Ingrese el telefono");
				telefono=teclado.next();
				datosalumno datos= new datosalumno(nombre,direccion,dni,telefono);
				lista1.add(datos);
				plazas++;
			}
			
		}else {
			System.out.println("Ya se completo la cantidad máxima de alumnos de : "+plazas);
		}
		
		iniciar();
	}
	
	private boolean cantplazas() {
		if(plazas < cupos) {
			return false;
		}else {
			return true;
		}
	}
	
	private void imprimir() {
		for(int a=0;a<lista1.size();a++) {
			System.out.println("El alumno: "+lista1.get(a).getNombre()+" se identifica con: "+lista1.get(a).getDni()+ " reside en: "+lista1.get(a).getDireccion()+ " su telefono es: "+lista1.get(a).getTelefono());
		}		
		iniciar();
	}
}
