package sistemske_operacije;

import java.util.List;

import klase.Tim;
/**
 * 
 * @author Luka Novakovic
 * @author Luka Orlovic
 * @author Ilija Pavlovic
 * 
 * */
public class SOPozicijaTima {
	/**Metoda koja vraca poziciju na listi timova odredjenog tima
	 * @param timovi lista timova
	 * @param t tim za koji zelimo da dobijemo povratnu informaciju o poziciji na tabeli
	 * @return pozicija tima
	 */
	public static int izvrsi(List<Tim> timovi, Tim t) {
		int pozicija = 0;
		for(int i=1;i<timovi.size();i++){
			if(t.equals(timovi.get(i))) pozicija = i;
			
		}
		return pozicija;
	}

}
