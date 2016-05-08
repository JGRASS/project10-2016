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
public class SOVratiUkupanBrPrimljenih {
	/**Metoda koja vraca ukupan broj primljenih koseva tima
	 * @param timovi lista timova
	 * @param t tim za koji zelimo da dobijemo povratnu informaciju o kosevima
	 * @return ukupan broj koseva
	 */
	public static int izvrsi(List<Tim> timovi, Tim t) {
		int brojPrimljenih = 0;
		for (int i = 0; i < timovi.size(); i++) {
			if(timovi.get(i).equals(t)){
				for (int j = 0; j < timovi.get(i).getUtakmice().size(); j++) {
					Utakmica u = timovi.get(i).getUtakmice().get(j);
					brojPrimljenih += u.getBrojPrimljenihPoena();
				}
			}
		}
		return brojPrimljenih;
	}

}
