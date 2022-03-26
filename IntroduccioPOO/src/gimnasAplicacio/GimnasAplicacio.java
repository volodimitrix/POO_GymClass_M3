package gimnasAplicacio;

import java.sql.Connection;

public class GimnasAplicacio {
	public static void main(String[] args) {
		Connexio conBD = new Connexio();
		Connection con = conBD();
		
		Gimnas g = new Gimnas();
		
		g.gestionarGimnas();
	}

	private static Connection conBD() {
		// TODO Auto-generated method stub
		return null;
	}
}