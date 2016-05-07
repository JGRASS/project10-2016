package klase;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimTest {
	
	private Tim t;

	@Before
	public void setUp() throws Exception {
		t = new Tim(null, null, null);
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}
	
	@Test
	public void getIme(){
		t.setIme("ime");
		assertEquals("ime",t.getIme());
	}

	@Test
	public void setIme(){
		t.setIme("ime");
		assertEquals("ime",t.getIme());
	}
	
	@Test
	public void setImeHale(){
		t.setImeHale("ime");
		assertEquals("ime",t.getImeHale());
	}
	
	@Test
	public void getImeHale(){
		t.setImeHale("ime");
		assertEquals("ime",t.getImeHale());
	}

	@Test
	public void getUtakmice(){
		LinkedList<Utakmica> utakmice = new LinkedList<>();
		Statistika mStat = new Statistika(98, 13, 19, 38, 63, 3, 15, 
				45, 6, 23, 18, 7, 20);
		Utakmica u = new Utakmica(0, "Orlando", mStat, 107);
		utakmice.add(u);
		t.setUtakmice(utakmice);
		assertEquals(107, utakmice.get(0).getBrojPrimljenihPoena());
		assertEquals(0, utakmice.get(0).getID());
	}
	
	@Test
	public void toStringOk(){
		t.setIme("Partizan");
		t.setImeHale("Hala Pionir");
		t.setUtakmice(null);
		assertEquals("Partizan", t.toString());
	}
	
	@Test
	public void equalsTrue(){
		t.setIme("Partizan");
		t.setImeHale("Hala Pionir");
		t.setUtakmice(null);
		Tim d = new Tim("Partizan", "Hala Pionir", null);
		assertEquals(true, t.equals(d));
	}
	
	@Test
	public void equalsFalse(){
		t.setIme("Partizan");
		t.setImeHale("Hala Pionir");
		t.setUtakmice(null);
		Tim d = new Tim("Sloboda", "Veliki park", null);
		assertEquals(false, t.equals(d));
	}

}
