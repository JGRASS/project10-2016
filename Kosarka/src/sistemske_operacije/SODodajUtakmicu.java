package sistemske_operacije;

import java.util.List;

import klase.Statistika;
import klase.Tim;
import klase.Utakmica;

public class SODodajUtakmicu {

	public static void izvrsi(List<Tim> timovi, Tim dom, Tim gos, Statistika domStat, Statistika gosStat,
			int domBrPrimljenih, int gosBrPrimljenih) {
		for (int i = 0; i < timovi.size(); i++) {
			Tim t = timovi.get(i);
			if(dom.equals(t)){
				if(t.getUtakmice().isEmpty())
					t.getUtakmice().add(new Utakmica(0, gos.getIme(), domStat, domBrPrimljenih));
				else
					t.getUtakmice().add(new Utakmica(t.getUtakmice().size(), gos.getIme(), domStat, domBrPrimljenih));
			}
			if(gos.equals(t)){
				if(t.getUtakmice().isEmpty())
					t.getUtakmice().add(new Utakmica(0, dom.getIme(), gosStat, gosBrPrimljenih));
				else
					t.getUtakmice().add(new Utakmica(t.getUtakmice().size(), dom.getIme(), gosStat, gosBrPrimljenih));
			}
		}
		
	}

}
