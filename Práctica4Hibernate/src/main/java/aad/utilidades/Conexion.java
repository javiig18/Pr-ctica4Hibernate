package aad.utilidades;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {
private static String name="org.sqlite.JBDC";
 

public Connection getConnection() {
	Connection con=null;
	try {
		Class.forName(name);
		DriverManager.registerDriver(new org.sqlite.JDBC());
	    con= (Connection) DriverManager.getConnection("jbdc:sqlite:BD\\base.bd");
	    
	
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return con;}

public void closeConnection(Connection con) {
	if (con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//cerrada la conexion
			//jooo
		}
	}
}
}
