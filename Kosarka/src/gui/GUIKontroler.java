package gui;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import klase.Liga;
import klase.Statistika;
import klase.Tim;

public class GUIKontroler {
	
	private static PocetnaStrana glavniProzor;
	private static DodavanjeNoveUtakmice utakmicaProzor;
	private static Liga liga = new Liga();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavniProzor = new PocetnaStrana();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
					liga.ucitajIzFajlaUListu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	public static String stringUkupanZa1(Tim t) {
		return Integer.toString(liga.ukupanZa1(t));
	}
	public static String stringPogodjenZa1(Tim t) {
		return Integer.toString(liga.pogodjenZa1(t));
		
	}
	public static String stringUkupanZa2(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(liga.ukupanZa2(t));
	}
	public static String stringPogodjenZa2(Tim t) {
		return Integer.toString(liga.pogodjenZa2(t));
	}
	public static String stringUkupanZa3(Tim t) {
		return Integer.toString(liga.ukupanZa3(t));
	}
	public static String stringPogodjenZa3(Tim t) {
		return Integer.toString(liga.pogodjenZa3(t));
	}
	public static String stringProsecanBrAsis(Tim t) {
		return Double.toString(liga.prosecanBrAsistencija(t));
	}
	public static String stringProsecanBrSkok(Tim t) {
		return Double.toString(liga.prosecanBrSkokova(t));
	}
	public static String stringProsecanBrIzgu(Tim t) {
		return Double.toString(liga.prosecanBrIzgubljenih(t));
	}
	public static String stringProsecanBrUkra(Tim t) {
		return Double.toString(liga.prosecanBrOduzetih(t));
	}
	public static String stringProsecanBrBlok(Tim t) {
		return Double.toString(liga.prosecanBrBlokada(t));
	}
	public static String stringProsecanBrFaul(Tim t) {
		return Double.toString(liga.prosecanBrFaulova(t));
	}
	public static void podesi(String text, String text2, JProgressBar progressBar_1, String text3, String text4,
			JProgressBar progressBar_2, String text5, String text6, JProgressBar progressBar) {
		int val1  = Integer.parseInt(text) *100 / Integer.parseInt(text2);
		progressBar_1.setValue(val1);
		int val2  = Integer.parseInt(text3) *100 / Integer.parseInt(text4);
		progressBar_2.setValue(val2);
		int val3  = Integer.parseInt(text5) *100 / Integer.parseInt(text6);
		progressBar.setValue(val3);
		
	}
	
	public static void popuniComboBox(JComboBox<Tim> comboBox) {
		for (int j = 0; j < liga.getTimovi().size(); j++) {
			comboBox.addItem(liga.getTimovi().get(j));
		}
	}
	
	public static void dodajUtakmicu(int pogSlobodnaDom,int pogSlobodnaGos,int brSlobodnihDom,int brSlobodnihGos,
			int pogDvojkeDom,int pogDvojkeGos,int brSutevaZaDvaDom,int brSutevaZaDvaGos,int pogTrojkeDom,
			int pogTrojkeGos,int brSutevaZaTriDom,int brSutevaZaTriGos,int skokoviDom,int skokoviGos,
			int oduzeteLopteDom,int oduzeteLopteGos,int izgubljeneLopteDom,int izgubljeneLopteGos,
			int asistencijeDom,int asistencijeGos,int blokadeDom,int blokadeGos,int fauloviDom,
			int fauloviGos,Tim dom,Tim gos) {
		
		Statistika domStat = new Statistika(pogSlobodnaDom+2*pogDvojkeDom+3*pogTrojkeDom, 
				pogSlobodnaDom, brSlobodnihDom, pogDvojkeDom, brSutevaZaDvaDom, pogTrojkeDom, brSutevaZaTriDom, 
				skokoviDom, oduzeteLopteDom, izgubljeneLopteDom, asistencijeDom, blokadeDom, fauloviDom);
		
		Statistika gosStat = new Statistika(pogSlobodnaGos+2*pogDvojkeGos+3*pogTrojkeGos, 
				pogSlobodnaGos, brSlobodnihGos, pogDvojkeGos, brSutevaZaDvaGos, pogTrojkeGos, brSutevaZaTriGos, 
				skokoviGos, oduzeteLopteGos, izgubljeneLopteGos, asistencijeGos, blokadeGos, fauloviGos);
		
		int domBrPrimljenih = pogSlobodnaGos+2*pogDvojkeGos+3*pogTrojkeGos;
		int gosBrPrimljenih = pogSlobodnaDom+2*pogDvojkeDom+3*pogTrojkeDom;
		
		liga.dodajUtakmicu(dom, gos, domStat, gosStat, domBrPrimljenih, gosBrPrimljenih);
		
	}
	
	public static void upisiUDatoteku() {
		liga.upisiUFajl();
	}
	
	public static void prikaziInfoProzorZaUspesanUnosUtakmice(Tim dom, Tim gos){
		JOptionPane.showMessageDialog(glavniProzor, "Uspesno ste uneli utakmicu: " + dom.getIme() + " vs " + 
	gos.getIme(), "Uspesan unos.", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static double izracunajVerovatnocu(Tim t) {

		double ispis;
		double gore;
		double dole;
		int postignuti;
		int primljeni;

		postignuti = liga.vratiUkupanBrPostigunih(t);
		primljeni = liga.vratiUkupanBrPrimljenih(t);

		gore = Math.pow(postignuti, 13.91);
		dole = Math.pow(primljeni, 13.91);

		ispis = gore / (gore + dole);
		return (Double) ispis;
	}
	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li zelite da izadjete iz programa?",
				"Zatvaranje aplikacije", JOptionPane.YES_NO_CANCEL_OPTION);

		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public static void otvoriProzorStatistika() {
		StatGui stat = new StatGui();
		stat.setVisible(true);
		stat.setLocationRelativeTo(null);
	}
	
	public static void otvoriProzorDodavanjeNoveUtakmice() {
		utakmicaProzor = new DodavanjeNoveUtakmice();
		utakmicaProzor.setVisible(true);
		utakmicaProzor.setLocationRelativeTo(null);
	}
	
	public static void otvoriProzorPredvidjanje() {
		OkiPredvidjanje predvidjaj = new OkiPredvidjanje();
		predvidjaj.setVisible(true);
	}
	
	public static int daLiSteSigurniDaZeliteDaOdustanete() {
		return JOptionPane.showConfirmDialog(utakmicaProzor, "Da li ste sigurni da zelite da izadjete?",
				"Zatvori prozor", JOptionPane.YES_NO_OPTION);
	}
	
	

}