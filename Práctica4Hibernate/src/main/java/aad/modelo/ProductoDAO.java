package aad.modelo;

import java.util.List;

public interface ProductoDAO {
	public Producto crearProducto (String nombre, float precio, int stock); 
	public Producto obtenerProducto (long idProducto);
	public Producto editarProducto(Producto producto);
	public boolean eliminarProducto(long idProducto);
	public List<Producto> obtenerProductos(int count, int index);
	public List<Producto> obtenerProductosNombre (String nombre, int count, int index);
	public List<Producto> obtenerProductosPorPrecio (float minPrecio, float maxPrecio, long idCategoria, int count, int index);
	public List<Producto> obtenerProductosPorNombreYPrecio (String nombre , float minPrecio, float maxPrecio, long idCategoria, int count, int index);
}
