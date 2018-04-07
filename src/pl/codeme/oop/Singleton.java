package pl.codeme.oop;

public class Singleton {

	/* public Singleton(); */// przy konstruktorze normalnie dajemy public
	private static Singleton instance; // pole // jak chcemu pule obiektow to
										// robimy Singleton[] Array 10

	private Singleton() { // protected jest widoczny w klasie dziedziczenia

	}
// zainicjowac obiekty tablicy Singleton[] zeby nie byly nullami
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
// tutaj mozna je forem wypisac
		return instance;
	}
	
	public void ex(){}
}

// prywatny konstruktor uniemozliwia robienie instancji
// przejscie z nulla w zainicjowany obiekt daje mozliwosc ograniczenia do
// jednego identyfikatora (pola pamieci)