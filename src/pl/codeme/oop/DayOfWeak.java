package pl.codeme.oop;

public enum DayOfWeak {
	MONDAY("pn", 0), 
	TUESDAY("wt", 1),
	WEDNESDAY("sr", 10), 
	THURSDAY("cz", 11), 
	FRIDAY("pt", 70), 
	SATERDAY("so", 100), 
	SUNDAY("nd", 50);
	// switch/case dziala tylko z enumami
	// enum typ wyliczeniowy,

	private String plDay;
	private int happiness;
	
	private DayOfWeak(String plDay, int happiness){
		this.plDay = plDay;
		this.happiness = happiness;
		
}

	public String getPlDay() {
		return plDay;
	}

	public void setPlDay(String plDay) {
		this.plDay = plDay;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
}

