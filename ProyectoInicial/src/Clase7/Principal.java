package Clase7;

public class Principal {

	public static void main(String[] args) {
		Persona p= new Persona();
		p.setNombre("Jhonson");
		p.setPatron("huella");
		Android a= new Android("Samsung", p);
		a.setPatron("Huella");
		System.out.println(""+a.validar(p));
	}

}
