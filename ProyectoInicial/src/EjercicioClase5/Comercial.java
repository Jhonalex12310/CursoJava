package EjercicioClase5;

public class Comercial extends Empleado{
	private double  salariofinal;

	public Comercial(String nombre, String apellido, int edad, int salario) {
		super(nombre, apellido, edad, salario);
	}

	@Override
	public double extras(double sueldoExtra) {
		salariofinal=(salario/240)*sueldoExtra;
		return salariofinal;
	}

}
