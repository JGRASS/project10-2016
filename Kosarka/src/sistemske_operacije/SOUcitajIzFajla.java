package sistemske_operacije;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import klase.Tim;
/**
 * 
 * @author Luka Novakovic
 * @author Luka Orlovic
 * @author Ilija Pavlovic
 * 
 * */
public class SOUcitajIzFajla {

	/**Metoda koja deserijalizuje podatke iz fajla i ubacuje ih u listu
	 * @param timovi lista timova
	 */
	public static void izvrsi(List<Tim> timovi) {
		timovi.clear();
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("resources/NBAtimovi.out"));
			while(true){
				Tim t = (Tim) in.readObject();
				timovi.add(t);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
