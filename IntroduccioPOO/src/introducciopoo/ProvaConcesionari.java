package introducciopoo;

public class ProvaConcesionari {

	public static void main(String[] args) {
		Concesionari c = new Concesionari("ConsDAM");
		
		//No s'ha de treballar aix�, perqu� estem violant l'ENCAPSULAMENT del concesionari
		//Mala pr�ctica fer un get d'un atribut col�lecci�, perqu� al ser objectes estem passant la refer�ncia, l'altra pot fer el que vulgui amb aquesta col�lecci� estem trencant el principi d'encapsulament.
		
		//c.getCotxes().add((new Cotxe2("2345CCL", "vermell")));
		//c.getCotxes().add((new Cotxe2("5342AAA", "verd")));
		//c.getCotxes().add((new Cotxe2("2341BBB", "negre")));
		
		//c.getCotxes().clear();
		
		c.agregarCotxe(new Cotxe2("2345CCL", "vermell"));
		c.agregarCotxe(new Cotxe2("5342AAA", "verd"));
		c.agregarCotxe(new Cotxe2("2341BBB", "negre"));
		
		
		c.mostraCotxes();
	}
}
