package com.twitter.poruke;
/**
 * <h1>Twitter poruka</h1>
 * 
 * Ova metoda se bavi korisniom i njegovom porukom.
 * 
 * @author Luka
 *
 */
public class TwitterPoruka {

	/**
	 * Atribut korisnik predstavlja ime i/ili prezime korisnika.
	 */
	private String korisnik;
	/**
	 * Atribut poruka predstavlja poruka koju je korisnik napisao.
	 */
	private String poruka; 

	/**
	 * 
	 * @return Ime (i prezime) korisnika.
	 */
	public String getKorisnik() { 
		return korisnik; 
	} 
	/**
	 * Ova metoda postavlja ime korisnika na vrednost zadatog parametra.
	 * @param korisnik
	 */
	public void setKorisnik(String korisnik) { 
		if (korisnik == null || korisnik == "") 
			throw new RuntimeException("Ime korisnika mora biti uneto"); 
		this.korisnik = korisnik; 
	} 

	/**
	 * 
	 * @return Ispisanu poruku.
	 */
	public String getPoruka() { 
		return poruka; 
	} 

	/**
	 * Ova metoda daje atributu 'poruka' vrednost zadatog parametra.
	 * @param poruka
	 */
	public void setPoruka(String poruka) { 
		if (poruka == null || poruka.length()>140) 
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka; 
	} 

	/**
	 * @return Ime (i prezime) korisnika i njegovu poruku.
	 */
	public String toString(){ 
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka; 
	}

}
