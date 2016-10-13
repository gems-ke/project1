package gui;

import datagraph.DataGraphProvider;

/**
 * Callback Main class
 *
 */
public class Main{
	/**
	 * Create static object for only 1 usage of data stuff
	 */
	public static GuiDataProvider dataProvider = new GuiDataProvider();
	public static DataGraphProvider dataGraphProvider = new DataGraphProvider();
	/**
	 * Callback Main method
	 * @param args argument parameter
	 */
	public static void main(String[]args){
		//Call the UI Class that handles all the view stuff
		new View();
	}
}