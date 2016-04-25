package gui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import klase.Tim;

public class GUIKontroler{
	
	private static List<Tim> timovi = new ArrayList<>();
	
	public static List<Tim> getTimovi() {
		return timovi;
	}

	public static void setTimovi(List<Tim> timovi) {
		GUIKontroler.timovi = timovi;
	}
	
	public static void ucitajUListu(){
		if(timovi.isEmpty()){
			Tim Oklahoma = new Tim("Oklahoma City Thunder", "Chesapeake Energy Arena", new LinkedList<>());
			Tim Portland = new Tim("Portland Trail Blazers", "Moda Center", new LinkedList<>());
			Tim Utah = new Tim("Utah Jazz", "	Vivint Smart Home Arena", new LinkedList<>());
			Tim Denver = new Tim("Denver Nuggets", "Pepsi Center", new LinkedList<>());
			Tim Minnesota = new Tim("Minnesota Timberwolves", "Target Center", new LinkedList<>());
			Tim GoldenState = new Tim("Golden State Warriors", "Oracle Arena", new LinkedList<>());
			Tim LAClippers = new Tim("Los Angeles Clippers ", "Staples Center", new LinkedList<>());
			Tim Sacramento = new Tim("Sacramento Kings", "Golden 1 Center", new LinkedList<>());
			Tim Phoenix = new Tim("Phoenix Suns", "Talking Stick Resort Arena", new LinkedList<>());
			Tim LALakers = new Tim("Los Angeles Lakers", "Staples Center", new LinkedList<>());
			Tim SanAntonio = new Tim("San Antonio Spurs", "AT&T Center", new LinkedList<>());
			Tim Dallas = new Tim("Dallas Mavericks", "American Airlines Center", new LinkedList<>());
			Tim Memphis = new Tim("Memphis Grizzlies", "FedExForum", new LinkedList<>());
			Tim Houston = new Tim("Houston Rockets", "Toyota Center", new LinkedList<>());
			Tim NewOrleans = new Tim("New Orleans Pelicans", "Smoothie King Center", new LinkedList<>());
			Tim Chicago = new Tim("Chicago Bulls","United centre",new LinkedList<>());
			Tim Atlanta = new Tim("Atlanta Hawks","Philips arena",new LinkedList<>());
			Tim Miami = new Tim("Miami Heat","American Airlines arena",new LinkedList<>());
			Tim Cleveland = new Tim("Cleveland Cavaliers","Quicken Loans arena",new LinkedList<>());
			Tim Indiana = new Tim("Indiana Pacers","Bankers life fieldhouse",new LinkedList<>());
			Tim Toronto = new Tim("Toronto Raptors","Air Canada centre",new LinkedList<>());
			Tim Boston = new Tim("Boston Celtics","TD Garden",new LinkedList<>());
			Tim Charlotte = new Tim("Charlotte Hornets","Time Warner Cable Arena",new LinkedList<>());
			Tim Washington = new Tim("Washington Wizards","Verizon center",new LinkedList<>());
			Tim NewYork = new Tim("New York","Madison Square garden",new LinkedList<>());
			Tim Brookyln = new Tim("Brooklyn Nets","Barclays Center",new LinkedList<>());
			Tim Orlando = new Tim("Orlando Magic","Amway center", new LinkedList<>());
			Tim Milwaukee = new Tim("Milwaukee bucks", "BMO Harris Bradley Center", new LinkedList<>());
			Tim Philadelphia= new Tim("Philadelphia 76ers"," Wells Fargo Center", new LinkedList<>());
			timovi.add(Philadelphia);
			timovi.add(Milwaukee);
			timovi.add(Orlando);
			timovi.add(Brookyln);
			timovi.add(NewYork);
			timovi.add(Washington);
			timovi.add(Charlotte);
			timovi.add(Boston);
			timovi.add(Toronto);
			timovi.add(Indiana);
			timovi.add(Cleveland);
			timovi.add(Miami);
			timovi.add(Atlanta);
			timovi.add(Chicago);
			timovi.add(NewOrleans);
			timovi.add(Houston);
			timovi.add(Memphis);
			timovi.add(Dallas);
			timovi.add(SanAntonio);
			timovi.add(LALakers);
			timovi.add(Phoenix);
			timovi.add(Sacramento);
			timovi.add(LAClippers);
			timovi.add(GoldenState);
			timovi.add(Minnesota);
			timovi.add(Denver);
			timovi.add(Utah);
			timovi.add(Portland);
			timovi.add(Oklahoma);
		}
	}

	public static void serializeElementPoElement(){
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("NBAtimovi.out")));
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
	
	public static void deserializeElement(){
		timovi.clear();
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("NBAtimovi.out"));
			while(true){
				Tim t = (Tim) in.readObject();
				timovi.add(t);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
