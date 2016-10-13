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
	//Textfeld für "WertSkalierung"
	JTextField wertSkalierungsFeld;
	
	//Textfeld für "Zeitraum - Anfang"
    JTextField []zeitRaumAnfang = new JTextField[3];
	
	//Textfeld für "Zeitraum - Ende"
    JTextField []zeitRaumEnde = new JTextField[3];
	
	//Text für "WertSkalierung"
	JLabel wertSkalierungText;
	
	//Text für "Zeitraum"
	JLabel zeitRaumText;
	
	//text für den "-" Separator
	JLabel separator;
	
	//Text für den "=>" Pfeil
	JLabel[] path = {new JLabel("=>"), new JLabel("=>")};
	
	//Text für "Messbezeichnung"
	JLabel messBezeichnungText;
	
	//Stringfeld für Listeneinträge; Zu definieren in der DataGraphView
	String[]listEntries = {"Testeintrag1", "Entry2", "Entry3", "Entry4", "Entry5"};
	
	//DropDown Menü für Werteliste anhand der listEntriegs (String)
	JComboBox<?> list;
	
	//Text für "Eingriffsbereich"
	JLabel eingriffsbereichText;
	
	//Textfeld für "Eingriffsbereich"
    JTextField []eingriffsbereichFeld = new JTextField[2];
	
	//Text für "Sollbereich"
	JLabel sollBereichText;
	
	//Textfeld für "Sollbereich"
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
        eingriffsbereichFeld[0] = new JTextField(7); //MONAT
        eingriffsbereichFeld[1] = new JTextField(7); //JAHR
       
        //Sollbereich
        sollbereichFeld[0] = new JTextField(7); //MONAT
        sollbereichFeld[1] = new JTextField(7); //JAHR
	}
	
	protected JTextField getWertSkalierungsFeld(){
		return this.wertSkalierungsFeld;
	}
	
	protected JTextField[] getZeitRaumAnfang(){
		return this.zeitRaumAnfang;
	}
	
	protected JTextField[] getZeitRaumEnde(){
		return this.zeitRaumEnde;
	}
		
	protected JTextField[] getEingriffsbereichFeld(){
		return this.eingriffsbereichFeld;
	}
	
	protected JTextField[] getSollbereichFeld(){
		return this.sollbereichFeld;
	}
	
	protected JLabel getWertSkalierungText(){
		return this.wertSkalierungText;
	}
	
	protected JLabel getZeitRaumText(){
		return this.zeitRaumText;
	}
	
	protected JLabel getSeparator(){
		return this.separator;
	}
	
	protected JLabel[] getPath(){
		return this.path;
	}
	
	protected JLabel getMessBezeichnungText(){
		return this.messBezeichnungText;
	}
	
	protected JLabel getEingriffsbereichText(){
		return this.eingriffsbereichText;
	}
	
	protected JLabel getSollBereichText(){
		return this.sollBereichText;
	}
	
	protected JButton getBestaetigen(){
		return this.bestaetigen;
	}
	
	protected String[] getListEntries(){
		return this.listEntries;
	}
	
	protected JComboBox<?> getList(){
		return this.list;
	}
	
	
	// ---------- Set Declarations/Definition ---------- //

	protected void setWertSkalierungsFeld(JTextField field){
		this.wertSkalierungsFeld = field;
	}
	
	public void setZeitRaumAnfang(JTextField... jTextField){
		this.zeitRaumAnfang = jTextField;
	}
	
	protected void setZeitRaumEnde(JTextField... field){
		this.zeitRaumEnde = field;
	}
		
	protected void setEingriffsbereichFeld(JTextField... field){
		this.eingriffsbereichFeld = field;
	}
	
	protected void setSollbereichFeld(JTextField... field){
		this.sollbereichFeld = field;
	}
	
	protected void setWertSkalierungText(JLabel label){
		this.wertSkalierungText = label;
	}
	
	protected void setZeitRaumText(JLabel label){
		this.zeitRaumText = label;
	}
	
	protected void setSeparator(JLabel label){
		this.separator = label;
	}
	
	protected void setPath(JLabel[] label){
		this.path = label;
	}
	
	protected void setMessBezeichnungText(JLabel label){
		this.messBezeichnungText = label;
	}
	
	protected void setEingriffsbereichText(JLabel label){
		this.eingriffsbereichText = label;
	}
	
	protected void setSollBereichText(JLabel label){
		this.sollBereichText = label;
	}
	
	protected void setBestaetigen(JButton button){
		this.bestaetigen = button;
	}
	
	protected void setListEntries(String... listEntries){
		this.listEntries = listEntries;
	}
	
	protected void setList(JComboBox<?> box){
		this.list = box;
	}
}