package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import klase.Liga;
import klase.Tim;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;

/**
 * 
 * @author Luka Orlovic
 * 
 * */

public class OkiPredvidjanje extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JComboBox comboBox;
	private JLabel lblIzaberiteEkipuZa;
	private JButton btnIzaberi;
	private JTextField textField;
	private JProgressBar progressBar;
	private JLabel lblZaEkipu;
	private JLabel lblProcenatPredvidjenih;

	

	/**
	 * Create the frame.
	 */
	public OkiPredvidjanje() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OkiPredvidjanje.class.getResource("/ikona/Basketball.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				if(GUIKontroler.daLiSteSigurniDaZeliteDaOdustanete() == JOptionPane.YES_OPTION){
					dispose();
				}
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 446, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getComboBox());
			panel.add(getLblIzaberiteEkipuZa());
			panel.add(getBtnIzaberi());
			panel.add(getTextField());
			panel.add(getProgressBar());
			panel.add(getLblZaEkipu());
			panel.add(getLblProcenatPredvidjenih());
		}
		return panel;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(75, 58, 262, 20);
			GUIKontroler.popuniComboBox(comboBox);
		}
		return comboBox;
	}
	private JLabel getLblIzaberiteEkipuZa() {
		if (lblIzaberiteEkipuZa == null) {
			lblIzaberiteEkipuZa = new JLabel("Izaberite ekipu za koju zelite da predvidite procenat pobeda");
			lblIzaberiteEkipuZa.setBounds(51, 11, 335, 14);
		}
		return lblIzaberiteEkipuZa;
	}
	
	/**
	 * Unosenje funkcija koje bi trebalo da se obave naon pritiska na dugme "Izaber" i sama velicina i oblik dugmeta.
	 * @return JButton
	 */
	private JButton getBtnIzaberi() {
		
		if (btnIzaberi == null) {
			btnIzaberi = new JButton("Izaberi");
			btnIzaberi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Tim t = (Tim) comboBox.getSelectedItem();
					double iznos = GUIKontroler.izracunajVerovatnocu(t);
					lblIzaberiteEkipuZa.setVisible(false);
					//btnIzaberi.setVisible(false);
					textField.setVisible(true);
					lblProcenatPredvidjenih.setVisible(true);
					lblZaEkipu.setVisible(true);
					if(iznos == 0){
						textField.setText("Tim nema nijednu odigranu utakmicu.");
					}
					else{
						GUIKontroler.izraziProgressBarUPredvidjanju(iznos, progressBar);
						textField.setText( String.valueOf(iznos) + "%");
					}
				}
			});
			btnIzaberi.setBounds(155, 196, 89, 23);
		}
		return btnIzaberi;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(95, 114, 213, 20);
			textField.setColumns(10);
			textField.setVisible(false);
		}
		return textField;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setToolTipText("Predvidjen procenat pobeda u sezoni");
			progressBar.setForeground(Color.DARK_GRAY);
			progressBar.setBounds(128, 154, 146, 14);
		}
		return progressBar;
	}
	private JLabel getLblZaEkipu() {
		if (lblZaEkipu == null) {
			lblZaEkipu = new JLabel("Za ekipu:");
			lblZaEkipu.setBounds(173, 36, 71, 14);
			lblZaEkipu.setVisible(false);
		}
		return lblZaEkipu;
	}
	private JLabel getLblProcenatPredvidjenih() {
		if (lblProcenatPredvidjenih == null) {
			lblProcenatPredvidjenih = new JLabel("procenat predvidjenih pobeda u sezoni je:");
			lblProcenatPredvidjenih.setBounds(85, 89, 271, 14);
			lblProcenatPredvidjenih.setVisible(false);
		}
		return lblProcenatPredvidjenih;
	}
}
