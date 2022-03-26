package introducciopoo;

public class ProvaImpressora {

	public static void main(String[] args) {
		Document cos = new Document("El Quijote" , "En un lugar de la Mancha\n de cuyo nombre no puedo acordarme...");
		
		Impressora imp = new Impressora();
		
		imp.encendre();
		
		imp.imprimir(cos);
	}
}