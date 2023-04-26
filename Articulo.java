import java.util.ArrayList;

public class Articulo{
	int codigo;
	String nombreArticulo;
	int cantidad;
	double precio;

	// Marca marca;
	// ArrayList <factura> facturas = new ArrayList<factura>();
	public Articulo(){

	}

	public Articulo (int codigo){ //CREAR METODO CONSTRUCTOR, con atributos primitivos.
		this.codigo = codigo;
	}

	public Articulo (String nombreArticulo){
		this.nombreArticulo = nombreArticulo;
	}

	/*public Articulo (int cantidad){
		this.cantidad = cantidad;
	}*/

	public Articulo (double precio){
		this.precio = precio;
	}

	public int getCodigo(){ //Get y set de los parametros.
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	public String getNombreArticulo(){
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo){
		this.nombreArticulo = nombreArticulo;
	}

	public int getCantidad(){
		return cantidad;
	}
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}

	public double getPrecio(){
		return precio;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}

	/*public marca getMarca(){
		return marca;
	}
	public void setMarca(marca marca){
		this.marca = marca;
	}

	public void setFactura(factura factura){
		facturas.add(factura);
	}
	*/
}	
