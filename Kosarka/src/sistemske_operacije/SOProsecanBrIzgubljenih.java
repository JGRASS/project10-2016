package sistemske_operacije;

import java.util.List;

import klase.Tim;

public class SOProsecanBrIzgubljenih {

	public static double izvrsi(List<Tim> timovi, Tim t) {
		if(timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size() == 0)
			throw new RuntimeException("Tim nema nijednu unetu utakmicu.");
		
		int ukupno = 0;
		for (int i = 0; i < timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().get(i).getStatistika().getIzgubljeneLopte();
		}
		return (double)ukupno / timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size();
	}

}
