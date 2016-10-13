package graphPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import org.omg.CORBA.portable.ValueOutputStream;

import main.Main;

@SuppressWarnings("serial")
public class PanelManager extends JPanel{
	
	Color lightRed = new Color(1.0f, 0.7f, 0.7f);
	Color lightYellow = new Color(1.0f, 1.0f, 0.7f);
	Color lightGreen = new Color(0.7f, 1.0f, 0.7f);
	
	DataHandler dh = new DataHandler();
	
	int dotScale = 8;
	
	public PanelManager(){
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		// Eingriffs- und Sollbereich zeichnen
		int sollS = 150;
		int sollE = 350;
		int eingriffS = 200;
		int eingriffE = 300;
		
		g.setColor(lightRed);
		g.fillRect(0, 0, 1000, 500);
		
		g.setColor(lightYellow);
		g.fillRect(0, sollS, 1000, sollE-sollS);

		g.setColor(lightGreen);
		g.fillRect(0, eingriffS, 1000, eingriffE-eingriffS);
		
	// Raster und Bezifferung Zeichnen
		g.setColor(Color.GRAY);
		
		// Vertikale Rasterlinien
		for(int xi = 50; xi <=1000; xi += 10){
			g.drawLine(xi, 0, xi, 500);
		}
		
		// Horizontale Rasterlinien
		
		for(int yi = 0; yi <=500; yi += 10){
			g.drawLine(0, yi, 1000, yi);
		}
		
		// Horizontale Rote Indikationslinien mit einheitlicher Wertangabe als String
		int convertAlgo = 500;
		int counter = 0;
		for(int hi = 0; hi <= 500; hi += 50){
			g.setColor(Color.BLUE);
			g.drawLine(0, hi, 1000, hi);
			String s = "" + Main.dataProvider.getScale()*counter + Main.dataProvider.getUnit();
			g.drawString(s, 0, convertAlgo);
			convertAlgo -= 50;
			counter++;
		}
		
		// Vertikale Blaue Indikationslinien mit einheitlicher Zeitangabe als String
		int counter2 = 0;
		for(int vi = 50; vi <= 1000; vi += 50){
			g.setColor(Color.BLUE);
			g.drawLine(vi, 0, vi, 510);
			counter2++;
		}
		
		// Funktionszeichnung
		
		dh.loadData();
		
		//Vector4d[] vData = new Vector4d[];
		
		//vData = dh.getData();
		
		for(int i = 0; i < dh.getData().length; i++){
			System.out.println(dh.getData()[i].getName() + " " + dh.getData()[i].getUnit()  + " " + dh.getData()[i].getValue() + " " +
					dh.getData()[i].getDate().getTag() + "." + dh.getData()[i].getDate().getMonat() + "." + dh.getData()[i].getDate().getJahr());
		}
		
		System.out.println("init dataextraction");
		
		Vector4d[] currentVec;
		
		//Vector4d currentVec;
		
		currentVec = dh.getExtract(Main.dataProvider.getOperationParameter());
		
		System.out.println(currentVec.length + " extractionVectorsize");
		
		if(currentVec.length >= 20){
			System.out.println("automated scaling algorithm initiated");
			System.out.println("scaling parameters: CurrentScale: " + Main.dataProvider.getMassScale() + " vectorlength: " + currentVec.length + " estimated algoriththm result: " + (Main.dataProvider.getMassScale() * ((currentVec.length + 20)/20)));
			Main.dataProvider.setMassScale(Main.dataProvider.getMassScale() * ((currentVec.length + 20)/20));
		}
		
		for(int di = 0; di < currentVec.length; di++){
			
			System.out.println(di + " " + currentVec[di].getValue());
			System.out.println(Math.abs(currentVec[di].getValue()-500));
			
			g.setColor(Color.BLACK);
			if(di < currentVec.length - 1){
				g.drawLine( di * ( 50 / (int) Main.dataProvider.getMassScale()) + 50, (500 - (currentVec[di].getValue()*50 / Main.dataProvider.getScale())), (di + 1) * ( 50 / (int) Main.dataProvider.getMassScale()) + 50, (500 - (currentVec[di + 1].getValue()*50 / Main.dataProvider.getScale())));
			}
			
			g.setColor(Color.RED);
			g.fillOval( di * ( 50 / (int) Main.dataProvider.getMassScale()) + 50 - (dotScale/2), (500 - (currentVec[di].getValue()*50 / Main.dataProvider.getScale())) - (dotScale/2), dotScale, dotScale);
		}

		int counter3 = 0;
		for(int vi = 50; vi <= 1000; vi += 50){
			g.setColor(Color.BLUE);
			if(counter3 < currentVec.length){
				String s = (currentVec[counter3].getDate().getTag() + "." + currentVec[counter3].getDate().getMonat());
				//if(counter3 > 0){
				//	System.out.println("counter3: " + counter3 + "massScale: " + Main.massScale + "Modulo: " + counter3 % Main.massScale);
				//}
				if(counter3 != 0 && counter3 % Main.dataProvider.getMassScale() == 0){
					g.drawString(s, counter3 * ( 50 / (int) Main.dataProvider.getMassScale()) + 35, 525);
				}else if(counter3 == 0){
					g.drawString(s, counter3 * ( 50 / (int) Main.dataProvider.getMassScale()) + 35, 525);
				}
			}
			counter3++;
		}
		
	}
	
}