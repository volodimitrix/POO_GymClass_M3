package gimnasAplicacio;

import java.math.BigInteger;

public class CompteBancari {
	private String IBAN;
	private String alias; 
	private double saldo;
	private String moneda;
	private String tipo;
	
	public CompteBancari(String iBAN, String alias, double saldo, String moneda, String tipo) {
		super();
		IBAN = iBAN;
		this.alias = alias;
		this.saldo = saldo;
		this.moneda = moneda;
		this.tipo = tipo;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public static boolean validarIBAN(String cuenta) {
		boolean esValid = false;
		int i = 2;
		int caracterASCII = 0; 
		int falta = 0;
		int dc = 0;
		String cadenaDc = "";
		BigInteger numeroQuenta = new BigInteger("0"); 
		BigInteger modo = new BigInteger("97");
		if(cuenta.length() == 24 && cuenta.substring(0,1).toUpperCase().equals("E") && cuenta.substring(1,2).toUpperCase().equals("S")) {
			do {
				caracterASCII = cuenta.codePointAt(i);
				esValid = (caracterASCII > 47 && caracterASCII < 58);
				i++;
			}
			while(i < cuenta.length() && esValid); 
			if(esValid) {
				numeroQuenta = new BigInteger(cuenta.substring(4,24) + "142800");
				falta = numeroQuenta.mod(modo).intValue();
				dc = 98 - falta;
				cadenaDc = String.valueOf(dc);
			}	
			if(dc < 10) {
				cadenaDc = "0" + cadenaDc;
			} 
			if(cuenta.substring(2,4).equals(cadenaDc)) {
				esValid = true;
			} else {
				esValid = false;
			}
		}

		return esValid;
	}
}
