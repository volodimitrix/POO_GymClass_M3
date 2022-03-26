package introducciopoo;

public class ProvaCotxe {

	public static void main(String[] args) {
		
		//Suposem que volem aplicar un descompte del 10% a tots els cotxes
		//Si és el mateix descompte per tots els cotxes
		
		
		Cotxe c1 = new Cotxe("9679ERA" , "Audi" , 34000 , "Verd");
		Cotxe c2 = new Cotxe("3445BBC" , "BMW" , 45000 , "Negre");
		Cotxe c3 = new Cotxe("3469ETA" , "Volkswagen" , 55000 , "Vermell");
		Cotxe c4 = new Cotxe("5345OTA" , "Renault" , 25000 , "Rosa");
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
