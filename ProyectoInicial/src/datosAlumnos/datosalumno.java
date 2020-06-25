package datosAlumnos;

public class datosalumno {
 
private String nombre, direccion,dni, telefono;

	public datosalumno(String nombre, String direccion,String dni,String  telefono) {
		this.nombre=nombre; 
		this.direccion=direccion;
		this.dni=dni;
		this.telefono=telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
