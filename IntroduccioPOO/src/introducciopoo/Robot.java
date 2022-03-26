package introducciopoo;

public class Robot {
	private String nom;
	private double alçada;
	private double pes;
	private String funcio;
	
	public Robot(String nom, double alçada, double pes, String funcio) {
		super();
		this.nom = nom;
		this.alçada = alçada;
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
	
	//SOBRECÀRREGA DE MÈTODES
	//Podem sobrecerregar un mètode les vegades que necessitem sempre amb signatures o capçalera de mètodes diferents
	public void saludar (String nomPersona) { //Signatura o capçalera del mètode
		System.out.println("Hola " + nomPersona + ", soc " + this.nom);
	}
	
	public void saludar () {
		//EXEMPLE DE INVOCAR A UNA ALTRA SOBRECÀRREGA DEL MÈTODE
		//System.out.println("Hola desconegut, soc " + this.nom);
		saludar("desconegut");
	}
	
	//Sobreescrivim el métode toString per a que imprimeixi el valor dels atributs de l'objecte -> L'ESTAT DE L'OBJECTE
	//Per sobreescriure un métode:
	//Cal mantenir exactament l'asignatura del métode
	
	/*
	@Override
	public String toString() {
		return "Nom: " + nom + " Alçada: " + alçada + " Pes: " + pes + " Funcio: " + funcio;
	}
	*/
	
	@Override
	public String toString() {
		return "Robot [nom=" + nom + ", alçada=" + alçada + ", pes=" + pes + ", funcio=" + funcio + "]";
	}
	
	
	
	
}
