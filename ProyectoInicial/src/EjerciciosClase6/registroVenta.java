package EjerciciosClase6;

public class registroVenta {
	String 	tipoIdentificacion;
	int  numeroIdentificacion,codigoProducto,cantidad,total;
	
	public registroVenta(String tipoIdentificacion, int numeroIdentificacion, int codigoProducto, int cantidad, int total) {
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
		this.total = total;
	
	}
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void SetcodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getcantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int gettotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

}
