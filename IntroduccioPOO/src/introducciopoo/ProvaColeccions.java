package introducciopoo;

import java.util.ArrayList;

public class ProvaColeccions {

	public static void main(String[] args) {
		//Tenim per vendre 1000 cotxes
		
		Cotxe2 c1 = new Cotxe2("2345BBC" , "verd");
		Cotxe2 c2 = new Cotxe2("1111AAB" , "negre");
		Cotxe2 c3 = new Cotxe2("1234CCA" , "vermell");
		
		//Els arraylist guarden només objectes
		//<> diamants
		//Declaració
		ArrayList<Cotxe2> cotxes = new ArrayList<Cotxe2>();
		
		System.out.println(cotxes.isEmpty());
		
		cotxes.add(c1);
		cotxes.add(c1);
		cotxes.add(c3);
		cotxes.add(new Cotxe2("3449LMK", "gris"));
		
		c1.setColor("groc");
		
		System.out.println(cotxes);
				
		System.out.println("Cotxe amb index 2: " + cotxes.get(2));
		
		//Recorrem els elements de l'arraylist
		
		for (int i = 0; i < cotxes.size(); i++) {
			System.out.println("Posicio del cotxe: " + i + ": " + cotxes.get(i));
		}
		
		//Un atre for per recorrer col·lección desde el principi fins al final i tots elements no serveix quan no vols recorrer tots els elements, per exemple, de dos en dos, fins que trobem un element
		
		for (Cotxe2 cotxe:cotxes) { //Per cada cotxe de tipo cotxe, de la col·lecio guardada en cotxes
			System.out.println(cotxe);
		}
		
		cotxes.clear();
		
		System.out.println(cotxes);
		
		System.out.println(cotxes.size());
	}
}
