package treads;

import java.util.ArrayList;
import java.util.List;

public class Road extends Thread {

	private double distance; // zmienilismy tez na double a byl int zeby wynik nam wychodzil w zmiennoprzecinkowych
	private List<Auto> cars;
	public boolean end;

	public Road(int distance) {
		end = false;
		this.distance = distance;
		cars = new ArrayList<>(); // <> diamentowy, sam wie jakiego typu powinna byc podstaiwana rzecz
		start(); // startujemy drogę po kazdym wywolaniu metody
	}

	public void addCar(Auto car) {
		cars.add(car);
	}
	
	public void end() {
		end = true;
	}
	@Override
	public void run() {
		System.out.println("START");
		while (!end) { // ! while(true) bo end na poczatek ma false
			try {
				long speed = 0;
				if (!cars.isEmpty()) {
					speed = cars.get(0).getSpeed(); // wyciagamy z pierwszego auta predkosc
					new Thread(cars.get(0)).start(); // uruchamiamy samochod
				}
				
				Road.sleep(1000);// mozna dac Thread.sleep bo Road tez jest Threadem
				distance -= (speed/3600D); // long z dzielenia jest long i ucina po przecinku, Double da nam nam po przcinku
				// jezeli dali bysmy this.sleep to podkresli warning bo to obiektu
				System.out.println("Dystans: " + distance + " km");// abstrakcyjnego powinno odwolywac sie przez klase
				if (distance <= 0) {
					cars.get(0).breaks(); // hamowanie
					cars.remove(0); // usunięcie pierwszego z listy Array, przesunie indeksy w dol po usunieciu
				}
					break;
				// odejmujemy dystans po czasie bo przed samochody nie przejechaly by jeszcze
				// tego dystansu

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
