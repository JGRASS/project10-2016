package sistemske_operacije;

import java.util.List;

import klase.Tim;
import klase.Utakmica;
/**
 * 
 * @author Luka Novakovic
 * @author Luka Orlovic
 * @author Ilija Pavlovic
 * 
 * */
public class SOVratiUkupanBrPostignutih {
	/**Metoda koja vraca ukupan broj postignutih koseva za odredjeni tim
	 * @param timovi lista timova
	 * @param t tim za koji zelimo da dobijemo povratnu informaciju o kosevima
	 * @return ukupan broj koseva
	 */
	public static int izvrsi(List<Tim> timovi, Tim t) {
		int brojPostignutih = 0;
		for (int i = 0; i < timovi.size(); i++) {
			if(timovi.get(i).equals(t)){
				for (int j = 0; j < timovi.get(i).getUtakmice().size(); j++) {
					Utakmica u = timovi.get(i).getUtakmice().get(j);
					brojPostignutih += u.getStatistika().getPoeni();
				}
			}
		}
		return brojPostignutih;
	}

}
