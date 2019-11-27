package aad.modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import aad.utilidades.Utilidades;

public class ProductoJDBC implements ProductoDAO{

	private static final String OBTENER_PRODUCTO = "";
	private static final String EDITAR_PRODUCTO = "";
	private static final String ELIMINAR_PRODUCTO = "";

	public Producto crearProducto(String nombre, float precio, int stock) {
		Session session = Utilidades.getSessionFactory().openSession();
		
		Transaction tx = null;
		Producto p1 = new Producto();
		
		p1.setNombreProducto(nombre);
		p1.setPrecio(precio);
		p1.setStock(stock);
		try {

			// abrimos una transacción
			tx = session.beginTransaction();
			// Guardamos el objeto en la sesión
			session.save(p1);
			// Commit de la transacción
			session.getTransaction().commit();

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			System.out.println("Ocurrió un error" + e);
		} finally {
			session.close();
		}
		
		
		return p1;
	}

	public Producto obtenerProducto(long idProducto) {
		Session session = Utilidades.getSessionFactory().openSession();
		Producto p1 = new Producto();
		
		// abrimos una transacción
		session.beginTransaction();
		// Recuperamos el empleado
		p1 = (Producto) session.load(Producto.class, idProducto);
		// Commit de la transacción
		session.getTransaction().commit();
		
		return p1;
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
