package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import klase.Liga;
import klase.Statistika;
import klase.Tim;
import klase.Utakmica;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author Luka Novakovic
 * 
 * */

public class StatGui extends JFrame {
	private JTextField txtKosevi;

	/**
	 * Create the frame.
	 */
	public StatGui() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				if(GUIKontroler.daLiSteSigurniDaZeliteDaOdustanete() == JOptionPane.YES_OPTION){
					dispose();
				}
			}
		});
		
		txtKosevi = new JTextField();
		txtKosevi.setEditable(false);
		txtKosevi.setText("Kosevi");
		txtKosevi.setBounds(152, 11, 86, 20);
		txtKosevi.setColumns(10);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblKosevi = new JLabel("Kosevi");
		lblKosevi.setBounds(54, 0, 46, 14);
		getContentPane().add(lblKosevi);
		
		JLabel lblSuteviZa = new JLabel("Sutevi za 1");
		lblSuteviZa.setBounds(20, 25, 71, 14);
		getContentPane().add(lblSuteviZa);
		
		JLabel lblPogodjeniZa = new JLabel("Pogodjeni za 1");
		lblPogodjeniZa.setBounds(20, 50, 95, 14);
		getContentPane().add(lblPogodjeniZa);
		
		JLabel lblSuteviZa_1 = new JLabel("Sutevi za 2 ");
		lblSuteviZa_1.setBounds(20, 99, 71, 14);
		getContentPane().add(lblSuteviZa_1);
		
		JLabel lblPogodjeniZa_1 = new JLabel("Pogodjeni za 2");
		lblPogodjeniZa_1.setBounds(20, 124, 95, 14);
		getContentPane().add(lblPogodjeniZa_1);
		
		JLabel lblSuteviZa_2 = new JLabel("Sutevi za 3 ");
		lblSuteviZa_2.setBounds(20, 174, 71, 14);
		getContentPane().add(lblSuteviZa_2);
		
		JLabel lblPogodjeniZa_2 = new JLabel("Pogodjeni za 3");
		lblPogodjeniZa_2.setBounds(20, 199, 95, 14);
		getContentPane().add(lblPogodjeniZa_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setToolTipText("procenat pogodjenih za 3");
		progressBar.setBounds(20, 224, 146, 14);
		getContentPane().add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setToolTipText("procenat pogodjenih za 1");
		progressBar_1.setForeground(Color.GREEN);
		progressBar_1.setBounds(20, 74, 146, 14);
		getContentPane().add(progressBar_1);
		
		
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setToolTipText("procenat pogodjenih za 2");
		progressBar_2.setForeground(Color.GREEN);
		progressBar_2.setBounds(20, 149, 146, 14);
		getContentPane().add(progressBar_2);
		
		JLabel lblOstalo = new JLabel("Ostalo");
		lblOstalo.setBounds(288, 0, 46, 14);
		getContentPane().add(lblOstalo);
		
		JLabel lblAsistencije = new JLabel("Asistencije");
		lblAsistencije.setBounds(239, 25, 63, 14);
		getContentPane().add(lblAsistencije);
		
		JLabel lblNewLabel = new JLabel("Skokovi");
		lblNewLabel.setBounds(239, 50, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblIzgubljeneLopte = new JLabel("Izgubljene lopte");
		lblIzgubljeneLopte.setBounds(239, 101, 95, 14);
		getContentPane().add(lblIzgubljeneLopte);
		
		JLabel lblNewLabel_1 = new JLabel("Ukradene lopte");
		lblNewLabel_1.setBounds(239, 123, 79, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Blokade");
		lblNewLabel_2.setBounds(239, 185, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblFaulovi = new JLabel("Faulovi");
		lblFaulovi.setBounds(239, 210, 46, 14);
		getContentPane().add(lblFaulovi);
		
		JLabel l1 = new JLabel("21");
	
		l1.setBounds(149, 25, 46, 14);
		getContentPane().add(l1);
		
		JLabel l11 = new JLabel("15");
		l11.setBounds(149, 50, 46, 14);
		getContentPane().add(l11);
		
		JLabel l2 = new JLabel("41");
		l2.setBounds(149, 99, 46, 14);
		getContentPane().add(l2);
		
		JLabel l22 = new JLabel("31");
		l22.setBounds(149, 124, 46, 14);
		getContentPane().add(l22);
		
		JLabel l3 = new JLabel("16");
		l3.setBounds(149, 174, 46, 14);
		getContentPane().add(l3);
		
		JLabel l33 = new JLabel("5");
		l33.setBounds(149, 199, 46, 14);
		getContentPane().add(l33);
		
		JLabel a = new JLabel("20");
		a.setBounds(342, 25, 46, 14);
		getContentPane().add(a);
		
		JLabel s = new JLabel("34");
		s.setBounds(342, 50, 46, 14);
		getContentPane().add(s);
		
		JLabel i = new JLabel("11");
		i.setBounds(342, 101, 46, 14);
		getContentPane().add(i);
		
		JLabel u = new JLabel("6");
		u.setBounds(342, 123, 46, 14);
		getContentPane().add(u);
		
		JLabel b = new JLabel("4");
		b.setBounds(342, 185, 46, 14);
		getContentPane().add(b);
		
		JLabel f = new JLabel("18");
		f.setBounds(342, 210, 46, 14);
		getContentPane().add(f);
		
		
		JComboBox comboBox = new JComboBox();
		GUIKontroler.popuniComboBox(comboBox);
		
		comboBox.setBounds(159, -3, 90, 20);
		getContentPane().add(comboBox);
		/**
		 * Podesavanje dugmeta "OK", nakon cijeg se pritiska prikazuju svi bitni kosarkaski parametri izabrane ekipe.
		 */
		JButton btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try {
						Tim  t = (Tim) comboBox.getSelectedItem();
						l1.setText(GUIKontroler.stringUkupanZa1(t));
						l11.setText(GUIKontroler.stringPogodjenZa1(t));
						l2.setText(GUIKontroler.stringUkupanZa2(t));
						l22.setText(GUIKontroler.stringPogodjenZa2(t));
						l3.setText(GUIKontroler.stringUkupanZa3(t));
						l33.setText(GUIKontroler.stringPogodjenZa3(t));
						a.setText(GUIKontroler.stringProsecanBrAsis(t));
						s.setText(GUIKontroler.stringProsecanBrSkok(t));
						i.setText(GUIKontroler.stringProsecanBrIzgu(t));
						u.setText(GUIKontroler.stringProsecanBrUkra(t));
						b.setText(GUIKontroler.stringProsecanBrBlok(t));
						f.setText(GUIKontroler.stringProsecanBrFaul(t));
						GUIKontroler.podesi(l11.getText(),l1.getText(),progressBar_1,l22.getText(),l2.getText(),progressBar_2,l33.getText(),l3.getText(),progressBar);
					} catch (RuntimeException e) {
						GUIKontroler.prikaziDijalogGreskeNemaUtakmica();
					}
					
					}
		});
		btn.setBounds(169, 25, 60, 42);
		getContentPane().add(btn);

		
		
		
			}
}