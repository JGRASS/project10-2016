package klase;

import java.io.Serializable;
import java.util.LinkedList;

public class Tim implements Serializable{

	private String Ime;
	private String ImeHale;
	
	private LinkedList<Utakmica> utakmice = new LinkedList<Utakmica>();
	
	
	public Tim(String ime, String imeHale, LinkedList<Utakmica> utakmice) {
		super();
		Ime = ime;
		ImeHale = imeHale;
		this.utakmice = utakmice;
	}
	
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

	@Override
	public String toString() {
		return Ime;
	}

	@Override
	public boolean equals(Object obj) {
		Tim t = (Tim) obj;
		if(this.Ime.equals(t.Ime))
			return true;
		else
			return false;
	}
	
	
	
}
