import java.util.ArrayList;

public class factura{
	double precioTotal;
	String nombreCliente;
	String nombreVendedor;
	int idCliente;
	int idVendedor;

	cliente cliente;
	ArrayList <articulo> articulosFactura = new ArrayList<articulo>();

	public void registrarArticulo(articulo articulo){ //meter articulo a la lista de la factura de un cliente específico
		articulosFactura.add(articulo);
		articulosFactura.setCliente(this);
	}

	public factura (double precioTotal){
		this.precioTotal = precioTotal;
	}

	public double getPrecioTotal(){ //get y set de atributos, PRECIO TOTAL
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal){
		this.precioTotal = precioTotal;
	}

	public String getNombreCliente(){ //NOMBRE DEL CLIENTE
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente){
		this.nombreCliente = nombreCliente;
	}

	public String getNombreVendedor(){ //NOMBRE DEL VENDEDOR
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor){
		this.nombreVendedor = nombreVendedor;
	}

	public int getIdCliente(){ // ID DEL CLIENTE
		return idCliente;
	}
	public void setIdCliente(int idCliente){
		this.idCliente = idCliente;
	}

	public int getIdVendedor(){ //ID DEL VENDEDOR
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor){
		this.idVendedor = idVendedor;
	}

	public cliente getCliente(){
		return cliente;
	}
	public void setCliente(int cliente){
		this.cliente = cliente;
	}

	public void setArticulo(articulo articulo){
		articulosFactura.add(articulo);
	}
}
