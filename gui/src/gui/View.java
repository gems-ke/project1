package gui;

import java.awt.Panel;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import datagraph.DataGraphProvider;
import datagraph.DataGraphView;
import main.Main; 

/**
 * Handles GUI and View Stuff of the Project, without variable
 * definitions and logical methods
 *
 */
public class View extends JFrame{
	/**
	 * Neccessary serial version frame id
	 */
	private static final long serialVersionUID = -541937045564913739L;
	
	/**
	 * Setup View Constructor
	 */
	public View(){
		
		//VIEW SETUP
		Main.dataProvider.setFrame(new JFrame("Software"));
		Main.dataProvider.setPanel(new Panel());
		Main.dataProvider.setMenuBar(new JMenuBar());
		Main.dataProvider.setMenu(new JMenu("Menü")) ;
		Main.dataProvider.setTabbedPane(new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT));
		Main.dataProvider.setTabPanel1(new Panel());
		Main.dataProvider.setTabPanel2(new Panel());
		
		//Call the other view constructor methods to get functional view stuff
		DataGraphView dataGraphView = new DataGraphView();
		
		//VIEW PREPARATIONS
		//First Menu Item
		Main.dataProvider.getMenu().setMnemonic(KeyEvent.VK_A);
		Main.dataProvider.getMenu().getAccessibleContext().setAccessibleDescription("FirstFirst");
		Main.dataProvider.getMenuBar().add(Main.dataProvider.getMenu());

		//FINAL VIEW STUFF
		Main.dataProvider.getTabbedPane().addTab("Graph", Main.dataProvider.getTabPanel1());
		Main.dataProvider.getTabbedPane().addTab("Einstellung", Main.dataProvider.getTabPanel2());
		Main.dataProvider.getFrame().setJMenuBar(Main.dataProvider.getMenuBar());
		Main.dataProvider.getFrame().add(Main.dataProvider.getTabbedPane());
		Main.dataProvider.getFrame().setSize(320, 270);
		Main.dataProvider.getFrame().setLocationRelativeTo(null);
		Main.dataProvider.getFrame().setVisible(true);
	}
}