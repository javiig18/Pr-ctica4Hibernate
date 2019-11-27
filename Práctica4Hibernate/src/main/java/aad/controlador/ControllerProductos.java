package aad.controlador;

import aad.modelo.Producto;
import aad.modelo.ProductoDAO;
import aad.modelo.ProductoJDBC;

public class ControllerProductos {
ProductoDAO productoController = new ProductoJDBC();


public Producto crearProducto(String nombre,float precio,int stock) {
	
	return productoController.crearProducto(nombre, precio, stock);
}

}
