package gui;

import java.awt.EventQueue;

import klase.Liga;

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

}
