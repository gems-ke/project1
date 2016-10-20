package main;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

/**
 * Get Access to get/set methods of the project.
 * All variables must be declared private.
 *
 */
public class MainDataProvider {	
	// ---------- Variable Declaration/Definition ---------- //
	
	//Definition of the view container
	private Panel mainPanel;
	
	//Definition of the tab panel1
	private Panel tabPanel1; 
	
	//Definition of the tab panel2
	private Panel tabPanel2;
	
	//Frame Object for the view
	private JFrame frame;
	
	//Context Menu
	private JMenuItem menuItem;
	
	//Simple MenuBar
	private JMenuBar menuBar;
	
	//The SubMenu itself
	private JMenu submenu;
	
	//The Menu itself
	private JMenu menu;
	
	//Tabbed GUI Panes
	private JTabbedPane tabbedPane;

	// ---------- Get Declarations/Definition ---------- //
	
	/**
	 * Get the newest panel container for the view stuff
	 * @return the panel container object for the view/ui
	 */
	public Panel getPanel(){
		return this.mainPanel;
	}
	
	public Panel getTabPanel1(){
		return this.tabPanel1;
	}
	
	public Panel getTabPanel2(){
		return this.tabPanel2;
	}
	
	/**
	 * Get the newest panel frame for the view stuff
	 * @return the panel frame object for the view/ui
	 */
	public JFrame getFrame(){
		return this.frame;
	}
	
	public JMenuItem getMenuItem(){
		return this.menuItem;
	}
	
	public JMenu getMenu(){
		return this.menu;
	}
	
	public JMenuBar getMenuBar(){
		return this.menuBar;
	}
	
	public JMenu getSubMenu(){
		return this.submenu;
	}
	
	public JTabbedPane getTabbedPane(){
		return this.tabbedPane;
	}
	
	// ---------- Set Declarations/Definition ---------- //
	
	/**
	 * Sets a new panel container for the java window view
	 * @param panel the new container panel object
	 */
	public void setPanel(Panel panel){
		this.mainPanel = panel;
	}
	
	public void setTabPanel1(Panel panel){
		this.tabPanel1 = panel;
	}
	
	public void setTabPanel2(Panel panel){
		this.tabPanel2 = panel;
	}
	
	/**
	 * Sets a new JFrame Object
	 * @param mainPanel the new JFrame object
	 */
	public void setFrame(JFrame frame){
		this.frame = frame;
	}
	
	public void setMenuItem(JMenuItem menu){
		this.menuItem = menu;
	}
	
	public void setMenu(JMenu menu){
		this.menu = menu;
	}
	
	public void setSubMenu(JMenu menu){
		this.menu = menu;
	}
	
	public void setMenuBar(JMenuBar menu){
		this.menuBar = menu;
	}
	
	public void setTabbedPane(JTabbedPane pane){
		this.tabbedPane = pane;
	}
	
	// ---------- Graph Panel Information Variables ---------- //
	
	/**
	 * All nessecary global Variables for Graphhandling
	 */
	
	private String unit = "g/l";
	private int scale = 100;
	private String operationParameter = new String("brom");
	private int massScale = 1;
	private float sollS = 80f;
	private float sollE = 415f;
	private float eingriffS = 140f;
	private float eingriffE = 365f;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public String getOperationParameter() {
		return operationParameter;
	}

	public void setOperationParameter(String operationParameter) {
		this.operationParameter = operationParameter;
	}

	public int getMassScale() {
		return massScale;
	}

	public void setMassScale(int massScale) {
		this.massScale = massScale;
	}

	public float getSollS() {
		return sollS;
	}

	public void setSollS(float sollS) {
		this.sollS = sollS;
	}

	public float getSollE() {
		return sollE;
	}

	public void setSollE(float sollE) {
		this.sollE = sollE;
	}

	public float getEingriffS() {
		return eingriffS;
	}

	public void setEingriffS(float eingriffS) {
		this.eingriffS = eingriffS;
	}

	public float getEingriffE() {
		return eingriffE;
	}

	public void setEingriffE(float eingriffE) {
		this.eingriffE = eingriffE;
	}
	
	
	
}
