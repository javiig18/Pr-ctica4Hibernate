package aad.controlador;


import aad.modelo.ProductoDAO;

public class ControllerProductos {
ProductoDAO productoController = new ProductoJDBC();


public Producto crearProducto(String nombre,float precio,int stock) {
	
	return productoController.crearProducto(nombre, precio, stock);
}

}
