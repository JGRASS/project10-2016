package sistemske_operacije;

import java.util.List;

import klase.Tim;

public class SOPozicijaTima {

	public static int izvrsi(List<Tim> timovi, Tim t) {
		int pozicija = 0;
		for(int i=1;i<timovi.size();i++){
			if(t.equals(timovi.get(i))) pozicija = i;
			
		}
		return pozicija;
	}

}
