package klase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StatistikaTest {
	
	private Statistika s;

	@Before
	public void setUp() throws Exception {
		s = new Statistika(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}
	
	@Test
	public void setPoeni(){
		s.setPoeni(10);
		assertEquals(10,s.getPoeni());
	}
	
	@Test
	public void getPoeni(){
		s.setPoeni(10);
		assertEquals(10,s.getPoeni());
	}
	
	@Test
	public void setPogodjeneZaJedan(){
		s.setPogodjeniZaJedan(10);
		assertEquals(10,s.getPogodjeniZaJedan());
	}
	
	@Test
	public void getPogodjeneZaJedan(){
		s.setPogodjeniZaJedan(10);
		assertEquals(10,s.getPogodjeniZaJedan());
	}
	
	@Test
	public void setSuteviZaJedan(){
		s.setSuteviZaJedan(10);
		assertEquals(10,s.getSuteviZaJedan());
	}
	
	@Test
	public void getSuteviZaJedan(){
		s.setSuteviZaDva(10);
		assertEquals(10,s.getSuteviZaDva());
	}
	
	@Test
	public void setPogodjeneZaDva(){
		s.setPogodjeniZaDva(10);
		assertEquals(10,s.getPogodjeniZaDva());
	}
	
	@Test
	public void getPogodjeneZaDva(){
		s.setPogodjeniZaDva(10);
		assertEquals(10,s.getPogodjeniZaDva());
	}
	
	@Test
	public void setSuteviZaDva(){
		s.setSuteviZaDva(10);
		assertEquals(10,s.getSuteviZaDva());
	}
	
	@Test
	public void getSuteviZaDva(){
		s.setSuteviZaDva(10);
		assertEquals(10,s.getSuteviZaDva());
	}

	@Test
	public void setPogodjeneZaTri(){
		s.setPogodjeniZaTri(10);
		assertEquals(10,s.getPogodjeniZaTri());
	}
	
	@Test
	public void getPogodjeneZaTri(){
		s.setPogodjeniZaTri(10);
		assertEquals(10,s.getPogodjeniZaTri());
	}
	
	@Test
	public void setSuteviZaTri(){
		s.setSuteviZaTri(10);
		assertEquals(10,s.getSuteviZaTri());
	}
	
	@Test
	public void getSuteviZaTri(){
		s.setSuteviZaTri(10);
		assertEquals(10,s.getSuteviZaTri());
	}
	
	@Test
	public void setSkokovi(){
		s.setSkokovi(10);
		assertEquals(10,s.getSkokovi());
	}
	
	@Test
	public void getSkokovi(){
		s.setSkokovi(10);
		assertEquals(10,s.getSkokovi());
	}
	
	@Test
	public void setAsistencije(){
		s.setAsistencije(10);
		assertEquals(10,s.getAsistencije());
	}
	
	@Test
	public void getAsistencije(){
		s.setAsistencije(10);
		assertEquals(10,s.getAsistencije());
	}
	
	@Test
	public void setIzgubljeneLopte(){
		s.setIzgubljeneLopte(10);
		assertEquals(10,s.getIzgubljeneLopte());
	}
	
	@Test
	public void getIzgubljeneLopte(){
		s.setIzgubljeneLopte(10);
		assertEquals(10,s.getIzgubljeneLopte());
	}
	
	@Test
	public void setOduzeteLopte(){
		s.setOduzeteLopte(10);
		assertEquals(10,s.getOduzeteLopte());
	}
	
	@Test
	public void getOduzeteLopte(){
		s.setOduzeteLopte(10);
		assertEquals(10,s.getOduzeteLopte());
	}
	
	@Test
	public void setNapravljeneBlokade(){
		s.setNapravljenaBlokade(10);
		assertEquals(10,s.getNapravljenaBlokade());
	}
	
	@Test
	public void getNapravljeneBlokade(){
		s.setNapravljenaBlokade(10);
		assertEquals(10,s.getNapravljenaBlokade());
	}
	
	@Test
	public void setNacinjeniFaulovi(){
		s.setNacinjeniFaulovi(10);
		assertEquals(10,s.getNacinjeniFaulovi());
	}
	
	@Test
	public void getNacinjeniFaulovi(){
		s.setNacinjeniFaulovi(10);
		assertEquals(10,s.getNacinjeniFaulovi());
	}
	
	@Test
	public void toStringOk(){
		Statistika mStat = new Statistika(98, 13, 19, 38, 63, 3, 15, 
				45, 6, 23, 18, 7, 20);
		String reper = "Statistika [poeni=" + 98 + ", pogodjeniZaJedan=" + 13 + ", suteviZaJedan="
				+ 19 + ", pogodjeniZaDva=" + 38 + ", suteviZaDva=" + 63
				+ ", pogodjeniZaTri=" + 3 + ", suteviZaTri=" + 15 + ", skokovi=" + 45
				+ ", oduzeteLopte=" + 6 + ", izgubljeneLopte=" + 23 + ", asistencije="
				+ 18 + ", napravljenaBlokade=" + 7 + ", nacinjeniFaulovi=" + 20
				+ "]";
		assertEquals(reper,mStat.toString());
	}
}
