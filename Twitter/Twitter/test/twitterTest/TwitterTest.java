package twitterTest;

import static org.junit.Assert.*;

import java.lang.Character.UnicodeScript;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

import twitter.Twitter;

public class TwitterTest {

	Twitter tw;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tw = new Twitter();
	}

	@After
	public void tearDown() throws Exception {
		tw = null;
		
	}
	
	@Test
	public void testVratiSvePoruke() {
		
		TwitterPoruka porukica = new TwitterPoruka();
		
		porukica.setKorisnik("Neko");
		porukica.setPoruka("Nesto");
		
		tw.unesi("Neko", "Nesto");
		
		assertEquals(porukica.getKorisnik(), tw.vratiSvePoruke().get(0).getKorisnik());
		assertEquals(porukica.getPoruka(), tw.vratiSvePoruke().get(0).getPoruka());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testUnesiPorucetinu()
	{
		String neverovatnoVelikaPoruka = "aaa";
		
		for(int i = 0; i < 13; i++){
			neverovatnoVelikaPoruka += "Dodaj,samo dodaj.";
		}
		
		String korisnik = "Kobe Bryant";
		
		TwitterPoruka porukica = new TwitterPoruka();
		porukica.setKorisnik(korisnik);
		porukica.setPoruka(neverovatnoVelikaPoruka);
		
		tw.unesi(korisnik, neverovatnoVelikaPoruka);
		
		assertEquals(porukica.toString(), tw.vratiSvePoruke().getLast().toString());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testUnesiNullove(){
		
		tw.unesi(null, null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testUnesiPrazneStringove() {
		
		tw.unesi("", "");
	}
	
	@Test
	public void testUnesiTrebaloBiDaRadi()
	{
		String korisnik = "Nikola Nikolic";
		String poruka = "Dosta je bilo vise.";
		
		
		TwitterPoruka porukeks = new TwitterPoruka();
		
		tw.unesi(korisnik, poruka);
		
		porukeks.setKorisnik(korisnik);
		porukeks.setPoruka(poruka);
		
		assertEquals(porukeks.toString(), tw.vratiSvePoruke().getLast().toString());
	}

	@Test 
	public void testVratiPorukeManjeOdNule(){
		String korisnik = "Pera";
		String poruka = "Ima li kraja";
		
		for (int i = 0; i < 45; i++){
			tw.unesi(korisnik, poruka);
		}
	
		tw.vratiPoruke(-5, poruka);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagPrazanString(){
		String tag = "";
		
		tw.vratiPoruke(5, tag);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagJeNullica(){
		
		String tag = null;
		
		tw.vratiPoruke(5, tag);
	}
	

}
