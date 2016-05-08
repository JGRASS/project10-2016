package klase;

import java.io.Serializable;

/**
 * Klasa svih pojedinacnih utakmica koje se odigraju u NBA ligi.
 * 
 * @author Luka Novakovic
 * @author Luka Orlovic
 * @author Ilija Pavlovic
 *
 */
public class Utakmica implements Serializable{

	private int ID;
	private String protivnik;
	private Statistika statistika;
	private int brojPrimljenihPoena;

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

	public int getBrojPrimljenihPoena() {
		return brojPrimljenihPoena;
	}

	public void setBrojPrimljenihPoena(int brojPrimljenihPoena) {
		this.brojPrimljenihPoena = brojPrimljenihPoena;
	}

	public Utakmica(int iD, String protivnik, Statistika statistika, int brPrimljenih) {
		super();
		ID = iD;
		this.protivnik = protivnik;
		this.statistika = statistika;
		this.brojPrimljenihPoena = brPrimljenih;
	}

	@Override
	public String toString() {
		return "Utakmica [ID=" + ID + ", protivnik=" + protivnik + ", statistika=" + statistika + "]";
	}
	
	
}
