package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

import klase.Liga;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

/**
 * 
 * @author Luka Orlovic
 * 
 * */

public class PocetnaStrana extends JFrame{

	private JFrame frame;
	private JPanel panel;
	private JLabel lblDobroDosliU;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblAplikacijuNapraviliLuka;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	

	/**
	 * Initialize the contents of the frame.
	 */
	public PocetnaStrana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PocetnaStrana.class.getResource("/ikona/Basketball.png")));
		setTitle("KOSARKA APP");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GUIKontroler.ugasiAplikaciju();
			}
		});
		getContentPane().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		setBounds(100, 100, 401, 315);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getPanel_1_1(), BorderLayout.CENTER);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLblDobroDosliU());
		}
		return panel;
	}
	private JLabel getLblDobroDosliU() {
		if (lblDobroDosliU == null) {
			lblDobroDosliU = new JLabel("DOBRO DOSLI");
			lblDobroDosliU.setBackground(Color.YELLOW);
			lblDobroDosliU.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblDobroDosliU.setOpaque(true);
		}
		return lblDobroDosliU;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getPanel_2(), BorderLayout.NORTH);
			panel_1.add(getBtnNewButton(), BorderLayout.WEST);
			panel_1.add(getBtnNewButton_1(), BorderLayout.CENTER);
			panel_1.add(getBtnNewButton_2(), BorderLayout.EAST);
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getLblAplikacijuNapraviliLuka());
		}
		return panel_2;
	}
	private JLabel getLblAplikacijuNapraviliLuka() {
		if (lblAplikacijuNapraviliLuka == null) {
			lblAplikacijuNapraviliLuka = new JLabel("Aplikaciju napravili: Luka Novakovi\u0107, Ilija Pavlovi\u0107, Luka Orlovi\u0107");
		}
		return lblAplikacijuNapraviliLuka;
	}
	/**
	 * Dugme za otvaranje prozora "Statistika".
	 * @return JButton
	 */
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("STATISTIKA");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.otvoriProzorStatistika();
				}
			});
		}
		return btnNewButton;
	}
	/**
	 * Dugme za otvaranje prozora "Dodavanje nove utakmice".
	 * @return JButton
	 */
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("DODAVANJE NOVE UTAKMICE");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.otvoriProzorDodavanjeNoveUtakmice();
				}
			});
		}
		return btnNewButton_1;
	}
	/**
	 * Dugme za otvaranje prozora "Predvidjanje".
	 * @return jJButton
	 */
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("PREDVIDJANJE");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.otvoriProzorPredvidjanje();
				}
			});
		}
		return btnNewButton_2;
	}
}
