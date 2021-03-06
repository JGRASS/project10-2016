package sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import klase.Tim;
/**
 * 
 * @author Luka Novakovic
 * @author Luka Orlovic
 * @author Ilija Pavlovic
 * 
 * */
public class SOUpisiUFajl {

	/** metoda koja serijalizuje podatke iz liste timova u fajl NBATimovi.out
	 * @param timovi lista timova
	 */
	public static void izvrsi(List<Tim> timovi) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream("resources/NBAtimovi.out")));
			for (int i = 0; i < timovi.size(); i++) {
				out.writeObject(timovi.get(i));
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
