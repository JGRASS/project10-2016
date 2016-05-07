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
	
	private List<Tim> timovi = new ArrayList<>();
	
	public List<Tim> getTimovi() {
		return timovi;
	}

	public void setTimovi(List<Tim> timovi) {
		this.timovi = timovi;
	}

	public void upisiUFajl(){
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
	
	public void ucitajIzFajlaUListu(){
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
	
	public int vratiUkupanBrPostigunih(Tim t){
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
	
	public int vratiUkupanBrPrimljenih(Tim t){
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
	
	public void main(String[] args) {
		ucitajIzFajlaUListu();
		System.out.println(timovi.get(0).getUtakmice().get(0));
		System.out.println(timovi.get(0).getUtakmice().get(1));
		System.out.println(timovi.get(0).getUtakmice().get(2));
		
		Tim philly = timovi.get(0);
		System.out.println(vratiUkupanBrPostigunih(philly));
	}
	public int pozicijaTima(Tim t){
		int pozicija = 0;
		for(int i=1;i<timovi.size();i++){
			if(t.equals(timovi.get(i))) pozicija = i;
			
		}
		return pozicija;
	}
	public int ukupanZa1(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSuteviZaJedan();
			
		}
		return uk;
		
	}
	public int pogodjenZa1(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getPogodjeniZaJedan();
			
		}
		return uk ;
		
	}
	public int ukupanZa2(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSuteviZaDva();
			
		}
		return uk;
		
	}
	public int pogodjenZa2(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getPogodjeniZaDva();
			
		}
		return uk;
		
	}
	public int ukupanZa3(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSuteviZaTri();
			
		}
		return uk;
		
	}
	public int pogodjenZa3(Tim t){
		int uk = 0;
		for(int i=0;i<timovi.get(pozicijaTima(t)).getUtakmice().size();i++){
			uk = uk + timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getPogodjeniZaTri();
			
		}
		return uk;
		
	}
	public double prosecanBrSkokova(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getSkokovi();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public double prosecanBrAsistencija(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getAsistencije();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public double prosecanBrIzgubljenih(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getIzgubljeneLopte();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public double prosecanBrOduzetih(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getOduzeteLopte();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public double prosecanBrBlokada(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getNapravljenaBlokade();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}
	
	public double prosecanBrFaulova(Tim t){
		int ukupno = 0;
		for (int i = 0; i < timovi.get(pozicijaTima(t)).getUtakmice().size(); i++) {
			ukupno += timovi.get(pozicijaTima(t)).getUtakmice().get(i).getStatistika().getNacinjeniFaulovi();
		}
		return (double)ukupno / timovi.get(pozicijaTima(t)).getUtakmice().size();
	}

	public void dodajUtakmicu(Tim dom, Tim gos, Statistika domStat, Statistika gosStat, int domBrPrimljenih,
			int gosBrPrimljenih) {
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
