package treads;

public abstract class Auto implements Runnable {

	private String name;
	private long time;
	private boolean end;
	
	public Auto(String name) {
		this.name = name;
		end = false;
	
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	public long getSpeed() { // zeby wydac parametr speed 
		return time * 3;
	}
	
	public void breaks() { // jak nam sie skonczy droga to musi hamowac
		end = true;
	}
	@Override	
	public void run() {
		try {
			while (!end) {
				System.out.println("Jadę" + this.name + " z prędkością" + time * 3 + "km/h");
				Thread.sleep(time * 500);
			}
				System.out.println("Zatrzymałem się w " + this.name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}	
}


