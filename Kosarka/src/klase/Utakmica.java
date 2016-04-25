package klase;

public class Utakmica {

	private int ID;
	
	private Tim domaci;
	private Tim gosti;

	private Statistika StatistikaDomaci;
	private Statistika StatistikaGosti;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Tim getDomaci() {
		return domaci;
	}
	public void setDomaci(Tim domaci) {
		this.domaci = domaci;
	}
	public Tim getGosti() {
		return gosti;
	}
	public void setGosti(Tim gosti) {
		this.gosti = gosti;
	}
	public Statistika getStatistikaDomaci() {
		return StatistikaDomaci;
	}
	public void setStatistikaDomaci(Statistika statistikaDomaci) {
		StatistikaDomaci = statistikaDomaci;
	}
	public Statistika getStatistikaGosti() {
		return StatistikaGosti;
	}
	public void setStatistikaGosti(Statistika statistikaGosti) {
		StatistikaGosti = statistikaGosti;
	}
	public Utakmica(int iD, Tim domaci, Tim gosti, Statistika statistikaDomaci, Statistika statistikaGosti) {
		super();
		ID = iD;
		this.domaci = domaci;
		this.gosti = gosti;
		StatistikaDomaci = statistikaDomaci;
		StatistikaGosti = statistikaGosti;
	}
	
	
}
