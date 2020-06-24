package EjercicioClase7;


public class MainClase7 extends Thread {	


	public static void main(String[] args) throws InterruptedException {
		for (int a=0; a<21;a++) {
			System.out.println("el número de la secuencia es: "+(a+1));
			Thread.sleep(1500);
		}
	}
	

}
