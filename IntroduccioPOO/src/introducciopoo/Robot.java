package introducciopoo;

public class Robot {
	private String nom;
	private double al�ada;
	private double pes;
	private String funcio;
	
	public Robot(String nom, double al�ada, double pes, String funcio) {
		super();
		this.nom = nom;
		this.al�ada = al�ada;
		this.pes = pes;
		this.funcio = funcio;
	}

	public Robot() {
		
	}
	
	public Robot (String nom) {
		setNom(nom);
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom (String nom) {
		if (nom != null) {
			this.nom = nom;
		}
	}
	
	//SOBREC�RREGA DE M�TODES
	//Podem sobrecerregar un m�tode les vegades que necessitem sempre amb signatures o cap�alera de m�todes diferents
	public void saludar (String nomPersona) { //Signatura o cap�alera del m�tode
		System.out.println("Hola " + nomPersona + ", soc " + this.nom);
	}
	
	public void saludar () {
		//EXEMPLE DE INVOCAR A UNA ALTRA SOBREC�RREGA DEL M�TODE
		//System.out.println("Hola desconegut, soc " + this.nom);
		saludar("desconegut");
	}
	
	//Sobreescrivim el m�tode toString per a que imprimeixi el valor dels atributs de l'objecte -> L'ESTAT DE L'OBJECTE
	//Per sobreescriure un m�tode:
	//Cal mantenir exactament l'asignatura del m�tode
	
	/*
	@Override
	public String toString() {
		return "Nom: " + nom + " Al�ada: " + al�ada + " Pes: " + pes + " Funcio: " + funcio;
	}
	*/
	
	@Override
	public String toString() {
		return "Robot [nom=" + nom + ", al�ada=" + al�ada + ", pes=" + pes + ", funcio=" + funcio + "]";
	}
	
	
	
	
}
