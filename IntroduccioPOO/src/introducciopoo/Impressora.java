package introducciopoo;

public class Impressora {
	private boolean encesa;
	
	public void encendre() {
		this.encesa = true;
	}
	
	public void imprimir(Document doc) {
		if (encesa) {
			System.out.println("Imprimiendo documento: " + doc.getTitol());
			System.out.println("--------------------------------------");
			System.out.println(doc.getCos());
			System.out.println("--------------------------------------");
		}
		else {
			System.out.println("Impressora apagada.");
		}
	}
}
