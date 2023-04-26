import javax.swing.*;

public class Programa{
	public static void main (String[] args){
		Articulo ar;
		ar = new Articulo();
		ar.setCodigo(5);
		System.out.println(ar.getCodigo());

		Marca ma; 
		ma = new Marca();
		ma.setNombreMarca("Pesco");
		System.out.println(ma.getNombreMarca());

		Vendedor ve;
		ve = new Vendedor();
		ve.setNombreVendedor("Carmen");
		ve.setId(111);
		System.out.println(ve.getNombreVendedor());
		System.out.println(ve.getId());

		Factura fa;
		fa = new Factura();
		fa.setPrecioTotal(1000);
		fa.setNombreCliente("Eliana");
		fa.setNombreVendedor("Clara");
		fa.setIdCliente(222);
		fa.setIdVendedor(333);
		System.out.println(fa.getPrecioTotal());
		System.out.println(fa.getNombreCliente());
		System.out.println(fa.getNombreVendedor());
		System.out.println(fa.getIdCliente());
		System.out.println(fa.getIdVendedor());

		Cliente cl;
		cl = new Cliente();
		cl.setNombreCliente("Margarita");
		cl.setNumeroId(444);
		cl.setTipoIdentificacion("CC");
		System.out.println(cl.getNombreCliente());
		System.out.println(cl.getNumeroId());
		//System.out.println(cl.getTipoIdentificacion());
	}
}