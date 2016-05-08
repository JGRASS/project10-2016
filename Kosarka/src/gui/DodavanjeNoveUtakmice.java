package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import klase.Liga;
import klase.Statistika;
import klase.Tim;
import klase.Utakmica;

import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;

/**
 * 
 * @author Ilija Pavlovic
 * 
 * */

public class DodavanjeNoveUtakmice extends JFrame {

	private JPanel contentPane;
	private JPanel southPanel;
	private JPanel westPanel;
	private JPanel centralPanel;
	private JPanel northPanel;
	private JButton btnPotvrdiUnos;
	private JButton btnOdustani;
	private JLabel lblOdaberite;
	private JLabel lblDomacin;
	private JComboBox comboBoxDomaci;
	private JLabel lblGost;
	private JComboBox comboBoxGosti;
	private JButton btnPotvrdiIzbor;
	private JLabel lblEkipeMorajuBiti;
	private JTextField textFieldDomaci;
	private JTextField textFieldGosti;
	private JLabel lblStatistika;
	private JLabel lblPogodjenaSlobodna;
	private JSpinner spinnerPogSlobodnaDom;
	private JSpinner spinnerPogSlobodnaGos;
	private JLabel lblBrojSlobodnih;
	private JSpinner spinnerBrSlobodnihDom;
	private JSpinner spinnerBrSlobodnihGos;
	private JLabel lblPogodjeneDvojke;
	private JSpinner spinnerPogDvojkeDom;
	private JSpinner spinnerPogDvojkeGos;
	private JLabel lblBrSutevaZa;
	private JSpinner spinnerBrSutevaZaDvaDom;
	private JSpinner spinnerBrSutevaZaDvaGos;
	private JLabel lblPogodjeneTrojke;
	private JSpinner spinnerPogTrojkeDom;
	private JSpinner spinnerPogTrojkeGos;
	private JLabel lblBrojSutevaZa;
	private JSpinner spinnerSkokoviDom;
	private JSpinner spinnerSkokoviGos;
	private JLabel lblAsistencije;
	private JSpinner spinnerAsistencijeDom;
	private JSpinner spinnerAsistencijeGos;
	private JLabel lblIzgubljeneLopte;
	private JSpinner spinnerIzgubljeneDom;
	private JSpinner spinnerIzgubljeneGos;
	private JLabel lblOduzeteLopte;
	private JSpinner spinnerOduzeteDom;
	private JSpinner spinnerOduzeteGos;
	private JLabel lblNapravljeneBlokade;
	private JSpinner spinnerBlokadeDom;
	private JSpinner spinnerBlokadeGos;
	private JLabel lblNapravljeniFaulovi;
	private JSpinner spinnerFauloviDom;
	private JSpinner spinnerFauloviGos;
	private JLabel lblBrojSutevaZa_1;
	private JSpinner spinnerBrSutevaZaTriDom;
	private JSpinner spinnerBrSutevaZaTriGos;

	/**
	 * Create the frame.
	 */
	public DodavanjeNoveUtakmice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodavanjeNoveUtakmice.class.getResource("/ikona/Basketball.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			/**
			 * Zatvaranje prozora ne zatvara celu aplikaciju.
			 * @return void
			 */
			public void windowClosing(WindowEvent arg0) {
				if(GUIKontroler.daLiSteSigurniDaZeliteDaOdustanete() == JOptionPane.YES_OPTION){
					dispose();
				}
			}
		});
		setResizable(false);
		setMinimumSize(new Dimension(600, 500));
		setTitle("Dodavanje nove utakmice");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getWestPanel(), BorderLayout.WEST);
		contentPane.add(getCentralPanel(), BorderLayout.CENTER);
		contentPane.add(getNorthPanel(), BorderLayout.NORTH);
	}

	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.add(getBtnPotvrdiUnos());
			southPanel.add(getBtnOdustani());
		}
		return southPanel;
	}
	private JPanel getWestPanel() {
		if (westPanel == null) {
			westPanel = new JPanel();
			westPanel.setPreferredSize(new Dimension(150, 10));
			westPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			westPanel.add(getLblDomacin());
			westPanel.add(getComboBoxDomaci());
			westPanel.add(getLblGost());
			westPanel.add(getComboBoxGosti());
			westPanel.add(getBtnPotvrdiIzbor());
			westPanel.add(getLblEkipeMorajuBiti());
			westPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
		}
		return westPanel;
	}
	private JPanel getCentralPanel() {
		if (centralPanel == null) {
			centralPanel = new JPanel();
			centralPanel.setLayout(null);
			centralPanel.add(getLabel_4());
			centralPanel.add(getTextFieldDomaci());
			centralPanel.add(getTextFieldGosti());
			centralPanel.add(getLblPogodjenaSlobodna());
			centralPanel.add(getSpinnerPogSlobodnaDom());
			centralPanel.add(getSpinnerPogSlobodnaGos());
			centralPanel.add(getLblBrojSlobodnih());
			centralPanel.add(getSpinnerBrSlobodnihDom());
			centralPanel.add(getSpinnerBrSlobodnihGos());
			centralPanel.add(getLblPogodjeneDvojke());
			centralPanel.add(getSpinnerPogDvojkeDom());
			centralPanel.add(getSpinnerPogDvojkeGos());
			centralPanel.add(getLblBrSutevaZa());
			centralPanel.add(getSpinnerBrSutevaZaDvaDom());
			centralPanel.add(getSpinnerBrSutevaZaDvaGos());
			centralPanel.add(getLblPogodjeneTrojke());
			centralPanel.add(getSpinnerPogTrojkeDom());
			centralPanel.add(getSpinnerPogTrojkeGos());
			centralPanel.add(getLabel_4_1());
			centralPanel.add(getSpinnerSkokoviDom());
			centralPanel.add(getSpinnerSkokoviGos());
			centralPanel.add(getLblAsistencije());
			centralPanel.add(getSpinnerAsistencijeDom());
			centralPanel.add(getSpinnerAsistencijeGos());
			centralPanel.add(getLblIzgubljeneLopte());
			centralPanel.add(getSpinnerIzgubljeneDom());
			centralPanel.add(getSpinnerIzgubljeneGos());
			centralPanel.add(getLblOduzeteLopte());
			centralPanel.add(getSpinnerOduzeteDom());
			centralPanel.add(getSpinnerOduzeteGos());
			centralPanel.add(getLblNapravljeneBlokade());
			centralPanel.add(getSpinnerBlokadeDom());
			centralPanel.add(getSpinnerBlokadeGos());
			centralPanel.add(getLabel_4_2());
			centralPanel.add(getSpinnerFauloviDom());
			centralPanel.add(getSpinnerFauloviGos());
			centralPanel.add(getLblBrojSutevaZa_1());
			centralPanel.add(getSpinnerBrSutevaZaTriDom());
			centralPanel.add(getSpinnerBrSutevaZaTriGos());
			centralPanel.setVisible(false);
		}
		return centralPanel;
	}
	private JPanel getNorthPanel() {
		if (northPanel == null) {
			northPanel = new JPanel();
			northPanel.add(getLblOdaberite());
		}
		return northPanel;
	}
	
	/**
	 * Unosenje funkcija koje bi trebalo da se obave naon pritiska na dugme "Potvrdi iznos" i sama velicina i oblik dugmeta.
	 * @return JButton
	 */
	private JButton getBtnPotvrdiUnos() {
		if (btnPotvrdiUnos == null) {
			btnPotvrdiUnos = new JButton("Potvrdi unos");
			btnPotvrdiUnos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIKontroler.dodajUtakmicu((Integer) spinnerPogSlobodnaDom.getValue(), 
							(Integer) spinnerPogSlobodnaGos.getValue(), 
							(Integer) spinnerBrSlobodnihDom.getValue(),(Integer) spinnerBrSlobodnihGos.getValue(), 
							(Integer) spinnerPogDvojkeDom.getValue(), (Integer) spinnerPogDvojkeGos.getValue(), 
							(Integer) spinnerBrSutevaZaDvaDom.getValue(),(Integer) spinnerBrSutevaZaDvaGos.getValue(),
							(Integer) spinnerPogTrojkeDom.getValue(),(Integer) spinnerPogTrojkeGos.getValue(),
							(Integer) spinnerBrSutevaZaTriDom.getValue(),(Integer) spinnerBrSutevaZaTriGos.getValue(),
							(Integer) spinnerSkokoviDom.getValue(),(Integer) spinnerSkokoviGos.getValue(),
							(Integer) spinnerOduzeteDom.getValue(),(Integer) spinnerOduzeteGos.getValue(),
							(Integer) spinnerIzgubljeneDom.getValue(),(Integer) spinnerIzgubljeneGos.getValue(),
							(Integer) spinnerAsistencijeDom.getValue(),(Integer) spinnerAsistencijeDom.getValue(),
							(Integer) spinnerBlokadeDom.getValue(),(Integer) spinnerBlokadeGos.getValue(),
							(Integer) spinnerFauloviDom.getValue(),(Integer) spinnerFauloviGos.getValue(),
							(Tim) comboBoxDomaci.getSelectedItem(),(Tim) comboBoxGosti.getSelectedItem());
					
			
					
					GUIKontroler.upisiUDatoteku();
					
					dispose();
					
					GUIKontroler.prikaziInfoProzorZaUspesanUnosUtakmice((Tim) comboBoxDomaci.getSelectedItem(),
							(Tim) comboBoxGosti.getSelectedItem());
					
				}
			});
			btnPotvrdiUnos.setSize(new Dimension(118, 23));
			btnPotvrdiUnos.setMaximumSize(new Dimension(118, 23));
			btnPotvrdiUnos.setMinimumSize(new Dimension(118, 23));
			btnPotvrdiUnos.setPreferredSize(new Dimension(118, 23));
			btnPotvrdiUnos.setVisible(false);
		}
		return btnPotvrdiUnos;
	}
	/**
	 * Unosenje funkcija koje bi trebalo da se obave naon pritiska na dugme "Potvrdi iznos" i sama velicina i oblik dugmeta.
	 * @return JButton
	 */
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setSize(new Dimension(118, 23));
			btnOdustani.setMaximumSize(new Dimension(118, 23));
			btnOdustani.setMinimumSize(new Dimension(118, 23));
			btnOdustani.setPreferredSize(new Dimension(118, 23));
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(GUIKontroler.daLiSteSigurniDaZeliteDaOdustanete() == JOptionPane.YES_OPTION){
						dispose();
					}
				}
			});
		}
		return btnOdustani;
	}
	private JLabel getLblOdaberite() {
		if (lblOdaberite == null) {
			lblOdaberite = new JLabel("Odaberite domacu i gostujucu ekipu");
		}
		return lblOdaberite;
	}
	private JLabel getLblDomacin() {
		if (lblDomacin == null) {
			lblDomacin = new JLabel("Domacin");
		}
		return lblDomacin;
	}
	/**
	 * Definisanje Combo Box-a svih NBA ekipa i njegovo popunjavanje.
	 * @return JComboBox
	 */
	private JComboBox getComboBoxDomaci() {
		if (comboBoxDomaci == null) {
			comboBoxDomaci = new JComboBox<Tim>();
			GUIKontroler.popuniComboBox(comboBoxDomaci);
			comboBoxDomaci.setPreferredSize(new Dimension(130, 20));
		}
		return comboBoxDomaci;
	}
	private JLabel getLblGost() {
		if (lblGost == null) {
			lblGost = new JLabel("Gost");
		}
		return lblGost;
	}
	/**
	 * Definisanje Combo Box-a svih NBA ekipa i njegovo popunjavanje.
	 * @return JComboBox
	 */
	private JComboBox getComboBoxGosti() {
		if (comboBoxGosti == null) {
			comboBoxGosti = new JComboBox<Tim>();
			GUIKontroler.popuniComboBox(comboBoxGosti);
			comboBoxGosti.setPreferredSize(new Dimension(130, 20));
		}
		return comboBoxGosti;
	}
	/**
	 * Dugme za potvrdu izbora dveju razlicitih ekipa.
	 * @return JButton
	 */
	private JButton getBtnPotvrdiIzbor() {
		if (btnPotvrdiIzbor == null) {
			btnPotvrdiIzbor = new JButton("Potvrdi izbor");
			btnPotvrdiIzbor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(comboBoxDomaci.getSelectedIndex() == comboBoxGosti.getSelectedIndex()){
						lblEkipeMorajuBiti.setVisible(true);
					}else{
						centralPanel.setVisible(true);
						btnPotvrdiUnos.setVisible(true);
						btnPotvrdiIzbor.setVisible(false);
						lblOdaberite.setVisible(false);
						lblEkipeMorajuBiti.setVisible(false);
						comboBoxDomaci.setEnabled(false);
						comboBoxGosti.setEnabled(false);
						textFieldDomaci.setText(comboBoxDomaci.getSelectedItem().toString());
						textFieldGosti.setText(comboBoxGosti.getSelectedItem().toString());
					}
				}
			});
		}
		return btnPotvrdiIzbor;
	}
	/**
	 * Obavestenej da unesene ekipe moraju biti razlicite.
	 * @return JLabel
	 */
	private JLabel getLblEkipeMorajuBiti() {
		if (lblEkipeMorajuBiti == null) {
			lblEkipeMorajuBiti = new JLabel("Ekipe moraju biti razlicite!");
			lblEkipeMorajuBiti.setPreferredSize(new Dimension(150, 14));
			lblEkipeMorajuBiti.setVisible(false);
		}
		return lblEkipeMorajuBiti;
	}
	private JTextField getTextFieldDomaci() {
		if (textFieldDomaci == null) {
			textFieldDomaci = new JTextField();
			textFieldDomaci.setBounds(150, 5, 120, 20);
			textFieldDomaci.setPreferredSize(new Dimension(120, 20));
			textFieldDomaci.setMinimumSize(new Dimension(50, 20));
			textFieldDomaci.setMaximumSize(new Dimension(100, 20));
			textFieldDomaci.setEditable(false);
		}
		return textFieldDomaci;
	}
	private JTextField getTextFieldGosti() {
		if (textFieldGosti == null) {
			textFieldGosti = new JTextField();
			textFieldGosti.setBounds(280, 5, 120, 20);
			textFieldGosti.setPreferredSize(new Dimension(120, 20));
			textFieldGosti.setMaximumSize(new Dimension(50, 20));
			textFieldGosti.setEditable(false);
		}
		return textFieldGosti;
	}
	private JLabel getLabel_4() {
		if (lblStatistika == null) {
			lblStatistika = new JLabel("Statistika");
			lblStatistika.setBounds(10, 8, 129, 14);
			lblStatistika.setPreferredSize(new Dimension(80, 14));
			lblStatistika.setMaximumSize(new Dimension(100, 14));
		}
		return lblStatistika;
	}
	private JLabel getLblPogodjenaSlobodna() {
		if (lblPogodjenaSlobodna == null) {
			lblPogodjenaSlobodna = new JLabel("Pogodjena slobodna");
			lblPogodjenaSlobodna.setBounds(10, 33, 129, 14);
		}
		return lblPogodjenaSlobodna;
	}
	private JSpinner getSpinnerPogSlobodnaDom() {
		if (spinnerPogSlobodnaDom == null) {
			spinnerPogSlobodnaDom = new JSpinner();
			spinnerPogSlobodnaDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerPogSlobodnaDom.setBounds(150, 30, 120, 20);
		}
		return spinnerPogSlobodnaDom;
	}
	private JSpinner getSpinnerPogSlobodnaGos() {
		if (spinnerPogSlobodnaGos == null) {
			spinnerPogSlobodnaGos = new JSpinner();
			spinnerPogSlobodnaGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerPogSlobodnaGos.setBounds(280, 30, 120, 20);
		}
		return spinnerPogSlobodnaGos;
	}
	private JLabel getLblBrojSlobodnih() {
		if (lblBrojSlobodnih == null) {
			lblBrojSlobodnih = new JLabel("Broj slobodnih");
			lblBrojSlobodnih.setBounds(10, 59, 129, 14);
		}
		return lblBrojSlobodnih;
	}
	private JSpinner getSpinnerBrSlobodnihDom() {
		if (spinnerBrSlobodnihDom == null) {
			spinnerBrSlobodnihDom = new JSpinner();
			spinnerBrSlobodnihDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerBrSlobodnihDom.setBounds(150, 56, 120, 20);
		}
		return spinnerBrSlobodnihDom;
	}
	private JSpinner getSpinnerBrSlobodnihGos() {
		if (spinnerBrSlobodnihGos == null) {
			spinnerBrSlobodnihGos = new JSpinner();
			spinnerBrSlobodnihGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerBrSlobodnihGos.setBounds(280, 56, 120, 20);
		}
		return spinnerBrSlobodnihGos;
	}
	private JLabel getLblPogodjeneDvojke() {
		if (lblPogodjeneDvojke == null) {
			lblPogodjeneDvojke = new JLabel("Pogodjene dvojke");
			lblPogodjeneDvojke.setBounds(10, 87, 129, 14);
		}
		return lblPogodjeneDvojke;
	}
	private JSpinner getSpinnerPogDvojkeDom() {
		if (spinnerPogDvojkeDom == null) {
			spinnerPogDvojkeDom = new JSpinner();
			spinnerPogDvojkeDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerPogDvojkeDom.setBounds(150, 84, 120, 20);
		}
		return spinnerPogDvojkeDom;
	}
	private JSpinner getSpinnerPogDvojkeGos() {
		if (spinnerPogDvojkeGos == null) {
			spinnerPogDvojkeGos = new JSpinner();
			spinnerPogDvojkeGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerPogDvojkeGos.setBounds(280, 84, 120, 20);
		}
		return spinnerPogDvojkeGos;
	}
	private JLabel getLblBrSutevaZa() {
		if (lblBrSutevaZa == null) {
			lblBrSutevaZa = new JLabel("Broj suteva za dva");
			lblBrSutevaZa.setBounds(10, 115, 129, 14);
		}
		return lblBrSutevaZa;
	}
	private JSpinner getSpinnerBrSutevaZaDvaDom() {
		if (spinnerBrSutevaZaDvaDom == null) {
			spinnerBrSutevaZaDvaDom = new JSpinner();
			spinnerBrSutevaZaDvaDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerBrSutevaZaDvaDom.setBounds(150, 112, 120, 20);
		}
		return spinnerBrSutevaZaDvaDom;
	}
	private JSpinner getSpinnerBrSutevaZaDvaGos() {
		if (spinnerBrSutevaZaDvaGos == null) {
			spinnerBrSutevaZaDvaGos = new JSpinner();
			spinnerBrSutevaZaDvaGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerBrSutevaZaDvaGos.setBounds(280, 112, 120, 20);
		}
		return spinnerBrSutevaZaDvaGos;
	}
	private JLabel getLblPogodjeneTrojke() {
		if (lblPogodjeneTrojke == null) {
			lblPogodjeneTrojke = new JLabel("Pogodjene trojke");
			lblPogodjeneTrojke.setBounds(10, 143, 129, 14);
		}
		return lblPogodjeneTrojke;
	}
	private JSpinner getSpinnerPogTrojkeDom() {
		if (spinnerPogTrojkeDom == null) {
			spinnerPogTrojkeDom = new JSpinner();
			spinnerPogTrojkeDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerPogTrojkeDom.setBounds(150, 140, 120, 20);
		}
		return spinnerPogTrojkeDom;
	}
	private JSpinner getSpinnerPogTrojkeGos() {
		if (spinnerPogTrojkeGos == null) {
			spinnerPogTrojkeGos = new JSpinner();
			spinnerPogTrojkeGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerPogTrojkeGos.setBounds(280, 140, 120, 20);
		}
		return spinnerPogTrojkeGos;
	}
	private JLabel getLabel_4_1() {
		if (lblBrojSutevaZa == null) {
			lblBrojSutevaZa = new JLabel("Skokovi");
			lblBrojSutevaZa.setBounds(10, 199, 129, 14);
		}
		return lblBrojSutevaZa;
	}
	private JSpinner getSpinnerSkokoviDom() {
		if (spinnerSkokoviDom == null) {
			spinnerSkokoviDom = new JSpinner();
			spinnerSkokoviDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerSkokoviDom.setBounds(150, 196, 120, 20);
		}
		return spinnerSkokoviDom;
	}
	private JSpinner getSpinnerSkokoviGos() {
		if (spinnerSkokoviGos == null) {
			spinnerSkokoviGos = new JSpinner();
			spinnerSkokoviGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerSkokoviGos.setBounds(280, 196, 120, 20);
		}
		return spinnerSkokoviGos;
	}
	private JLabel getLblAsistencije() {
		if (lblAsistencije == null) {
			lblAsistencije = new JLabel("Asistencije");
			lblAsistencije.setBounds(10, 227, 129, 14);
		}
		return lblAsistencije;
	}
	private JSpinner getSpinnerAsistencijeDom() {
		if (spinnerAsistencijeDom == null) {
			spinnerAsistencijeDom = new JSpinner();
			spinnerAsistencijeDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerAsistencijeDom.setBounds(150, 224, 120, 20);
		}
		return spinnerAsistencijeDom;
	}
	private JSpinner getSpinnerAsistencijeGos() {
		if (spinnerAsistencijeGos == null) {
			spinnerAsistencijeGos = new JSpinner();
			spinnerAsistencijeGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerAsistencijeGos.setBounds(280, 224, 120, 20);
		}
		return spinnerAsistencijeGos;
	}
	private JLabel getLblIzgubljeneLopte() {
		if (lblIzgubljeneLopte == null) {
			lblIzgubljeneLopte = new JLabel("Izgubljene lopte");
			lblIzgubljeneLopte.setBounds(10, 255, 129, 14);
		}
		return lblIzgubljeneLopte;
	}
	private JSpinner getSpinnerIzgubljeneDom() {
		if (spinnerIzgubljeneDom == null) {
			spinnerIzgubljeneDom = new JSpinner();
			spinnerIzgubljeneDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerIzgubljeneDom.setBounds(150, 252, 120, 20);
		}
		return spinnerIzgubljeneDom;
	}
	private JSpinner getSpinnerIzgubljeneGos() {
		if (spinnerIzgubljeneGos == null) {
			spinnerIzgubljeneGos = new JSpinner();
			spinnerIzgubljeneGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerIzgubljeneGos.setBounds(280, 252, 120, 20);
		}
		return spinnerIzgubljeneGos;
	}
	private JLabel getLblOduzeteLopte() {
		if (lblOduzeteLopte == null) {
			lblOduzeteLopte = new JLabel("Oduzete lopte");
			lblOduzeteLopte.setBounds(10, 283, 129, 14);
		}
		return lblOduzeteLopte;
	}
	private JSpinner getSpinnerOduzeteDom() {
		if (spinnerOduzeteDom == null) {
			spinnerOduzeteDom = new JSpinner();
			spinnerOduzeteDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerOduzeteDom.setBounds(150, 280, 120, 20);
		}
		return spinnerOduzeteDom;
	}
	private JSpinner getSpinnerOduzeteGos() {
		if (spinnerOduzeteGos == null) {
			spinnerOduzeteGos = new JSpinner();
			spinnerOduzeteGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerOduzeteGos.setBounds(280, 280, 120, 20);
		}
		return spinnerOduzeteGos;
	}
	private JLabel getLblNapravljeneBlokade() {
		if (lblNapravljeneBlokade == null) {
			lblNapravljeneBlokade = new JLabel("Napravljene blokade");
			lblNapravljeneBlokade.setBounds(10, 309, 129, 14);
		}
		return lblNapravljeneBlokade;
	}
	private JSpinner getSpinnerBlokadeDom() {
		if (spinnerBlokadeDom == null) {
			spinnerBlokadeDom = new JSpinner();
			spinnerBlokadeDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerBlokadeDom.setBounds(150, 306, 120, 20);
		}
		return spinnerBlokadeDom;
	}
	private JSpinner getSpinnerBlokadeGos() {
		if (spinnerBlokadeGos == null) {
			spinnerBlokadeGos = new JSpinner();
			spinnerBlokadeGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerBlokadeGos.setBounds(280, 306, 120, 20);
		}
		return spinnerBlokadeGos;
	}
	private JLabel getLabel_4_2() {
		if (lblNapravljeniFaulovi == null) {
			lblNapravljeniFaulovi = new JLabel("Napravljeni faulovi");
			lblNapravljeniFaulovi.setBounds(10, 335, 129, 14);
		}
		return lblNapravljeniFaulovi;
	}
	private JSpinner getSpinnerFauloviDom() {
		if (spinnerFauloviDom == null) {
			spinnerFauloviDom = new JSpinner();
			spinnerFauloviDom.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerFauloviDom.setBounds(150, 332, 120, 20);
		}
		return spinnerFauloviDom;
	}
	private JSpinner getSpinnerFauloviGos() {
		if (spinnerFauloviGos == null) {
			spinnerFauloviGos = new JSpinner();
			spinnerFauloviGos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerFauloviGos.setBounds(280, 332, 120, 20);
		}
		return spinnerFauloviGos;
	}
	private JLabel getLblBrojSutevaZa_1() {
		if (lblBrojSutevaZa_1 == null) {
			lblBrojSutevaZa_1 = new JLabel("Broj suteva za tri");
			lblBrojSutevaZa_1.setBounds(10, 171, 129, 14);
		}
		return lblBrojSutevaZa_1;
	}
	private JSpinner getSpinnerBrSutevaZaTriDom() {
		if (spinnerBrSutevaZaTriDom == null) {
			spinnerBrSutevaZaTriDom = new JSpinner();
			spinnerBrSutevaZaTriDom.setBounds(150, 168, 120, 20);
		}
		return spinnerBrSutevaZaTriDom;
	}
	private JSpinner getSpinnerBrSutevaZaTriGos() {
		if (spinnerBrSutevaZaTriGos == null) {
			spinnerBrSutevaZaTriGos = new JSpinner();
			spinnerBrSutevaZaTriGos.setBounds(280, 168, 120, 20);
		}
		return spinnerBrSutevaZaTriGos;
	}
}
