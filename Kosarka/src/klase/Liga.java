package klase;

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

public class Liga{
	
	private static List<Tim> timovi = new ArrayList<>();
	
	public static List<Tim> getTimovi() {
		return timovi;
	}

	public static void setTimovi(List<Tim> timovi) {
		Liga.timovi = timovi;
	}
	
	public static void ucitajUListu(){
		/*if(timovi.isEmpty()){
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
		}*/
		deserializeElement();
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static int vratiUkupanBrPostigunih(Tim t){
		int brojPostignutih = 0;
		for (int i = 0; i < timovi.size(); i++) {
			if(timovi.get(i).equals(t)){
				for (int j = 0; j < timovi.get(i).getUtakmice().size(); j++) {
					Utakmica u = timovi.get(i).getUtakmice().get(j);
					brojPostignutih += u.getStatistika().getPoeni();
				}
			}
		}
		return brojPostignutih;
	}
	
	public static int vratiUkupanBrPrimljenih(Tim t){
		int brojPrimljenih = 0;
		for (int i = 0; i < timovi.size(); i++) {
			if(timovi.get(i).equals(t)){
				for (int j = 0; j < timovi.get(i).getUtakmice().size(); j++) {
					Utakmica u = timovi.get(i).getUtakmice().get(j);
					brojPrimljenih += u.getBrojPrimljenihPoena();
				}
			}
		}
		return brojPrimljenih;
	}
	
	public static void main(String[] args) {
		deserializeElement();
		System.out.println(timovi.get(0).getUtakmice().get(0));
		System.out.println(timovi.get(0).getUtakmice().get(1));
		System.out.println(timovi.get(0).getUtakmice().get(2));
		
		Tim philly = timovi.get(0);
		System.out.println(vratiUkupanBrPostigunih(philly));
	}
	public static int pozicijaTima(Tim t){
		int pozicija = 0;
		for(int i=1;i<timovi.size();i++){
			if(t.equals(timovi.get(i))) pozicija = i;
			
		}
		return pozicija;
	}
	public static int ukupanZa1(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSuteviZaJedan();
			
		}
		return uk;
		
	}
	public static int pogodjenZa1(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getPogodjeniZaJedan();
			
		}
		return uk ;
		
	}
	public static int ukupanZa2(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSuteviZaDva();
			
		}
		return uk;
		
	}
	public static int pogodjenZa2(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getPogodjeniZaDva();
			
		}
		return uk;
		
	}
	public static int ukupanZa3(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSuteviZaTri();
			
		}
		return uk;
		
	}
	public static int pogodjenZa3(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getPogodjeniZaTri();
			
		}
		return uk;
		
	}
	public static double prosecanBrSkokova(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSkokovi();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public static double prosecanBrAsistencija(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getAsistencije();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public static double prosecanBrIzgubljenih(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getIzgubljeneLopte();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public static double prosecanBrOduzetih(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getOduzeteLopte();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public static double prosecanBrBlokada(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getNapravljenaBlokade();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public static double prosecanBrFaulova(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getNacinjeniFaulovi();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
}
