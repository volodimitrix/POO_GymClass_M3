package introducciopoo;

import java.util.Scanner;

public class introduccioPOO {
	public static void main (String[] args) {
		
		Cotxe1 c = new Cotxe1();
		System.out.println(c);
		
		c.matricula = "4532XBD";
		c.color = "verd";
		c.km = 54000;
		c.AC = true;
		
		Cotxe1 c1;
		
		//System.out.println(c1);
		
		c1 = c;
		
		c.color = "negro";
		System.out.println(c1.color); //verd o negre
		
		c1.color = "azul";
		System.out.println(c.color); //verd o blau
		

		
		/*Cotxe c = new Cotxe();
		System.out.println(c);
		
		//Visualitzar l'estat de l'objecte
		System.out.println(c.matricula + " " + c.color + " " + c.km + " " + c.AC);
		
		c.matricula = "4532XBD";
		c.color = "verd";
		c.km = 54000;
		c.AC = true;
		
		System.out.println(c.matricula + " " + c.color + " " + c.km + " " + c.AC);
		
		Cotxe c1 = new Cotxe();
		System.out.println(c1);
		
		System.out.println(c1.matricula + " " + c1.color + " " + c1.km + " " + c1.AC);
		
		c1.matricula = "1234ABC";
		c1.color = "vermell";
		c1.km = 234000;
		c1.AC = false;

		System.out.println(c1.matricula + " " + c1.color + " " + c1.km + " " + c1.AC);
		
		//OBJECTES: ESTAT, COMPORTAMENT I IDENTITAT*/

	}
}
