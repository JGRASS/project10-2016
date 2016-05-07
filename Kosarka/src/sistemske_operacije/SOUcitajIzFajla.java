package sistemske_operacije;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import klase.Tim;

public class SOUcitajIzFajla {

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
