package graphPanel;

import java.util.List;
import java.io.*;
import java.util.ArrayList;

import javax.swing.filechooser.FileSystemView;

public class DataHandler {
	
	static String strDirectoy = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/galvaLog.txt";
	
	/*public static void instanciate(){
		new File(strDirectoy).mkdir();
	}*/
	
	private static int countLines(String filename){
	    InputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream(filename));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
	        byte[] c = new byte[1024];
	        int count = 0;
	        int readChars = 0;
	        boolean empty = true;
	        try {
				while ((readChars = is.read(c)) != -1) {
				    empty = false;
				    for (int i = 0; i < readChars; ++i) {
				        if (c[i] == '\n') {
				            ++count;
				        }
				    }
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return (count == 0 && !empty) ? 1 : count + 1;
	    } finally {
	        try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
	private static int lineCount = countLines(strDirectoy);
	public static Vector4d[] vArray = new Vector4d[lineCount/8];
	
	Vector4d[] vArrayPass;
	
	public void loadData(){
		
		lineCount = countLines(strDirectoy);
		
		int arrayPosN = 0, arrayPosNold = 0, arrayPosU = 0, arrayPosV = 0, arrayPosD = 0;
		
		FileReader fr = null;
		try {
			fr = new FileReader(strDirectoy);
		} catch (FileNotFoundException e) {
			System.err.println("Couldn't load file saves!");
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(fr);
		String line = "first";
		
		for (int i = 0; i < lineCount/8; i++){
			Vector4d v4 = new Vector4d("nullv", "nullu", 0, "1-1-1900");
			vArray[i] = v4;
		}
		
		for(int il = 0; vArray.length > arrayPosD; il++){
			
			if(line.startsWith("name"))
			{
				try {
					line = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				vArray[arrayPosN].setName(line);
				arrayPosN++;
			}else if(line.startsWith("unit"))
			{
				try {
					line = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				vArray[arrayPosU].setUnit(line);
				arrayPosU++;
			}else if(line.startsWith("value"))
			{
				try {
					line = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				vArray[arrayPosV].setValue(Integer.parseInt(line));
				arrayPosV++;
			}else if(line.startsWith("date"))
			{
				try {
					line = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				vArray[arrayPosD].setDate(line);
				arrayPosD++;
			}else{
				try {
					line = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private void extractDataFocus(String name){
		
		List<Object> vecList = new ArrayList<Object>();
		
		Vector4d vecFlex = new Vector4d("null", "null", 0, new Datum(1, 1, 1900));
		
		for(int i2 = 0; i2 < vArray.length; i2++){
			System.out.println("comparison initiated:" + vArray[i2].getName() + "-" + name);
			if(vArray[i2].getName().equals(name)){
				System.out.println("comparison successful:" + vArray[i2].getName() + "-" + name);
				vecList.add(vArray[i2]);
			}else{
				System.out.println("comparison failed:" + vArray[i2].getName() + "-" + name);
			}
		}
		
		vArrayPass = new Vector4d[vecList.size()];
		
		System.out.println(vecList.size() + "vecList size");
		
		for(int i3 = 0; i3 < vecList.size(); i3++){
			
				vecFlex = (Vector4d) vecList.get(i3);
				vArrayPass[i3] = vecFlex;
			
		}
		
	}
	
	public Vector4d[] sortDates (Vector4d[] dateStartArray){
		
		boolean isSorted = false;
		
		if(dateStartArray.length > 1){
			Datum currentDate = dateStartArray[0].getDate();
		
			Datum compareDate = dateStartArray[1].getDate();
			while(!isSorted){
				for (int i = 0; i < dateStartArray.length-1; i++){
			
					//System.out.println(currentDate.getTimeDelta(dateStartArray[i + 1].getDate()));
				
					currentDate = dateStartArray[i].getDate();
				
					compareDate = dateStartArray[i + 1].getDate();
			
					if (currentDate.getTimeDelta(compareDate) > 0)
					{
						dateStartArray[i].setDate(compareDate);
						dateStartArray[i + 1].setDate(currentDate);
					}
					if (currentDate.getTimeDelta(compareDate) < 0)
					{
						dateStartArray[i + 1].setDate(compareDate);
						dateStartArray[i].setDate(currentDate);
					}
			
				}
				
				isSorted = true;
				
				for (int i = 0; i < dateStartArray.length-1; i++){
					
					if (isSorted){
						currentDate = dateStartArray[i].getDate();
						
						compareDate = dateStartArray[i + 1].getDate();
				
						if (currentDate.getTimeDelta(compareDate) > 0)
						{
							isSorted = false;
						}
					}
					
				}
					
			}
		}
		
		//flip array
		
		for(int i = 0; i < dateStartArray.length / 2; i++)
		{
		    Vector4d temp = dateStartArray[i];
		    dateStartArray[i] = dateStartArray[dateStartArray.length - i - 1];
		    dateStartArray[dateStartArray.length - i - 1] = temp;
		}
		return dateStartArray;
		
	}
	
	public Vector4d[] getData(){
		return vArray;
	}
	
	public Vector4d[] getExtract(String s){
		extractDataFocus(s);
		return vArrayPass;
	}
	
	public int getLineCount(){
		return lineCount;
	}

}