package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import klase.Tim;

public class GUIKontroler {
	
	private static List<Tim> timovi = new ArrayList<>();
	
	public static List<Tim> getTimovi() {
		return timovi;
	}

	public static void setTimovi(List<Tim> timovi) {
		GUIKontroler.timovi = timovi;
	}
	
	public static void ucitajUListu(){
		Tim Oklahoma = new Tim("Oklahoma City Thunder", "Chesapeake Energy Arena", null);
		Tim Portland = new Tim("Portland Trail Blazers", "Moda Center", null);
		Tim Utah = new Tim("Utah Jazz", "	Vivint Smart Home Arena", null);
		Tim Denver = new Tim("Denver Nuggets", "Pepsi Center", null);
		Tim Minnesota = new Tim("Minnesota Timberwolves", "Target Center", null);
		Tim GoldenState = new Tim("Golden State Warriors", "Oracle Arena", null);
		Tim LAClippers = new Tim("Los Angeles Clippers ", "Staples Center", null);
		Tim Sacramento = new Tim("Sacramento Kings", "Golden 1 Center", null);
		Tim Phoenix = new Tim("Phoenix Suns", "Talking Stick Resort Arena", null);
		Tim LALakers = new Tim("Los Angeles Lakers", "Staples Center", null);
		Tim SanAntonio = new Tim("San Antonio Spurs", "AT&T Center", null);
		Tim Dallas = new Tim("Dallas Mavericks", "American Airlines Center", null);
		Tim Memphis = new Tim("Memphis Grizzlies", "FedExForum", null);
		Tim Houston = new Tim("Houston Rockets", "Toyota Center", null);
		Tim NewOrleans = new Tim("New Orleans Pelicans", "Smoothie King Center", null);
		Tim Chicago = new Tim("Chicago Bulls","United centre",null);
		Tim Atlanta = new Tim("Atlanta Hawks","Philips arena",null);
		Tim Miami = new Tim("Miami Heat","American Airlines arena",null);
		Tim Cleveland = new Tim("Cleveland Cavaliers","Quicken Loans arena",null);
		Tim Indiana = new Tim("Indiana Pacers","Bankers life fieldhouse",null);
		Tim Toronto = new Tim("Toronto Raptors","Air Canada centre",null);
		Tim Boston = new Tim("Boston Celtics","TD Garden",null);
		Tim Charlotte = new Tim("Charlotte Hornets","Time Warner Cable Arena",null);
		Tim Washington = new Tim("Washington Wizards","Verizon center",null);
		Tim NewYork = new Tim("New York","Madison Square garden",null);
		Tim Brookyln = new Tim("Brooklyn Nets","Barclays Center",null);
		Tim Orlando = new Tim("Orlando Magic","Amway center", null);
		Tim Milwaukee = new Tim("Milwaukee bucks", "BMO Harris Bradley Center", null);
		Tim Philadelphia= new Tim("Philadelphia 76ers"," Wells Fargo Center", null);
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
