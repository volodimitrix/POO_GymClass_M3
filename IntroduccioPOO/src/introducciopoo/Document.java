package introducciopoo;

public class Document {
	private String titol;
	private String cos;
	
	public Document(String titol, String cos) {
		super();
		this.titol = titol;
		this.cos = cos;
	}

	public String getTitol() {
		return titol;
	}

	public String getCos() {
		return cos;
	}
}
