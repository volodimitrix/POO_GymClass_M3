package introducciopoo;

public class ProvaMain {

	public static void main(String[] args) {
		Robot r = new Robot();
		
		//El métode toString l'heretem de la classe Object
		System.out.println(r.toString());;
		
		//El métode printLN internament crida per defecte el mètode toString del objecte
		System.out.println(r);
		
		/*
		r.setNom("Yanfri manito");
		
		Robot r2 = new Robot("Javabot bip bip bop bop");
		
		System.out.println(r);
		System.out.println(r2);
		
		System.out.println(r.getNom());
		System.out.println(r2.getNom());
		
		r2.setNom(null);
		System.out.println(r2.getNom());
		
		r.saludar("Volo");
		r2.saludar("Volo");
		
		r.saludar();
		r2.saludar();
		
		System.out.println(r2.toString());
		
		System.out.println(r2);
		*/
	}
}
