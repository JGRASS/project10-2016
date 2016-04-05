package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterPorukaTest {

	TwitterPoruka tp;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
		tp = null;
	}


	@Test
	public void testSetKorisnik() {
		tp.setKorisnik("Pera");
		
		assertEquals("Pera", tp.getKorisnik());
	}

	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka() {
		
		String poruka = null;
		
		for(int i = 0; i < 160; i++){
			poruka.concat("aa"); //Duzina poruke je duza od 140.
		}
		
		tp.setPoruka(poruka);
		
		if(tp.getPoruka().length() > 140){
			throw new RuntimeException("Duzina poruke je duza od predvidjene.");
		}
	}

	@Test
	public void testToString() {
		
		tp.setKorisnik("Luka");
		tp.setPoruka("Neka poruka");
		
		String korisnikProvera = "KORISNIK:"; // "KORISNIK:"+korisnik+" PORUKA:"+poruka; 
		korisnikProvera = korisnikProvera.concat(tp.getKorisnik());
		korisnikProvera = korisnikProvera.concat(" PORUKA:");
		korisnikProvera = korisnikProvera.concat(tp.getPoruka());
		
		assertEquals(korisnikProvera, tp.toString());
	}

}
