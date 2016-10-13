package graphPanel;

public class Vector4d {
	
	private String name = "nulln";
	private String unit = "nullu";
	private int value = 0;
	private Datum date = new Datum(0, 0, 0);
	
	public Vector4d(String name, String unit, int value, Datum date){
		this.name = name;
		this.unit = unit;
		this.value = value;
		this.date = date;
	}
	
	public Vector4d(String name, String unit, int value, String date){
		this.name = name;
		this.unit = unit;
		this.value = value;
		this.date.setDatum(date);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Datum getDate() {
		return date;
	}

	public void setDate(Datum date) {
		this.date = date;
	}
	
	public void setDate(String date) {
		this.date.setDatum(date);
	}
	
}