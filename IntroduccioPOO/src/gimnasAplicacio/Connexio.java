package gimnasAplicacio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexio {

	private static Connection conn = null;
	private String url;
	private String driver;
	private String usuario;
	private String password;
	
	public Connexio()  {
		this.url = "jbdc:mysql://localhost/gimnas";
		this.driver = "com.mysql.jdbc.Driver";
		this.usuario = "volo";
		this.password = "Fat/3232";
	
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, usuario, password);
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		if (conn == null) {
			new Connexio();
		}
		return conn;
	}
}