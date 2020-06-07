package EjerciciosClase4;

public class persona {
	private int edad;
	private int precio;
    
    /**
     * Constructor por defecto
     * @param edad
     */
    public persona(int edad ,int precio){
        this.edad=edad;
        this.precio=precio;
    }

    public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
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
