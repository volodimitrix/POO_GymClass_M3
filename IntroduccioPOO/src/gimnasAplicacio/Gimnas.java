package gimnasAplicacio;

import java.util.InputMismatchException;
import java.util.Scanner;

import introducciopoo.ProvaConcesionari;

public class Gimnas {
	private String nom;
	private String CIF;
	private String telefon;

	public void gestionarGimnas() {
		Scanner teclat = new Scanner(System.in);
		
		boolean sortir = false;
		
		int opcio = 0;
		
		while (!sortir) {
			System.out.println("-------- MENÚ GIMNÁS -------");
			System.out.println("1. Gestio Client");
			System.out.println("2. Visualitzar activitats amb reserves del dia");
			System.out.println("3. Visualitzar històric d'activitats més reservades");
			System.out.println("4. Sortir");
			
			try {
				opcio = teclat.nextInt();
				switch (opcio) {
				case 1:
                    System.out.println("Has triat l'opció 1: Gestio Client");
                    break;
                    
				case 2:
                    System.out.println("Has triat l'opció 2: Visualitzar activitats amb reserves del dia");
                    break;
                
				case 3:
                    System.out.println("Has triat l'opció 3: Visualitzar històric d'activitats més reservades");
                    break;
				
				case 4:
					System.out.println("Has triat l'opció 3: Sortir.");
					sortir = true;
                    break;
                    
				default:
                    System.out.println("Opció incorrecta.");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Has d'introduïr un número com a opció");
                teclat.next();
			}
		}
	}

	private void altaClient() {

	}
}