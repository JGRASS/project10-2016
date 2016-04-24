package klase;

import java.util.LinkedList;

public class Tim {

	private String Ime;
	private String ImeHale;
	
	private LinkedList<Utakmica> utakmice = new LinkedList<Utakmica>();
	
	public String getIme() {
		return Ime;
	}
	public void setIme(String ime) {
		Ime = ime;
	}
	public String getImeHale() {
		return ImeHale;
	}
	public void setImeHale(String imeHale) {
		ImeHale = imeHale;
	}
	public LinkedList<Utakmica> getUtakmice() {
		return utakmice;
	}
	public void setUtakmice(LinkedList<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}
	
	
	
}
