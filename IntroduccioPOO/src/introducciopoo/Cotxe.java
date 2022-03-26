package introducciopoo;

public class Cotxe {
	
	//Son atributs d'INSTÀNCIA
	private String matricula;
	private String marcaString;
	private double preu;
	private String color;
	
	//Amb STATIC són atributs de classe
	static private double dto;
	
	public Cotxe(String matricula, String marcaString, double preu, String color) {
		super();
		this.matricula = matricula;
		this.marcaString = marcaString;
		this.preu = preu;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cotxe [matricula=" + matricula + ", marcaString=" + marcaString + ", preu=" + preu + ", color=" + color + "]";
	}
}
