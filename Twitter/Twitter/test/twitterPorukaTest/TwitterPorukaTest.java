package twitterPorukaTest;

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

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
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
 	public void testSetPorukaJeNull(){
 		
		tp.setPoruka(null);	
 	}
 	
 	@Test
 	public void testSetPorukaPrazanString(){
 		
 		tp.setPoruka("");
 	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikJeNULL(){
		
 		tp.setKorisnik(null);
 		
 	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikjePrazanString(){
		
 		tp.setKorisnik("");
 		
 	}
	

	@Test (expected = java.lang.RuntimeException.class)
 	public void testSetPorukaPuno(){
 		
		String poruka = "";
 		
 		for (int i = 0; i < 160; i++)
 			poruka +=("Puno,puno,punooo slovaaa."); //Duzina poruke je duza od 140.
 		
 		tp.setPoruka(poruka);
 	}
	
 	@Test
 	public void testSetPorukaValjdaRadi(){
 		
 		tp.setPoruka("Ne znam sta bih stavio...");
 		assertEquals("Ne znam sta bih stavio...", tp.getPoruka());
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
