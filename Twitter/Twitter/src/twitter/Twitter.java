package twitter;

import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;

/**
 * Klasa Twitter koja ima listu poruka i metode koje manipulisu tim porukama.
 * @author Luka
 *
 */
public class Twitter {

	/**
	 * Lista svih poruka i korisnika.
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();

	/**
	 * Metoda vraca sve poruke iz liste.
	 * @return poruke
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke() {
		return poruke;
	}

	/**
	 * Metoda unosi novog korisnika i njegovu poruku na kraj liste.
	 * @throws RuntimeException
	 * @param korisnik
	 * @param poruka
	 */
	public void unesi(String korisnik, String poruka) {
		
		if(korisnik.isEmpty() || korisnik == null || poruka.length() > 140 || poruka == null)
			throw new RuntimeException("Nesto nije u redu");
		
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);

		poruke.addLast(tp);
	}

	/**
	 * Metoda pronalazi barem jednu (ako postoji) poruku u kojoj se nalazi uneti tag i vraca je/ih u obliku niza.
	 * @throws RuntimeException
	 * @param maxBroj
	 * @param tag
	 * @return Niz poruka koje sadrze uneti tag.
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		
		
		if (tag == null || tag == "")
			throw new RuntimeException("Morate uneti tag");

		
		if (maxBroj <= 0) maxBroj = 100;

		int brojac = 0;

		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];

		for (int i = 0; i < poruke.size(); i++){
			if (poruke.get(i).getPoruka().indexOf(tag) != -1);
			
			if (brojac < maxBroj) {
				rezultat[brojac] = poruke.get(i);
				brojac++;
			} else	break;
			
		}
		return rezultat;
	}
}
