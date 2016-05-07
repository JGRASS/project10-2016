package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import klase.Liga;
import klase.Tim;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class OkiPredvidjanje extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JComboBox comboBox;
	private JLabel lblIzaberiteEkipuZa;
	private JButton btnIzaberi;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public OkiPredvidjanje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		}
		return panel;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(96, 58, 213, 20);
			GUIKontroler.popuniComboBox(comboBox);
		}
		return comboBox;
	}
	private JLabel getLblIzaberiteEkipuZa() {
		if (lblIzaberiteEkipuZa == null) {
			lblIzaberiteEkipuZa = new JLabel("Izaberite ekipu za koju zelite da predvidite procenat pobeda");
			lblIzaberiteEkipuZa.setBounds(54, 33, 294, 14);
		}
		return lblIzaberiteEkipuZa;
	}
	private JButton getBtnIzaberi() {
		if (btnIzaberi == null) {
			btnIzaberi = new JButton("Izaberi");
			btnIzaberi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Tim t = (Tim) comboBox.getSelectedItem();
					lblIzaberiteEkipuZa.setVisible(false);
					btnIzaberi.setVisible(false);
					textField.setVisible(true);
					double iznos = GUIKontroler.izracunajVerovatnocu(t);
					textField.setText( String.valueOf(iznos) + "%");
				}
			});
			btnIzaberi.setBounds(154, 179, 89, 23);
		}
		return btnIzaberi;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(96, 103, 213, 20);
			textField.setColumns(10);
			textField.setVisible(false);
		}
		return textField;
	}
}
