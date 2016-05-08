package klase;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LigaTest {

	private Liga liga;
	private Tim t;
	private Tim n;
	
	@Before
	public void setUp() throws Exception {
		liga = new Liga();
		liga.ucitajIzFajlaUListu();
		t = new Tim("Philadelphia 76ers"," Wells Fargo Center", new LinkedList<>());
		n = new Tim("Brooklyn Nets","Barclays Center",new LinkedList<>());
	}

	@After
	public void tearDown() throws Exception {
		liga = null;
		t = null;
		n = null;
	}
	
	@Test
	public void upisiUFajlOk(){
		Tim tBefore = liga.getTimovi().get(0);
		liga.upisiUFajl();
		liga.ucitajIzFajlaUListu();
		Tim tAfter = liga.getTimovi().get(0);
		assertEquals(tBefore.getUtakmice().size(), tAfter.getUtakmice().size());
		assertEquals(tBefore.getUtakmice().getFirst().getBrojPrimljenihPoena(), 
				tAfter.getUtakmice().getFirst().getBrojPrimljenihPoena());
	}
	
	@Test
	public void popuniListuIzFajlaOk(){
		Tim tBefore = liga.getTimovi().get(0);
		liga.upisiUFajl();
		liga.ucitajIzFajlaUListu();
		Tim tAfter = liga.getTimovi().get(0);
		assertEquals(tBefore.getUtakmice().size(), tAfter.getUtakmice().size());
		assertEquals(tBefore.getUtakmice().getFirst().getBrojPrimljenihPoena(), 
				tAfter.getUtakmice().getFirst().getBrojPrimljenihPoena());
	}
	
	@Test
	public void vratiUkupanBrPostignutih(){
		int postignuti = liga.getTimovi().get(0).getUtakmice().getFirst().getStatistika().getPoeni() +
				liga.getTimovi().get(0).getUtakmice().get(1).getStatistika().getPoeni() +
				liga.getTimovi().get(0).getUtakmice().getLast().getStatistika().getPoeni();
		assertEquals(postignuti, liga.vratiUkupanBrPostigunih(t));
	}
	
	@Test
	public void vratiUkupanBrPrimljenih(){
		int primljeni = liga.getTimovi().get(0).getUtakmice().getFirst().getBrojPrimljenihPoena() +
				liga.getTimovi().get(0).getUtakmice().get(1).getBrojPrimljenihPoena() +
				liga.getTimovi().get(0).getUtakmice().getLast().getBrojPrimljenihPoena();
		assertEquals(primljeni, liga.vratiUkupanBrPrimljenih(t));
	}
	
	@Test
	public void pozicijaTima(){
		assertEquals(0,liga.pozicijaTima(t));
	}
	
	@Test
	public void ukupanZa1(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getSuteviZaJedan();
		}
		assertEquals(s,liga.ukupanZa1(t));
	}
	
	@Test
	public void ukupanZa2(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getSuteviZaDva();
		}
		assertEquals(s,liga.ukupanZa2(t));
	}
	
	@Test
	public void ukupanZa3(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getSuteviZaTri();
		}
		assertEquals(s,liga.ukupanZa3(t));
	}
	
	@Test
	public void pogodjenZa1(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getPogodjeniZaJedan();
		}
		assertEquals(s,liga.pogodjenZa1(t));
	}
	
	@Test
	public void pogodjenZa2(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getPogodjeniZaDva();
		}
		assertEquals(s,liga.pogodjenZa2(t));
	}
	
	@Test
	public void pogodjenZa3(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getPogodjeniZaTri();
		}
		assertEquals(s,liga.pogodjenZa3(t));
	}
	
	@Test
	public void prosecanBrSkokova(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getSkokovi();
		}
		double p = (double)s / liga.getTimovi().get(0).getUtakmice().size();
		assertEquals(p, liga.prosecanBrSkokova(t),0.001);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void prosecanBrSkokovaNemaUtakmica(){
		liga.setTimovi(null);
		liga.prosecanBrSkokova(n);
	}
	
	@Test
	public void prosecanBrAsistencija(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getAsistencije();
		}
		double p = (double)s / liga.getTimovi().get(0).getUtakmice().size();
		assertEquals(p, liga.prosecanBrAsistencija(t),0.001);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void prosecanBrAsistencijaNemaUtakmica(){
		liga.setTimovi(null);
		liga.prosecanBrAsistencija(n);
	}
	
	@Test
	public void prosecanBrIzgubljenih(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getIzgubljeneLopte();
		}
		double p = (double)s / liga.getTimovi().get(0).getUtakmice().size();
		assertEquals(p, liga.prosecanBrIzgubljenih(t),0.001);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void prosecanBrIzgubljenihNemaUtakmica(){
		liga.setTimovi(null);
		liga.prosecanBrIzgubljenih(n);
	}
	
	@Test
	public void prosecanBrOduzetih(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getOduzeteLopte();
		}
		double p = (double)s / liga.getTimovi().get(0).getUtakmice().size();
		assertEquals(p, liga.prosecanBrOduzetih(t),0.001);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void prosecanBrOduzetihNemaUtakmica(){
		liga.setTimovi(null);
		liga.prosecanBrOduzetih(n);
	}
	
	@Test
	public void prosecanBrBlokada(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getNapravljenaBlokade();
		}
		double p = (double)s / liga.getTimovi().get(0).getUtakmice().size();
		assertEquals(p, liga.prosecanBrBlokada(t),0.001);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void prosecanBrBlokadaNemaUtakmica(){
		liga.setTimovi(null);
		liga.prosecanBrBlokada(n);
	}
	
	@Test
	public void prosecanBrFaulova(){
		int s = 0;
		for (int i = 0; i < liga.getTimovi().get(0).getUtakmice().size(); i++) {
			s += liga.getTimovi().get(0).getUtakmice().get(i).getStatistika().getNacinjeniFaulovi();
		}
		double p = (double)s / liga.getTimovi().get(0).getUtakmice().size();
		assertEquals(p, liga.prosecanBrFaulova(t),0.001);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void prosecanBrFaulovaNemaUtakmica(){
		liga.setTimovi(null);
		liga.prosecanBrFaulova(n);
	}
	
	@Test
	public void dodajUtakmicu(){
		Tim Milwaukee = new Tim("Milwaukee bucks", "BMO Harris Bradley Center", new LinkedList<>());
		Tim Orlando = new Tim("Orlando Magic","Amway center", new LinkedList<>());
		Statistika mStat = new Statistika(98, 13, 19, 38, 63, 3, 15, 
				45, 6, 23, 18, 7, 20);
		Statistika oStat = new Statistika(107, 18, 28, 34, 61, 7, 23, 
				36, 19, 10, 28, 10, 15);
		int mBrPrimljenih = 107;
		int oBrPrimljenih = 98;
		liga.dodajUtakmicu(Orlando, Milwaukee, oStat, mStat, oBrPrimljenih, mBrPrimljenih);
		assertEquals(0,liga.getTimovi().get(2).getUtakmice().getFirst().getID());
		assertEquals(98,liga.getTimovi().get(2).getUtakmice().getFirst().getBrojPrimljenihPoena());
	}

}
