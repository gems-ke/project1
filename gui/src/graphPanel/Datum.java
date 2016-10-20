package graphPanel;

public class Datum {
	
	private int tag, monat, jahr = 0;
	
	int[] monate = {31,28,31,30,31,30,31,31,30,31,30,31};

	public Datum(int tag, int monat, int jahr){
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}
	
	public Datum(String s){
		String sep[] = s.split(".");
		this.tag = Integer.parseInt(sep[0]);
		this.monat = Integer.parseInt(sep[1]);
		this.jahr = Integer.parseInt(sep[2]);
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	public void setDatum(String s){
		String[] sep = s.split("-");
		this.tag = Integer.parseInt(sep[0]);
		this.monat = Integer.parseInt(sep[1]);
		this.jahr = Integer.parseInt(sep[2]);
	}
	
	public int getTimeDelta(Datum date2){
		int deltaTime = 0;
		
		if (date2.getJahr() > this.getJahr()){
			deltaTime += 365 * (date2.getJahr() - this.getJahr());
		}
		if (date2.getMonat() > this.getMonat()){
			deltaTime += monate[this.getMonat()-1] - this.getTag();
			for (int ti = 0; ti < date2.getMonat() - this.getMonat() -1; ti++){
				deltaTime += monate[this.getMonat() + ti -1];
			}
			deltaTime += date2.getTag();
		}else if (date2.getMonat() == this.getMonat()){
			deltaTime += date2.getTag() - this.getTag();
		}else{
			deltaTime -= this.getTag();
			for (int ti = 0; ti < this.getMonat() - date2.getMonat()-1; ti++){
				deltaTime -= monate[this.getMonat() - ti -2];
			}
			deltaTime -= monate[date2.getMonat()-1] - date2.getTag();
		}
		
		return deltaTime;
	}
	
	public void jumpDays(int days){
		
		boolean addingDone = false;
		
		while (!addingDone){
			
			if (this.tag + days > monate[this.monat - 1]){
				
				days -= monate[this.monat - 1] - this.tag;
				
				if (this.monat == 12){
					
					this.tag = 1;
					this.monat = 1;
					this.jahr++;
					
				}else{
					
					this.tag = 1;
					this.monat++;
					
				}
				
			}else{
				
				this.tag += days;
				addingDone = true;
				
			}
				
		}
		
	}
	
}