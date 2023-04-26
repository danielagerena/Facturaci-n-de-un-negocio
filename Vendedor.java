import java.util.ArrayList;

public class Vendedor{
	String nombreVendedor;
	int id;

	//ArrayList <cliente> clientes = new ArrayList<cliente>();

	public Vendedor(){

	}

	public Vendedor (String nombreVendedor){ //Constructor
		this.nombreVendedor = nombreVendedor;
	}

	public Vendedor (int id){
		this.id = id;
	}

	public String getNombreVendedor(){ //get set.
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor){
		this.nombreVendedor = nombreVendedor;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	/*public void setCliente(cliente cliente){
		clientes.add(cliente);
	}*/

}