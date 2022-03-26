package gimnasAplicacio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Client {
	private String DNI;
	private String nom;
	private String cognom1;
	private String cognom2;
	private LocalDate dataNaixement;
	private String edat;
	private int telefon;
	private String condisioFisica;
	private String CCC;

	public void consultarClient() throws SQLException {
		Scanner teclat = new Scanner(System.in);

		System.out.println("--------- CONSULTA DNI ---------");
		System.out.println("Introdueix el DNI del client que vols consultar: ");

		String dni = teclat.next();

		Client cli = consultaClientBD(dni);

		if (cli != null) {
			System.out.println(cli);
		} else {
			System.out.println("No s'ha trobat el client.");
		}
	}

	private Client consultaClientBD(String dni) throws SQLException {
		Connexio conGym = new Connexio();
		Connection con = conGym();

		String consulta = "SELECT * FROM clients WHERE dni = ?";

		PreparedStatement sentencia = con.prepareStatement(consulta);

		sentencia.setString(1, dni);

		ResultSet rs = sentencia.executeQuery();

		if (rs.next()) {
			// Mapeig de client BD a client OO
			this.DNI = rs.getString("dni");
			this.cognom1 = rs.getString("Cognom1");
			this.cognom2 = rs.getString("Cognom2");

			// Ompliu la resta d'atributs de client a partir de les dades del client de BD
			this.dataNaixement = rs.getDate("dataNaixement").toLocalDate();

			return this;
		}
		return null;
	}

	private Connection conGym() {
		// TODO Auto-generated method stub
		return null;
	}

	public void altaClient() {
		Scanner teclat = new Scanner(System.in);
		// Solicitem el dni a donar d'alta fins que sigui correcte

		String dni;
		Dni dniObj = new Dni(dni, dni, dni);
		do {
			System.out.println("Introduieix el dni del client que vols donar d'alta: ");
			dni = teclat.next();
		} while (!dniObj.validarDNI());

		// Fiquem el dni en l'objecte dni
		dniObj.setDni(dni);

		// un cop validat el dni, l'assignem a l'atribut dni del objecte Client
		setDni(dniObj);

	}

	private void setDni(Dni dniObj) {
		// TODO Auto-generated method stub

	}

	public Client(String DNI, String nom, String cognom1, String cognom2, LocalDate dataNaixement, String edat,
			int telefon, String condisioFisica, String cCC) {
		super();
		this.DNI = DNI;
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.dataNaixement = dataNaixement;
		this.edat = edat;
		this.telefon = telefon;
		this.condisioFisica = condisioFisica;
		CCC = cCC;
	}

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.mm.yyyy");
	boolean dataCorrecta = false;

	do
	{
		dataCorrecta = true;
		System.out.println("Introdueix la data de naixement en format correcte (dd.mm.yyyy).");
		try {

		} catch (Exception e) {
			System.out.println("Algo ha anat malament.");
		}
	}
	while(!dniObj.validarDni(dni));

	@Override
	public String toString() {
		return "Client [DNI=" + DNI + ", nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2
				+ ", dataNaixement=" + dataNaixement + ", edat=" + edat + ", telefon=" + telefon + ", condisioFisica="
				+ condisioFisica + ", CCC=" + CCC + ", formatter=" + formatter + ", dataCorrecta=" + dataCorrecta + "]";
	}
}}
