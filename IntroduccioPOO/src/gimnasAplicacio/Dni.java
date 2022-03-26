package gimnasAplicacio;

public class Dni {
	private String dni;
	private String numero;
	private String lletra;
	
	public Dni(String dni, String numero, String lletra) {
		super();
		this.dni = dni;
		this.numero = numero;
		this.lletra = lletra;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getLletra() {
		return lletra;
	}
	public void setLletra(String lletra) {
		this.lletra = lletra;
	}
	
	public boolean validarDNI() {
		String lletraMajuscula = "";
		if(dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false ) {
			return false;
		}
		lletraMajuscula = (this.dni.substring(8)).toUpperCase();
		if(nomesNumeros() == true && lletraDNI().equals(lletraMajuscula)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean nomesNumeros() {
		int i, j = 0;
		String numero = "";
		String meuDNI = "";
		String[] uNou = {"0","1","2","3","4","5","6","7","8","9"};
		for(i = 0; i < this.dni.length() - 1; i++) {
			numero = this.dni.substring(i, i+1);
			for(j = 0; j < uNou.length; j++) {
				if(numero.equals(uNou[j])) {
					meuDNI += uNou[j];
				}
			}
		}
		if(meuDNI.length() != 8) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private String lletraDNI() {
		int meuDNI = Integer.parseInt(this.dni.substring(0,8));
		int falta = 0;
		String mevaLletra = "";
		String[] asignacioLletra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		falta = meuDNI % 23;
		mevaLletra = asignacioLletra[falta];
		return mevaLletra;
	}	
}
