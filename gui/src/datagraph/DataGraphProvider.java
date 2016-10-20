package datagraph;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Get Access to get/set methods of the datagraph.
 * All variables must be declared private.
 */
public class DataGraphProvider {
	
	// ---------- Variable Declaration/Definition ---------- //
	//Textfeld f�r "WertSkalierung"
	JTextField wertSkalierungsFeld;
	
	//Textfeld f�r "Zeitraum - Anfang"
    JTextField []zeitRaumAnfang = new JTextField[3];
	
	//Textfeld f�r "Zeitraum - Ende"
    JTextField []zeitRaumEnde = new JTextField[3];
	
	//Text f�r "WertSkalierung"
	JLabel wertSkalierungText;
	
	//Text f�r "Zeitraum"
	JLabel zeitRaumText;
	
	//text f�r den "-" Separator
	JLabel separator;
	
	//Text f�r den "=>" Pfeil
	JLabel[] path = {new JLabel("=>"), new JLabel("=>")};
	
	//Text f�r "Messbezeichnung"
	JLabel messBezeichnungText;
	
	//Stringfeld f�r Listeneintr�ge; Zu definieren in der DataGraphView
	String[]listEntries = {"brom", "chlor"};
	
	//DropDown Men� f�r Werteliste anhand der listEntriegs (String)
	JComboBox<?> list;
	
	//Text f�r "Eingriffsbereich"
	JLabel eingriffsbereichText;
	
	//Textfeld f�r "Eingriffsbereich"
    JTextField []eingriffsbereichFeld = new JTextField[2];
	
	//Text f�r "Sollbereich"
	JLabel sollBereichText;
	
	//Textfeld f�r "Sollbereich"
	JTextField []sollbereichFeld = new JTextField[2];
	
	//Initialisierung des Aktualisierungs-Buttons
	JButton bestaetigen;
	
	// ---------- Get Declaration/Definition ---------- //
	
	//Constructor used to define array values
	public DataGraphProvider(){
		//VON
        zeitRaumAnfang[0] = new JTextField(2); //TAG
        zeitRaumAnfang[1] = new JTextField(2); //MONAT
        zeitRaumAnfang[2] = new JTextField(3); //JAHR
        
        //BIS
        zeitRaumEnde[0] = new JTextField(2); //TAG
        zeitRaumEnde[1] = new JTextField(2); //MONAT
        zeitRaumEnde[2] = new JTextField(3); //JAHR
       
        //Eingriffsbereich
        eingriffsbereichFeld[0] = new JTextField(7); //S
        eingriffsbereichFeld[1] = new JTextField(7); //E
       
        //Sollbereich
        sollbereichFeld[0] = new JTextField(7); //S
        sollbereichFeld[1] = new JTextField(7); //E
	}
	
	public JTextField getWertSkalierungsFeld(){
		return this.wertSkalierungsFeld;
	}
	
	public JTextField[] getZeitRaumAnfang(){
		return this.zeitRaumAnfang;
	}
	
	public JTextField[] getZeitRaumEnde(){
		return this.zeitRaumEnde;
	}
		
	public JTextField[] getEingriffsbereichFeld(){
		return this.eingriffsbereichFeld;
	}
	
	public JTextField[] getSollbereichFeld(){
		return this.sollbereichFeld;
	}
	
	public JLabel getWertSkalierungText(){
		return this.wertSkalierungText;
	}
	
	public JLabel getZeitRaumText(){
		return this.zeitRaumText;
	}
	
	public JLabel getSeparator(){
		return this.separator;
	}
	
	public JLabel[] getPath(){
		return this.path;
	}
	
	public JLabel getMessBezeichnungText(){
		return this.messBezeichnungText;
	}
	
	public JLabel getEingriffsbereichText(){
		return this.eingriffsbereichText;
	}
	
	public JLabel getSollBereichText(){
		return this.sollBereichText;
	}
	
	public JButton getBestaetigen(){
		return this.bestaetigen;
	}
	
	public String[] getListEntries(){
		return this.listEntries;
	}
	
	public JComboBox<?> getList(){
		return this.list;
	}
	
	
	// ---------- Set Declarations/Definition ---------- //

	public void setWertSkalierungsFeld(JTextField field){
		this.wertSkalierungsFeld = field;
	}
	
	public void setZeitRaumAnfang(JTextField... jTextField){
		this.zeitRaumAnfang = jTextField;
	}
	
	public void setZeitRaumEnde(JTextField... field){
		this.zeitRaumEnde = field;
	}
		
	public void setEingriffsbereichFeld(JTextField... field){
		this.eingriffsbereichFeld = field;
	}
	
	public void setSollbereichFeld(JTextField... field){
		this.sollbereichFeld = field;
	}
	
	public void setWertSkalierungText(JLabel label){
		this.wertSkalierungText = label;
	}
	
	public void setZeitRaumText(JLabel label){
		this.zeitRaumText = label;
	}
	
	public void setSeparator(JLabel label){
		this.separator = label;
	}
	
	public void setPath(JLabel[] label){
		this.path = label;
	}
	
	public void setMessBezeichnungText(JLabel label){
		this.messBezeichnungText = label;
	}
	
	public void setEingriffsbereichText(JLabel label){
		this.eingriffsbereichText = label;
	}
	
	public void setSollBereichText(JLabel label){
		this.sollBereichText = label;
	}
	
	public void setBestaetigen(JButton button){
		this.bestaetigen = button;
	}
	
	public void setListEntries(String... listEntries){
		this.listEntries = listEntries;
	}
	
	public void setList(JComboBox<?> box){
		this.list = box;
	}
}