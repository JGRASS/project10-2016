package klase;

import java.util.ArrayList;
import java.util.List;

import sistemske_operacije.SODodajUtakmicu;
import sistemske_operacije.SOPogodjenZa1;
import sistemske_operacije.SOPogodjenZa2;
import sistemske_operacije.SOPogodjenZa3;
import sistemske_operacije.SOPozicijaTima;
import sistemske_operacije.SOProsecanBrAsistencija;
import sistemske_operacije.SOProsecanBrBlokada;
import sistemske_operacije.SOProsecanBrFaulova;
import sistemske_operacije.SOProsecanBrIzgubljenih;
import sistemske_operacije.SOProsecanBrOduzetih;
import sistemske_operacije.SOProsecanBrSkokova;
import sistemske_operacije.SOUcitajIzFajla;
import sistemske_operacije.SOUkupanZa1;
import sistemske_operacije.SOUkupanZa2;
import sistemske_operacije.SOUkupanZa3;
import sistemske_operacije.SOUpisiUFajl;
import sistemske_operacije.SOVratiUkupanBrPostignutih;
import sistemske_operacije.SOVratiUkupanBrPrimljenih;

/**
 * Liga timova NBA lige i njene funkcije.
 * 
 * @author Luka Novakovic
 * @author Luka Orlovic
 * @author Ilija Pavlovic
 *
 */
public class Liga{
	
	private List<Tim> timovi = new ArrayList<>();
	
	public List<Tim> getTimovi() {
		return timovi;
	}

	public void setTimovi(List<Tim> timovi) {
		this.timovi = timovi;
	}

	public void upisiUFajl(){
		SOUpisiUFajl.izvrsi(timovi);
	}
	
	public void ucitajIzFajlaUListu(){
		SOUcitajIzFajla.izvrsi(timovi);
	}
	
	public int vratiUkupanBrPostigunih(Tim t){
		return SOVratiUkupanBrPostignutih.izvrsi(timovi,t);
	}
	
	public int vratiUkupanBrPrimljenih(Tim t){
		return SOVratiUkupanBrPrimljenih.izvrsi(timovi,t);
	}

	public int pozicijaTima(Tim t){
		return SOPozicijaTima.izvrsi(timovi,t);
	}
	public int ukupanZa1(Tim t){
		return SOUkupanZa1.izvrsi(timovi,t);
	}
	public int pogodjenZa1(Tim t){
		return SOPogodjenZa1.izvrsi(timovi,t);
	}
	public int ukupanZa2(Tim t){
		return SOUkupanZa2.izvrsi(timovi,t);
		
	}
	public int pogodjenZa2(Tim t){
		return SOPogodjenZa2.izvrsi(timovi,t);
		
	}
	public int ukupanZa3(Tim t){
		return SOUkupanZa3.izvrsi(timovi,t);
		
	}
	public int pogodjenZa3(Tim t){
		return SOPogodjenZa3.izvrsi(timovi,t);
		
	}
	public double prosecanBrSkokova(Tim t){
		return SOProsecanBrSkokova.izvrsi(timovi,t);
		
	}
	
	public double prosecanBrAsistencija(Tim t){
		return SOProsecanBrAsistencija.izvrsi(timovi,t);
		
	}
	
	public double prosecanBrIzgubljenih(Tim t){
		return SOProsecanBrIzgubljenih.izvrsi(timovi,t);
		
	}
	
	public double prosecanBrOduzetih(Tim t){
		return SOProsecanBrOduzetih.izvrsi(timovi,t);
		
	}
	
	public double prosecanBrBlokada(Tim t){
		return SOProsecanBrBlokada.izvrsi(timovi,t);
		
	}
	
	public double prosecanBrFaulova(Tim t){
		return SOProsecanBrFaulova.izvrsi(timovi,t);
		
	}

	public void dodajUtakmicu(Tim dom, Tim gos, Statistika domStat, Statistika gosStat, int domBrPrimljenih,
			int gosBrPrimljenih) {
		SODodajUtakmicu.izvrsi(timovi,dom,gos,domStat,gosStat,domBrPrimljenih,gosBrPrimljenih);
	}
}
