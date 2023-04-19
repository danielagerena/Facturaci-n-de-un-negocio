import java.util.ArrayList;

public class articulo{
	Int codigo;
	String nombreArticulo;
	Int cantidad;
	double precio;

	marca marca;
	ArrayList <factura> facturas = new ArrayList<factura>();

	public articulo (int codigo){ //CREAR METODO CONSTRUCTOR, con atributos primitivos.
		this.codigo = codigo;
	}

	public articulo (String nombreArticulo){
		this.nombreArticulo = nombreArticulo;
	}

	public articulo (int cantidad){
		this.cantidad = cantidad;
	}

	public articulo (double precio){
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

	public marca getMarca(){
		return marca;
	}
	public void setMarca(marca marca){
		this.marca = marca;
	}

	public void setFactura(factura factura){
		facturas.add(factura);
	}

}	
