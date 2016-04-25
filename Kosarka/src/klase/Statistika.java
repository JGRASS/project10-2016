package klase;

public class Statistika {

	private int poeni;
	
	private int pogodjeniZaJedan;
	private int suteviZaJedan;
	
	private int pogodjeniZaDva;
	private int suteviZaDva;
	
	private int pogodjeniZaTri;
	private int suteviZaTri;
	
	private int skokovi;
	
	private int oduzeteLopte;
	private int izgubljeneLopte;
	
	private int asistencije;
	private int napravljenaBlokade;
	private int nacinjeniFaulovi;
	
	
	public int getPoeni() {
		return poeni;
	}
	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}
	public int getPogodjeniZaJedan() {
		return pogodjeniZaJedan;
	}
	public void setPogodjeniZaJedan(int pogodjeniZaJedan) {
		this.pogodjeniZaJedan = pogodjeniZaJedan;
	}
	public int getSuteviZaJedan() {
		return suteviZaJedan;
	}
	public void setSuteviZaJedan(int suteviZaJedan) {
		this.suteviZaJedan = suteviZaJedan;
	}
	public int getPogodjeniZaDva() {
		return pogodjeniZaDva;
	}
	public void setPogodjeniZaDva(int pogodjeniZaDva) {
		this.pogodjeniZaDva = pogodjeniZaDva;
	}
	public int getSuteviZaDva() {
		return suteviZaDva;
	}
	public void setSuteviZaDva(int suteviZaDva) {
		this.suteviZaDva = suteviZaDva;
	}
	public int getPogodjeniZaTri() {
		return pogodjeniZaTri;
	}
	public void setPogodjeniZaTri(int pogodjeniZaTri) {
		this.pogodjeniZaTri = pogodjeniZaTri;
	}
	public int getSuteviZaTri() {
		return suteviZaTri;
	}
	public void setSuteviZaTri(int suteviZaTri) {
		this.suteviZaTri = suteviZaTri;
	}
	public int getSkokovi() {
		return skokovi;
	}
	public void setSkokovi(int skokovi) {
		this.skokovi = skokovi;
	}
	public int getOduzeteLopte() {
		return oduzeteLopte;
	}
	public void setOduzeteLopte(int oduzeteLopte) {
		this.oduzeteLopte = oduzeteLopte;
	}
	public int getIzgubljeneLopte() {
		return izgubljeneLopte;
	}
	public void setIzgubljeneLopte(int izgubljeneLopte) {
		this.izgubljeneLopte = izgubljeneLopte;
	}
	public int getAsistencije() {
		return asistencije;
	}
	public void setAsistencije(int asistencije) {
		this.asistencije = asistencije;
	}
	public int getNapravljenaBlokade() {
		return napravljenaBlokade;
	}
	public void setNapravljenaBlokade(int napravljenaBlokade) {
		this.napravljenaBlokade = napravljenaBlokade;
	}
	public int getNacinjeniFaulovi() {
		return nacinjeniFaulovi;
	}
	public void setNacinjeniFaulovi(int nacinjeniFaulovi) {
		this.nacinjeniFaulovi = nacinjeniFaulovi;
	}
	public Statistika(int poeni, int pogodjeniZaJedan, int suteviZaJedan, int pogodjeniZaDva, int suteviZaDva,
			int pogodjeniZaTri, int suteviZaTri, int skokovi, int oduzeteLopte, int izgubljeneLopte, int asistencije,
			int napravljenaBlokade, int nacinjeniFaulovi) {
		super();
		this.poeni = poeni;
		this.pogodjeniZaJedan = pogodjeniZaJedan;
		this.suteviZaJedan = suteviZaJedan;
		this.pogodjeniZaDva = pogodjeniZaDva;
		this.suteviZaDva = suteviZaDva;
		this.pogodjeniZaTri = pogodjeniZaTri;
		this.suteviZaTri = suteviZaTri;
		this.skokovi = skokovi;
		this.oduzeteLopte = oduzeteLopte;
		this.izgubljeneLopte = izgubljeneLopte;
		this.asistencije = asistencije;
		this.napravljenaBlokade = napravljenaBlokade;
		this.nacinjeniFaulovi = nacinjeniFaulovi;
	}
	
	
}
