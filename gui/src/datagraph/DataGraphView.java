package datagraph;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import main.Main;

public class DataGraphView {
	
	public DataGraphView(){
		
		//Initialisierung
		Main.dataGraphProvider.setWertSkalierungsFeld(new JTextField(16));
		Main.dataGraphProvider.setWertSkalierungText(new JLabel("Wertskalierung"));
		Main.dataGraphProvider.setZeitRaumText(new JLabel("Zeitraum"));
		Main.dataGraphProvider.setSeparator(new JLabel(" - "));
		Main.dataGraphProvider.setMessBezeichnungText(new JLabel("Messbezeichnung"));
		Main.dataGraphProvider.setList(new JComboBox<Object>(Main.dataGraphProvider.getListEntries()));
		Main.dataGraphProvider.setEingriffsbereichText( new JLabel("Eingriffsbereich"));
		Main.dataGraphProvider.setSollBereichText(new JLabel("Sollbereich         "));
		Main.dataGraphProvider.setBestaetigen(new JButton("Bestätigen"));

		//DATA SETUP
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getWertSkalierungText());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getWertSkalierungsFeld());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumText());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumAnfang()[0]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumAnfang()[1]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumAnfang()[2]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getSeparator());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumEnde()[0]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumEnde()[1]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getZeitRaumEnde()[2]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getMessBezeichnungText());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getList());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getEingriffsbereichText());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getEingriffsbereichFeld()[0]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getPath()[0]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getEingriffsbereichFeld()[1]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getSollBereichText());
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getSollbereichFeld()[0]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getPath()[1]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getSollbereichFeld()[1]);
		Main.dataProvider.getTabPanel1().add(Main.dataGraphProvider.getBestaetigen());
	}
}
