package introducciopoo;

public class Cotxe2 {
	private String matricula;
	private String color;
	
	public Cotxe2(String matricula, String color) {
		super();
		this.matricula = matricula;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cotxe2 [matricula=" + matricula + ", color=" + color + "]";
	}
	
	public void setColor(String color) {
		this.color = color;
	}	
}
