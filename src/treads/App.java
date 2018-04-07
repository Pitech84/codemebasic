package treads;

import pl.codeme.oop.DayOfWeak;

public class App {

	public static void main(String[] args) throws Exception {
		
		Auto auto1 = new Ford();
		auto1.setTime(90);
		Auto auto2 = new Polonez();
		auto2.setTime(60);
		Jaguar auto3 = new Jaguar();
		auto3.setTime(120);
		
		Road road = new Road(5);
		road.addCar(auto1);
		//road.addCar(auto2);
		//road.addCar(auto3);
		Thread.sleep(10000); // dajemy bo konczyl road zanim zdazylo sie cokolwiek pojechac
		road.end();
		
		
		for (DayOfWeak item : DayOfWeak.values()) { // jak damy implement missing statemens 
													//	sam pobierze wartosci i je wypisze
			switch(item) {
			case FRIDAY:
				break;
			case MONDAY:
				break;
			case SATERDAY:
				break;
			case SUNDAY:
				break;
			case THURSDAY:
				break;
			case TUESDAY:
				break;
			case WEDNESDAY:
				break;
			// mozemy uzyc tylko prymitywnych
			}
		}
		
		for (DayOfWeak item: DayOfWeak.values()) {
			auto1.setTime(item.getHappiness());
			auto2.setTime(item.getHappiness());
			auto3.setTime(item.getHappiness());
			
//			new Thread(auto1).start();//Thread th2 = new Thread(auto2); th3.start(); tamten zapis zamiast ten
//			new Thread(auto2).start();
//			new Thread(auto3).start();
			
		}
		
		System.out.println("Basic tread1" );
		Thread.sleep(2000);
		System.out.println("Basic tread2" );
		
	}

}
