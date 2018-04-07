package pl.codeme.oop;

//import pl.codeme.oop.car.Engine;
import pl.codeme.oop.car.Seat;
import pl.codeme.oop.car.Wheel;

public class Car extends Vehicle implements Radio{// dziedziczy po vehicle , w klasie
									// dziedziczącej trzeba napisać ciało dla
									// metody klasy abstrakcyjnej w tym
									// przypadku Vehicle

	private Wheel wheelLF;
	private Wheel wheelRF;
	private Wheel wheelLB;
	private Wheel wheelRB;

	private Seat driverSeat;
	private Seat passengerSeat;

	private pl.codeme.oop.car.Engine engine;

	private int currentSpeed;
	private int fuelLevel;

	public Car() { //
		super("Samochód"); // konstruktor zeby wiedzial ze sa gettery i settery
							// z Vehicle,w przeciwnym przypadku nie zapamieta
		final Wheel zapasowy;

	}

	// najczęściej nadpisuwana metoda jest toString, bo jest w klasie Object
	@Override
	// wpisujemy kiedy nadpisujemy zeby inny programer sie nie wkurwial
	public void start() { // jezeli wywolamy car to zrobi ten start (nadpisuje
							// metode z klasy nadrzednej)
		engine.start();
		super.start(); // widac po rozwinieciu, ze chce sie odniesc do starta z
						// vehicle gdy damy super
	}

	public void start(int acceleration) { // 2ga metoda tak samo nazywajaca sie
											// -posiadajaca rozne metody. Java
											// jest dobra i to kuma i nie
											// wyrzuca bledu rozroznia je
	}

	public void start(int il, float i2) {
	}

	public void start(float i1, int i2) {
	} // takie coś nazywamy przeciążaniem, jeżeli dla jednej nazwy mamy kilka
		// implementacji

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void radioOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void radioOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
// tworzenie pol
// kwalifikatory dostepu
// tworzenie mterod nie obchodzi nas static
// deklaracja typow zwracanych
// orientowac sie w packagep po co sa
// konstruktory publiczne
// opisać jakiś przedmiot z zycua codziennego jako obiekt itd
// nie mozna dziedziczyc po klasie final ( final uzywamy do deklaracji stalych-
// stale to zmienne bez mozliwosci zmieniania :D)
// Przegadac z Greenem klasy abstrakcyjne

// Interface, klasa abstrakcyjna, przeciazanie, 
// final -nie nadpiszemy nie zmienimy, nic z nia nie zrobimy