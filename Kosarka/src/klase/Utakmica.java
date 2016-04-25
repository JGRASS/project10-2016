package klase;

import java.io.Serializable;

public class Utakmica implements Serializable{

	private int ID;
	private String protivnik;
	private Statistika statistika;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getProtivnik() {
		return protivnik;
	}

	public void setProtivnik(String protivnik) {
		this.protivnik = protivnik;
	}

	public Statistika getStatistika() {
		return statistika;
	}

	public void setStatistika(Statistika statistika) {
		this.statistika = statistika;
	}

	public Utakmica(int iD, String protivnik, Statistika statistika) {
		super();
		ID = iD;
		this.protivnik = protivnik;
		this.statistika = statistika;
	}

	@Override
	public String toString() {
		return "Utakmica [ID=" + ID + ", protivnik=" + protivnik + ", statistika=" + statistika + "]";
	}
	
	
}
