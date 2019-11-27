package aad.modelo;

import java.util.List;

public class LineasDeCompraJDBC implements LineasDeCompraDAO{

    public LineasDeCompra crearLineaDC(long idProducto, long idVenta, float precioProducto) {

        LineasDeCompra producto = new LineasDeCompra(idProducto,idVenta,precioProducto);


    }

    public LineasDeCompra editarLineaDC(LineasDeCompra linea) {
        return null;
    }

    public boolean eliminarLineaDC(long idLineaDeCompra) {
        return false;
    }

    public LineasDeCompra obtenerLineaDC(long idLineaDeCompra) {
        return null;
    }

    public List<LineasDeCompra> obtenerLineasDCdeCompra(long idCompra) {
        return null;
    }
}
