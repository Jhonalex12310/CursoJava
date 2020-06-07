package EjerciciosClase6;

public enum Productos {

	Celular(1, 750000), Computador(2, 2000000), Portatil(3, 1500000), 
	Tablet(4, 750000), Diadema(5, 155000), XBox(6, 1600000), 
	PS4(7, 1700000), NintendoSwitch(8, 1800000), Controles(9, 250000), 
	Cargadores(10, 100000);

	private final int codigo;
	private final int valor;

	private Productos(int codigoProducto, int valorProducto) {
		this.codigo = codigoProducto;
		this.valor = valorProducto;
	}

	public int getCodigoProducto() {
		return codigo;
	}

	public int getValorProducto() {
		return valor;
	}

}
