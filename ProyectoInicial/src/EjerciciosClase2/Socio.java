package EjerciciosClase2;

/**
 * 
 * 	@author Jhonattan
 *	@version 1
 *	@Ejercicio 2 Taller 2
 */
public class Socio {
	private String nombre;
	private int antiguedad;
	/**
	 * Recepcion de datos de la clase en el constructor
	 * @param name
	 * @param antig
	 */
	public Socio(String name, int antig) {
		this.nombre=name;
		this.antiguedad=antig;
	}
	/**
	 * Retorno de la antiguedad
	 * @return
	 */
	public int antiguedad() {
		return this.antiguedad;
	}
	/**
	 * Retorno del nombre
	 * @return
	 */
	public String socio() {
		return this.nombre;
	}


}
