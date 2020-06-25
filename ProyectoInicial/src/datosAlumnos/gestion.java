package datosAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class gestion {	
	private  Scanner teclado;
	private  ArrayList<datosalumno> lista1= new ArrayList<datosalumno>();
	private  int plazas, cupos;
	mainAlumnos main = new mainAlumnos();
	
	public void plazascurso() {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de cupos en el curso: ");
		cupos=teclado.nextInt();
	}
	
	public void busqueda() {
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
		main.iniciar();
	}
	
	public boolean buscar(String dni){
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
	
	public void ingresar() {
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
		
		main.iniciar();
	}
	
	public boolean cantplazas() {
		if(plazas < cupos) {
			return false;
		}else {
			return true;
		}
	}
	
	public void imprimir() {
		for(int a=0;a<lista1.size();a++) {
			System.out.println("El alumno: "+lista1.get(a).getNombre()+" se identifica con: "+lista1.get(a).getDni()+ " reside en: "+lista1.get(a).getDireccion()+ " su telefono es: "+lista1.get(a).getTelefono());
		}		
		main.iniciar();
	}

}
