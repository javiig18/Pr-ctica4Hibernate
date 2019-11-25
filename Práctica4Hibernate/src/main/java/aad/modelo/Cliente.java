package aad.modelo;

public class Cliente {
	private long idCliente;
	private String direccion;
	private String password;
	private String nombreUsuario;
	
	public Cliente(long idCliente, String direccion, String password, String nombreUsuario) {
		this.idCliente = idCliente;
		this.direccion = direccion;
		this.password = password;
		this.nombreUsuario = nombreUsuario;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public String toString() {
		return "IdCliente=" + idCliente + ", direccion=" + direccion + ", password=" + password
				+ ", nombreUsuario=" + nombreUsuario;
	}
	
	
}
