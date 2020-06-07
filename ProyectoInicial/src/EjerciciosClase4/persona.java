package EjerciciosClase4;

public class persona {
	private int edad;
    
    /**
     * Constructor por defecto
     * @param edad
     */
    public persona(int edad){
        this.edad=edad;
    }

    /**
     * Devuelve la edad
     * @return Edad acutal
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad
     * @param edad Valor edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
