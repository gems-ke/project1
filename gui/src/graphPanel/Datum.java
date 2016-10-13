package graphPanel;

public class Datum {
	
	private int tag, monat, jahr = 0;

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
	
}