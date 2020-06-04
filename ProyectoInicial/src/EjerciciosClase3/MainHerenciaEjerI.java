package EjerciciosClase3;

public class MainHerenciaEjerI {
	private static HerenciaEjercI here;
	private static HerenciaEjerciI her;
	
	
	public static void main(String args[]) {
		here = new HerenciaEjercI();
		her= new HerenciaEjerciI();
		here.cargar();
		her.asigsueldo();
		System.out.println("El nombre es: "+ here.nombre()+" la edad es: "+here.edad()+" el salario es: "+her.salario());
	}

}
