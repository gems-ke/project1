package graphPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import org.omg.CORBA.portable.ValueOutputStream;

import main.Main;

@SuppressWarnings("serial")
public class PanelManager extends JPanel{
	
	Color lightRed = new Color(1.0f, 0.8f, 0.8f);
	Color lightYellow = new Color(1.0f, 1.0f, 0.8f);
	Color lightGreen = new Color(0.8f, 1.0f, 0.8f);
	
	DataHandler dh = new DataHandler();
	
	int dotScale = 8;
	
	public PanelManager(){
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		// Eingriffs- und Sollbereich zeichnen
		float soll1 = Main.dataProvider.getSollS();
		float soll2 = Main.dataProvider.getSollE();
		float eing1 = Main.dataProvider.getEingriffS();
		float eing2 = Main.dataProvider.getEingriffE();
		
		System.out.println ((int) (soll1 / ((float)Main.dataProvider.getScale()/50)));
		System.out.println ((int) (soll2 / ((float)Main.dataProvider.getScale()/50)));
		System.out.println ((int) (eing1 / ((float)Main.dataProvider.getScale()/50)));
		System.out.println ((int) (eing2 / ((float)Main.dataProvider.getScale()/50)));
		
		
		int sollS = 500 - (int) (soll1 / ((float)Main.dataProvider.getScale()/50));
		int sollE = 500 - (int) (soll2 / ((float)Main.dataProvider.getScale()/50));
		int eingriffS = 500 - (int) (eing1 / ((float)Main.dataProvider.getScale()/50));
		int eingriffE = 500 - (int) (eing2 / ((float)Main.dataProvider.getScale()/50));
		
		System.out.println(sollS + " " + sollE + " " + eingriffS + " " + eingriffE);
		
		g.setColor(lightRed);
		g.fillRect(0, 0, 1000, 500);
		
		g.setColor(lightYellow);
		g.fillRect(0, sollE, 1000, sollS - sollE);

		g.setColor(lightGreen);
		g.fillRect(0, eingriffE, 1000, eingriffS - eingriffE);
		
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
		
		// Horizontale blaue Indikationslinien mit einheitlicher Wertangabe als String
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
		
		// Vertikale Blaue Indikationslinien
		for(int vi = 50; vi <= 1000; vi += 50){
			g.setColor(Color.BLUE);
			g.drawLine(vi, 0, vi, 510);
		}
		
		// Funktionszeichnung
		
		//lese die datenbank aus
		dh.loadData();
		
		for(int i = 0; i < dh.getData().length; i++){
			System.out.println(dh.getData()[i].getName() + " " + dh.getData()[i].getUnit()  + " " + dh.getData()[i].getValue() + " " +
					dh.getData()[i].getDate().getTag() + "." + dh.getData()[i].getDate().getMonat() + "." + dh.getData()[i].getDate().getJahr());
		}
		
		//initialisierung und chronologische filterung des verwendungs arrays, der die parametrisierten daten enthält
		
		System.out.println("init dataextraction");
		
		Vector4d[] currentVec;
		
		currentVec = dh.getExtract(Main.dataProvider.getOperationParameter());
		
		currentVec = dh.sortDates(currentVec);
		
		System.out.println(currentVec.length + " extractionVectorsize");
		
		//graphenskalierungsberechnung und relationsvektor initialisierung
		
		float[] massScale = new float[currentVec.length];
		
		massScale[0] = 0;
			
		for(int iConvert = 1; iConvert < currentVec.length; iConvert++){
			
			massScale[iConvert] = currentVec[0].getDate().getTimeDelta(currentVec[iConvert].getDate());
			
		}
		
		for(int i=0; i<massScale.length; i++){
			System.out.println("estimated delta #" + i + ": " + massScale[i]);
		}
		
		//zeichnen der puntke und verbidnungslinien
		
		for(int di = 0; di < currentVec.length; di++){
			
			System.out.println(di + " " + currentVec[di].getValue());
			System.out.println(Math.abs(currentVec[di].getValue()-500));
			
			g.setColor(Color.BLACK);
			if(di < currentVec.length - 1){
				g.drawLine( (int) (massScale[di] / massScale[massScale.length - 1] * 950) + 50, (500 - (currentVec[di].getValue()*50 / Main.dataProvider.getScale())), (int) (massScale[di + 1] / massScale[massScale.length - 1] * 950) + 50, (500 - (currentVec[di + 1].getValue()*50 / Main.dataProvider.getScale())));
			}
			
			g.setColor(Color.RED);
			g.fillOval((int) (massScale[di] / massScale[massScale.length - 1] * 950) + 50 - (dotScale/2), (500 - (currentVec[di].getValue()*50 / Main.dataProvider.getScale())) - (dotScale/2), dotScale, dotScale);
		}

		int counter3 = 0;
		
		float counter4 = 0f;
		
		float totalDelta = massScale[massScale.length - 1];
		
		Datum currentDateLine;
		
		for(int vi = 50; vi <= 1000; vi += 50){
			g.setColor(Color.BLUE);
			if(counter3 < 20){
				currentDateLine = currentVec[0].getDate();
				if(counter3 > 0){
					currentDateLine.jumpDays((int)(totalDelta)/18);
				}
				String s = (currentDateLine.getTag() + "." + currentDateLine.getMonat());
				//if(counter3 > 0){
				//	System.out.println("counter3: " + counter3 + "massScale: " + Main.massScale + "Modulo: " + counter3 % Main.massScale);
				//}
				if(counter3 != 0 && counter3 % Main.dataProvider.getMassScale() == 0){
					g.drawString(s, counter3 * ( 50 ) + 35, 525);
				}else if(counter3 == 0){
					g.drawString(s, counter3 * ( 50 ) + 35, 525);
				}
			}
			counter4++;
			counter3++;
		}
		
		counter3 = 0;
		
	}
	
}