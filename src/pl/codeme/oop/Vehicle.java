package pl.codeme.oop;

public abstract class Vehicle { // abstract zawieraja czesciowy opis obiektu,
								// wiemy ze cos robi ale jeszcze nie do kolca,
								// nie mozna zakladac obiektow klasy
								// absrakcyjnej
	protected String type; // przez to ze private to bedzie tylko widoczny tylko
							// pomiedzy nawiasami tylko dla klasy, zamieniamy go
							// zatem na protected
							// protected daje tylko widocznosc dla klas ktore
							// dziedzicza po danej klasie , w ramach pakietu,
							// funkcjonalnosci zamykamy
							// z reguły w ramach pakietu. public - dla
							// wszystkich, protected - w ramach drzewa
							// dziedziczenia, private- tylko w bloku miedzy {}

	public Vehicle(String type) {
		super();
		this.type = type;
	}

	// // public String type; // Pole Klasy
	// private String type; // tworzymy pole typu type
	// //zmieniamy modyfikator dostepu na public rzeczy ktos nie mogl w pelni
	// korzystac z naszej klasy, a tylko z gettera i settera
	//
	// public Vehicle(String type){ // to jest konstruktor
	//
	// }
	//
	//
	// public void setType(String type){ // trzeba uzyc this bo zmienna type
	// nadpisywala by type obiektu mozna tez na drugi sposob (ponizej
	// this.type = type;
	// }
	// public void setType(String initType){ // teraz nie nadpisujemy
	// type = initType;
	// } // wyrzucając gattera lub settera mozemy zrobic tylko do zapisu lub
	// tylko do odczytu
	//
	// public String getType(){
	// return type;
	//
	// }

	public String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	public void start() { // jezeli odwolamy sie do vehicle to wykona ten start

	}

	public abstract void drive(); // musimy zadeklaroac metode abstraktyjna w
									// celu opisania klasy abstrakcyjnej
									// w przeciwnym wypadku wyrzuci nam blad

	// PRZY KLASIE ABTRAKCYJNEJ NIE UTWORZYSZ INSTANCJI, ZMUSZASZ KOGOS
	// ZEBYSTWORZYL METODE< W KTOREJS KLASIE DZIEDZICZACEJ
}
