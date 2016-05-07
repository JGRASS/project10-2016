package klase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtakmicaTest {
	
	private Utakmica u;

	@Before
	public void setUp() throws Exception {
		u = new Utakmica(0, null, null, 0);
	}

	@After
	public void tearDown() throws Exception {
		u = null;
	}

	@Test
	public void setID(){
		u.setID(0);
		assertEquals(0,u.getID());
	}
	
	@Test
	public void getID(){
		u.setID(0);
		assertEquals(0,u.getID());
	}
	
	@Test
	public void setBrPrimljenihPoena(){
		u.setBrojPrimljenihPoena(10);
		assertEquals(10,u.getBrojPrimljenihPoena());
	}
	
	@Test
	public void getBrPrimljenihPoena(){
		u.setBrojPrimljenihPoena(10);
		assertEquals(10,u.getBrojPrimljenihPoena());
	}
	
	@Test
	public void setProtivnik(){
		u.setProtivnik("protivnik");
		assertEquals("protivnik",u.getProtivnik());
	}
	
	@Test
	public void getProtivnik(){
		u.setProtivnik("protivnik");
		assertEquals("protivnik",u.getProtivnik());
	}
	
	@Test
	public void setStatistika(){
		Statistika mStat = new Statistika(98, 13, 19, 38, 63, 3, 15, 
				45, 6, 23, 18, 7, 20);
		u.setStatistika(mStat);
		assertEquals(98,u.getStatistika().getPoeni());
	}
	
	@Test
	public void getStatistika(){
		Statistika mStat = new Statistika(98, 13, 19, 38, 63, 3, 15, 
				45, 6, 23, 18, 7, 20);
		u.setStatistika(mStat);
		assertEquals(98,u.getStatistika().getPoeni());
	}
	
	@Test
	public void toStringOk(){
		Statistika mStat = new Statistika(98, 13, 19, 38, 63, 3, 15, 
				45, 6, 23, 18, 7, 20);
		Utakmica ut = new Utakmica(0, "protivnik", mStat, 105);
		assertEquals("Utakmica [ID=" + 0 + ", protivnik=" + "protivnik" + ", statistika=" + mStat + "]",ut.toString());
	}
}
