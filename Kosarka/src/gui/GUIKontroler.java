package gui;

import java.awt.EventQueue;

import klase.Liga;

public class GUIKontroler {
	
	private static PocetnaStrana glavniProzor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavniProzor = new PocetnaStrana();
					glavniProzor.setVisible(true);
					Liga.ucitajUListu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
