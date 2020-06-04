package clase3;

public class Heriencia {
	
	public static void main (String args []) {
		int valor1, valor2;
		suma s= new suma();
		resta r = new resta();
		Operaciones o = new Operaciones();
		o.cargar();
		valor1=o.valor1;
		valor2=o.valor2;
		s.sumar(valor1,valor2);
		s.mostrarResultado();
		r.restar(valor1,valor2);
		r.mostrarResultado();
	}

}
