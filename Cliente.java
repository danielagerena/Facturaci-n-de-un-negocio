
public class Cliente{
	String nombreCliente;
	int numeroId;
	String tipoIdentificacion;

	/*vendedor vendedor;
	factura factura;*/

	public Cliente(){

	}

	public Cliente (String nombreCliente){ //constructor.
		this.nombreCliente = nombreCliente;
	}

	public Cliente (int numeroId){
		this.numeroId = numeroId;
	}

	/*public Cliente (String tipoIdentificacion){
		this.tipoIdentificacion = tipoIdentificacion;
	}*/

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

	/*public vendedor getVendedor(){
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
	}*/
}