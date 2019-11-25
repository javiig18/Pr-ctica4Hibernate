package aad.modelo;

import java.util.List;

public class ProductoJDBC implements ProductoDAO{

	private static final String CREAR_PRODUCTO = "";
	private static final String OBTENER_PRODUCTO = "";
	private static final String EDITAR_PRODUCTO = "";
	private static final String ELIMINAR_PRODUCTO = "";

	public Producto crearProducto(String nombre, float precio, int stock) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto obtenerProducto(long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto editarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean eliminarProducto(long idProducto) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Producto> obtenerProductos(int count, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Producto> obtenerProductosNombre(String nombre, int count, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Producto> obtenerProductosPorPrecio(float minPrecio, float maxPrecio, long idCategoria, int count,
			int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Producto> obtenerProductosPorNombreYPrecio(String nombre, float minPrecio, float maxPrecio,
			long idCategoria, int count, int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
