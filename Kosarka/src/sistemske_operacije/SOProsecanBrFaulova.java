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
public class SOProsecanBrFaulova {
	/**Metoda koja vraca broj prosecan broj faulova
	 * @param timovi lista timova
	 * @param t tim za koji zelimo da dobijemo povratnu informaciju o faulovama 
	 * @return prosecan broj faulova
	 */
	public static double izvrsi(List<Tim> timovi, Tim t) {
		if(timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size() == 0)
			throw new RuntimeException("Tim nema nijednu unetu utakmicu.");
		
		int ukupno = 0;
		for (int i = 0; i < timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().get(i).getStatistika().getNacinjeniFaulovi();
		}
		return (double)ukupno / timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size();
	}

}
