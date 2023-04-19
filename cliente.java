
public class cliente{
	String nombreCliente;
	int numeroId;
	String tipoIdentificacion;

	vendedor vendedor;
	factura factura;

	public cliente (String nombreCliente){ //constructor.
		this.nombreCliente = nombreCliente;
	}

	public cliente (int numeroId){
		this.numeroId = numeroId;
	}

	public cliente (String tipoIdentificacion){
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNombreCliente(){ //get set.
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente){
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroId(){
		return numeroId;
	}
	public void setNumeroId(int numeroId){
		this.numeroId = numeroId;
	}

	public String getTipoIdentificacion(){
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion){
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public vendedor getVendedor(){
		return vendedor;
	}
	public void setVendedor(vendedor vendedor){
		this.vendedor = vendedor;
	}

	public factura getFactura(){
		return factura;
	}
	public void setCodigo(factura factura){
		this.factura = factura;
	}
}