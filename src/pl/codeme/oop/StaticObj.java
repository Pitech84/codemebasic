package pl.codeme.oop;

public class StaticObj {
	public int a;
	public static int b = 10;

	static { // blok statyczny - wykonany zostaje kiedy napotkany zostanie
				// identyfikator dla danej klasy, jest wykonywane raz w momencie
				// inicjowania klasy
		System.out.println("Klasa załadowana i zainicjowana");
	}

	public StaticObj(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "a=" + a + " b=" + b; // robiac println robimy Object.toString dlatego nadpisujemy
	}

	public static void staticMethod() {
		System.out.println("Metoda statyczna (" + b + ")"); // b sie pochylilo
															// bo jest statyczne
		// a = 3;//jak damy to napisze ze nie moze utworzyc referencji do nie
		// statycznego obiektu
	}
}

// static - nie potrzebuje instancji klasy, moze dzialac bez wywolania