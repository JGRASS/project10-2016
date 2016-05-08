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
public class SOPogodjenZa2 {
	/**Metoda koja vraca broj pogodjenih koseva za2
	 * @param timovi lista timova
	 * @param t tim za koji zelimo da dobijemo povratnu informaciju o kosevima
	 * @return broj koseva
	 */
	public static int izvrsi(List<Tim> timovi, Tim t) {
		int uk = 0;
		for(int i=0;i<timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size();i++){
			uk = uk + timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().get(i).getStatistika().getPogodjeniZaDva();
			
		}
		return uk;
		
	}

}
