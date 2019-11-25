package aad.modelo;

public class LineasDeCompra {
	private long idLineaCompra;
	private long idProducto;
	private long idVenta;
	private float precioProducto;
	
	public LineasDeCompra(long idLineaCompra, long idProducto, long idVenta, float precioProducto) {
		this.idLineaCompra = idLineaCompra;
		this.idProducto = idProducto;
		this.idVenta = idVenta;
		this.precioProducto = precioProducto;
	}

	public long getIdLineaCompra() {
		return idLineaCompra;
	}

	public void setIdLineaCompra(long idLineaCompra) {
		this.idLineaCompra = idLineaCompra;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}

	public float getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}

	@Override
	public String toString() {
		return "IdLineaCompra=" + idLineaCompra + ", idProducto=" + idProducto + ", idVenta=" + idVenta
				+ ", precioProducto=" + precioProducto;
	}
	
	
	
}
