import java.util.ArrayList;

public class Marca{
	String nombreMarca;

	// ArrayList <articulo> articulosMarca = new ArrayList<articulo>();

	public Marca(){
	
	}

	public Marca (String nombreMarca){ //Constructor.
		this.nombreMarca = nombreMarca;
	}

	public String getNombreMarca(){ //get set.
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca){
		this.nombreMarca = nombreMarca;
	}

	/*public void setArticulo(articulo articulo){
		articulosMarca.add(articulo);
	}*/
}

