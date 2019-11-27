package aad.modelo;

import java.util.List;

public interface LineasDeCompraDAO {
	public LineasDeCompra crearLineaDC(long idProducto, long idVenta, float precioProducto);
	public LineasDeCompra editarLineaDC(LineasDeCompra linea);
	public boolean eliminarLineaDC(long idLineaDeCompra);
	public LineasDeCompra obtenerLineaDC(long idLineaDeCompra);
	public List<LineasDeCompra> obtenerLineasDCdeCompra(long idCompra);
	
}
