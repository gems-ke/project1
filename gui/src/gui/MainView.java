package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import java.awt.Color;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblBis;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblMessbezeichnung;
	private JTextField textField_7;
	private JLabel label;
	private JTextField textField_8;
	private JLabel lblSollbereich;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel label_1;
	private JTabbedPane tabbedPane;
	private JTabbedPane tabbedPane_1;
	private JTabbedPane tabbedPane_2;
	private JLabel label_2;
	private JMenu mnEinstellungen;
	private JMenu mnHilfe;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		mnEinstellungen = new JMenu("Einstellungen");
		menuBar.add(mnEinstellungen);
		
		mnHilfe = new JMenu("Hilfe");
		menuBar.add(mnHilfe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 972, 540);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("DataGraph", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Einstellungen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 292, 243);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		label_2 = new JLabel("Wertskalierung");
		label_2.setBounds(24, 32, 100, 14);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(120, 29, 157, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblZeitraum = new JLabel("Zeitraum");
		lblZeitraum.setBounds(24, 57, 100, 26);
		panel_1.add(lblZeitraum);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 78, 30, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(64, 78, 30, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 78, 30, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		lblBis = new JLabel("bis");
		lblBis.setBounds(143, 81, 46, 14);
		panel_1.add(lblBis);
		
		textField_4 = new JTextField();
		textField_4.setBounds(167, 78, 30, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(207, 78, 30, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(247, 78, 30, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		lblMessbezeichnung = new JLabel("Messbezeichnung");
		lblMessbezeichnung.setBounds(24, 113, 112, 20);
		panel_1.add(lblMessbezeichnung);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 113, 124, 20);
		panel_1.add(comboBox);
		
		JLabel lblEingriffsbereich = new JLabel("Eingriffsbereich");
		lblEingriffsbereich.setBounds(24, 144, 92, 26);
		panel_1.add(lblEingriffsbereich);
		
		textField_8 = new JTextField();
		textField_8.setBounds(24, 166, 92, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		label = new JLabel("=>");
		label.setBounds(137, 169, 40, 14);
		panel_1.add(label);
		
		textField_7 = new JTextField();
		textField_7.setBounds(176, 166, 101, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		lblSollbereich = new JLabel("Sollbereich");
		lblSollbereich.setBounds(24, 197, 72, 14);
		panel_1.add(lblSollbereich);
		
		textField_9 = new JTextField();
		textField_9.setBounds(24, 212, 92, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(176, 212, 101, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		label_1 = new JLabel("=>");
		label_1.setBounds(137, 215, 30, 14);
		panel_1.add(label_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Graph", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(312, 11, 655, 501);
		panel.add(panel_2);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Funktion2", null, tabbedPane_1, null);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Funktion3", null, tabbedPane_2, null);
	}
}
