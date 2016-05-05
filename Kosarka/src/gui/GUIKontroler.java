package gui;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import klase.Liga;
import klase.Tim;

public class GUIKontroler {
	
	private static PocetnaStrana glavniProzor;
	private static  Liga liga;
	
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
					liga.ucitajUListu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			
			
	
		});
	
	}
	public static String stringUkupanZa1(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(liga.ukupanZa1(t));
	}
	public static String stringPogodjenZa1(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(Liga.pogodjenZa1(t));
		
	}
	public static String stringUkupanZa2(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(Liga.ukupanZa2(t));
	}
	public static String stringPogodjenZa2(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(Liga.pogodjenZa2(t));
	}
	public static String stringUkupanZa3(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(Liga.ukupanZa3(t));
	}
	public static String stringPogodjenZa3(Tim t) {
		// TODO Auto-generated method stub
		return Integer.toString(Liga.pogodjenZa3(t));
	}
	public static String stringProsecanBrAsis(Tim t) {
		// TODO Auto-generated method stub
		return Double.toString(Liga.prosecanBrAsistencija(t));
	}
	public static String stringProsecanBrSkok(Tim t) {
		// TODO Auto-generated method stub
		return Double.toString(Liga.prosecanBrSkokova(t));
	}
	public static String stringProsecanBrIzgu(Tim t) {
		// TODO Auto-generated method stub
		return Double.toString(Liga.prosecanBrIzgubljenih(t));
	}
	public static String stringProsecanBrUkra(Tim t) {
		// TODO Auto-generated method stub
		return Double.toString(Liga.prosecanBrOduzetih(t));
	}
	public static String stringProsecanBrBlok(Tim t) {
		// TODO Auto-generated method stub
		return Double.toString(Liga.prosecanBrBlokada(t));
	}
	public static String stringProsecanBrFaul(Tim t) {
		// TODO Auto-generated method stub
		return Double.toString(Liga.prosecanBrFaulova(t));
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
	public static void popuni(JComboBox comboBox) {
		for (int j = 0; j < Liga.getTimovi().size(); j++) {
			comboBox.addItem(Liga.getTimovi().get(j));
		}
		
	}
	
	
	
	
	
	

}