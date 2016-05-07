package sistemske_operacije;

import java.util.List;

import klase.Tim;

public class SOUkupanZa3 {

	public static int izvrsi(List<Tim> timovi, Tim t) {
		int uk = 0;
		for(int i=0;i<timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().size();i++){
			uk = uk + timovi.get(SOPozicijaTima.izvrsi(timovi,t)).getUtakmice().get(i).getStatistika().getSuteviZaTri();
			
		}
		return uk;
		
	}

}
