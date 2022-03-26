package introducciopoo;

public class Banc {
	public static void main (String[] args) {
		CompteBancari cb1 = new CompteBancari();
		
		//System.out.println("cb1: " + cb1);
		cb1.mostrarDades();
		
		CompteBancari cb2 = new CompteBancari("alias2","moneda","cuenta");
		CompteBancari cb3 = new CompteBancari("ES76 4055 4543 3454");
		
		cb2.mostrarDades();
		
		System.out.println();
		
		//Els atributs son visibles
		//Per afegir dades inconsistents
		//cb1.IBAN = "Hola que tal";
		//cb1.alias = "pepito1";
		//cb1.saldo = -300;
		//cb1.moneda = "esta be";
		//cb1.tipo = "perfecte";
		
		
		
	//	System.out.println("Saldo disponible de 300: " + cb1.saldoDisponible());
		
		cb1.setAlias("Rosendo");
		cb1.setAlias("Rosendo");
		
	//	System.out.println("Hola: " + cb1.getAlias);
		
	//	cb1.ingresarDiners
	}

}
