package introducciopoo;

public class CompteBancari {
	//Atributs 
	private String IBAN; //informa sistema
	private String alias; 
	private double saldo;
	private String moneda;
	private String tipo;
	
	//COSTRUCTORS
	//Per defecte JAVA ens proporciona el cosntructor sense paràmetres
	//Si creem un costructor amb paràmetres, oculta al costructor
	//SOBRECÀRREGA DEL COSTRUCTOR
	//Dintre del constructor podem cridar a mètodes de la classe
	//No convé repetir codi, en  el constructor podem cridar als sets
	
	//PECULIARITATS DELS CONSTRUCTORS:
	//1. Mètodes que no retornen valors, implicitament Java retorna la referència dels objectes
	//2. S'han d'anomenar igual que la classe
	//3. Unica funció es crear i inicialitzar els valors dels atributs 
	//4. Podem tenir tants constructors com combinacions d'atributs
	//5. Hem de definir els costructors sense ambiguetats en els paràmetres, java només mira tipo, numero i l'ordre dels paràmetres
	//6. Dintre d'un contructor puc cridar a un altre constructor de la classe
	public CompteBancari(String alias, String moneda, String tipo) {
		//this.alias = alias;
		//this.moneda = moneda;
		//this.tipo = tipo;
		this.IBAN = obtenirIBAN();
		setAlias(alias);
		setMoneda(moneda);
		setTipo(tipo);
	}
	
	//La idea no REPETIR CODI, per tant, crido a altres costructors de la classe
	//Els costructors més petits, menys paràmetres poden cridar als constructors
	//Amb més paràmetres, resolent el paràmetre que no els han
	//This equival al constructor de la classe
	public CompteBancari (String moneda, String tipo) {
		this("alias por defecto", moneda, tipo);
	}
	
	//Metodes de la classe
	public String obtenirIBAN() {
		return "1234567";
	}
	
	public void mostrarDades() {
		//System.out.println("this: " + this);
		System.out.println("IBAN: " + IBAN + "alias: " + alias + "saldo: " + saldo + "moneda: " + moneda + "tipo: " + tipo);
	}
	
	/*public void setAlias (String alias) {
		if (alias != null) {
			this.alias = alias;
		}
	}*/
	
	//GETTERS: obtenir, no reben paràmetres, tan sols retornen
	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getTipo() {
		return tipo;
	}

	//This es una referencia al mateix objecte
	public void setTipo(String tipo) {	
		this.tipo = tipo;
	}

	public void ingresarDiners (double quantitat) {
		if (quantitat >= 0) {
			saldo = saldo + quantitat; //saldo += quantitat
		}
		else {
			System.out.println("No es pot fer un ingrès d'una quantitat negativa.");
		}
	}
	
	boolean saldoDisponible (double quantitat) {
		return saldo >= quantitat;
	}
	
	public void extreureDiners (double quantitat) {
		if (saldoDisponible(quantitat)) {
			saldo -= quantitat;
		}
		else {
			System.out.println("No tinc suficient saldo per la quantitat");
		}
	}
}
