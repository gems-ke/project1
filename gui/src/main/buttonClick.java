package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class buttonClick implements ActionListener { 
	
    public void actionPerformed(ActionEvent e) { 
            System.out.println("Button geklickt!"); 
            String value = Main.comboBox.getSelectedItem().toString();
            System.out.println(value); 
            Main.dataProvider.setOperationParameter(value);
            
            if(value == "brom"){
            	Main.dataProvider.setScale(100);
            	Main.dataProvider.setUnit("g/l");
            }
            if(value == "chlor"){
            	Main.dataProvider.setScale(25);
            	Main.dataProvider.setUnit("kg");
            }
            
            Main.dataProvider.setEingriffS(Float.parseFloat(Main.textField_8.getText().toString()));
            Main.dataProvider.setEingriffE(Float.parseFloat(Main.textField_7.getText().toString()));
            
            Main.dataProvider.setSollS(Float.parseFloat(Main.textField_9.getText().toString()));
            Main.dataProvider.setSollE(Float.parseFloat(Main.textField_10.getText().toString()));
            
            Main.panel_2.repaint();
    } 
} 