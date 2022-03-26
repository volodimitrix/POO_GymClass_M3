package introducciopoo;

import java.util.ArrayList;

public class Concesionari {

		private String nom;
		private ArrayList<ProvaConcesionari> cotxes; //Java l'inicialitza per defecte amb null
		//Si fem servir aquest arraylist sense inicialitzar en llançarà l'excepcio´NULLPOINTEREXCEPTION
		
		//En el constructor es el lloc per inicialitzar els atributs
		
		public Concesionari(String nom) {
			this.nom = nom;
			this.cotxes = new ArrayList<>();
		}

		public void mostraCotxes() {
			if (cotxes.isEmpty()) {
				System.out.println("No hi ha cotxes per vendre.");
			}
			else {
				/*for (int i = 0; i < cotxes.size(); i++) {
					System.out.println(cotxes.get(i));
				}*/
				for (ProvaConcesionari cotxe : cotxes) {
					System.out.println(cotxe);
				}
			}
		}
		
		public void agregarCotxe(ProvaConcesionari c) {
			this.cotxes.add(c);
		}
		
		//No donem la referència de la nostra col·leccio de cotxes a cap classe externa perque ens la pot esborrar, afegir elements inconsistents, o el que vulgui
		/*
		public ArrayList<Cotxe2> getCotxes() {
			return cotxes;
		}
		*/
}
