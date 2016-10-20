package main;

import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;

import datagraph.DataGraphProvider;
import graphPanel.PanelManager;
import main.Main;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;

public class Main extends JFrame {

	private static JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JLabel lblBis;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JLabel lblMessbezeichnung;
	static JTextField textField_7;
	private static JLabel label;
	static JTextField textField_8;
	private static JLabel lblSollbereich;
	static JTextField textField_9;
	static JTextField textField_10;
	private static JLabel label_1;
	private static JTabbedPane tabbedPane;
	private static JTabbedPane tabbedPane_1;
	private static JTabbedPane tabbedPane_2;
	private static JLabel label_2;
	private static JMenu mnEinstellungen;
	private static JMenu mnHilfe;
	static JPanel panel_2;
	private static JPanel panel_3;
	
	/**
	 * Create static object for only 1 usage of data stuff
	 */
	public static MainDataProvider dataProvider = new MainDataProvider();
	public static DataGraphProvider dataGraphProvider = new DataGraphProvider();

	static JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	
	private static String strDirectory = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/galvaLog.txt";
	private static String defaultSave = "log Start" + System.getProperty("line.separator") + "name" + System.getProperty("line.separator") + "chlor" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "kg" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "120" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "10-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "chlor" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "kg" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "180" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "13-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "chlor" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "kg" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "90" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "16-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "chlor" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "kg" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "160" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "25-10-2016" + System.getProperty("line.separator") +
																							"name" + System.getProperty("line.separator") + "chlor" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "kg" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "150" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "31-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "chlor" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "kg" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "135" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "5-11-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "450" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "17-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "500" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "18-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "380" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "20-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "510" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "25-10-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "320" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "5-11-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "570" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "16-11-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "440" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "18-11-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "330" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "19-11-2016" + System.getProperty("line.separator") + 
																							"name" + System.getProperty("line.separator") + "brom" + System.getProperty("line.separator") + "unit" + System.getProperty("line.separator") + "ml" + System.getProperty("line.separator") + "value" + System.getProperty("line.separator") + "480" + System.getProperty("line.separator") + "date" + System.getProperty("line.separator") + "25-11-2016" + System.getProperty("line.separator") + 
																							"";
	
	public static void main(String[] args) {
		
		File Pfile = new File(strDirectory);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(Pfile), "utf-8"))) {
	   writer.write(defaultSave);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {		
		//Setup First Content
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 661);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//Menu Bar Content	
		dataProvider.setMenuBar(new JMenuBar());	
		setJMenuBar(dataProvider.getMenuBar());
		
		JMenu mnDatei = new JMenu("Datei");
		dataProvider.getMenuBar().add(mnDatei);	
		mnEinstellungen = new JMenu("Einstellungen");
		
		dataProvider.getMenuBar().add(mnEinstellungen);	
		mnHilfe = new JMenu("Hilfe");
		dataProvider.getMenuBar().add(mnHilfe);
		
		//Panel Content
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Tabbed Panes Content	
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1344, 632);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("DataGraph", null, panel, null);
		panel.setLayout(null);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), 
				"Einstellungen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 292, 284);
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
		
		comboBox = new JComboBox(dataGraphProvider.getListEntries());
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
		
		JButton btnNewButton = new JButton("Aktualisieren");
		btnNewButton.setBounds(81, 250, 112, 23);
		btnNewButton.addActionListener(new buttonClick()); 
		panel_1.add(btnNewButton);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Graph", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(312, 11, 1020, 570);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		PanelManager panelManager = new PanelManager();
		panelManager.setBounds(10, 21, 1000, 549);
		panel_2.add(panelManager);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Messinformation", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 306, 292, 275);
		panel.add(panel_4);
		panel_4.setLayout(null);
	}
	
}
