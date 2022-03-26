package introducciopoo;

public class CompteBancari {
	//Atributs 
	private String IBAN; //informa sistema
	private String alias; 
	private double saldo;
	private String moneda;
	private String tipo;
	
	//COSTRUCTORS
	//Per defecte JAVA ens proporciona el cosntructor sense par�metres
	//Si creem un costructor amb par�metres, oculta al costructor
	//SOBREC�RREGA DEL COSTRUCTOR
	//Dintre del constructor podem cridar a m�todes de la classe
	//No conv� repetir codi, en  el constructor podem cridar als sets
	
	//PECULIARITATS DELS CONSTRUCTORS:
	//1. M�todes que no retornen valors, implicitament Java retorna la refer�ncia dels objectes
	//2. S'han d'anomenar igual que la classe
	//3. Unica funci� es crear i inicialitzar els valors dels atributs 
	//4. Podem tenir tants constructors com combinacions d'atributs
	//5. Hem de definir els costructors sense ambiguetats en els par�metres, java nom�s mira tipo, numero i l'ordre dels par�metres
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
	//Els costructors m�s petits, menys par�metres poden cridar als constructors
	//Amb m�s par�metres, resolent el par�metre que no els han
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
	
	//GETTERS: obtenir, no reben par�metres, tan sols retornen
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
			System.out.println("No es pot fer un ingr�s d'una quantitat negativa.");
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
