package aad.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Producto", 
       uniqueConstraints={@UniqueConstraint(columnNames={"idProducto"})})

public class Producto {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idProducto", nullable=false, unique=true, length=11)
	private long idProducto;
	@Column(name="NOMBREPRODUCTO", length=255, nullable=true)
	private String nombreProducto;
	@Column(name="PRECIO", length=255, nullable=true)
	private float precio;
	@Column(name="STOCK", length=255, nullable=true)
	private int stock;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idProducto") //Columna para el join	
	private LineasDeCompra lineaCompra;	
	
	public Producto(long idProducto, String nombreProducto, float precio, int stock) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.stock = stock;
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "IdProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio
				+ ", stock=" + stock;
	}
	
	
	
}
