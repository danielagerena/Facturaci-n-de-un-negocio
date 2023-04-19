import java.util.ArrayList;

public class vendedor{
	String nombreVendedor;
	int id;

	ArrayList <cliente> clientes = new ArrayList<cliente>();

	public vendedor (String nombreVendedor){ //Constructor
		this.nombreVendedor = nombreVendedor;
	}

	public vendedor (int id){
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

	public void setCliente(cliente cliente){
		clientes.add(cliente);

}