package pl.codeme.oop;

public class ArrayExample {

	public static void main(String[] args) {
		boolean tb[][]; // tablica 2wu wymiarowa

		tb = new boolean[5][3];
		tb[0][2] = true;
		System.out.println(tb.length);
		System.out.println(tb[0].length); // ktorykolwiek wiersz zeby zlapac
											// dlugosc

	}

	public static void tabExample2() {
		int tab[] = new int[10]; // słowo kluczowe new daje nam info ze to jest
									// obiekt
		int primitive = 18;
		/* tab[3] = 40; */// klikajac na belce po lewej mozemy ustawic break
							// point w celu debuga

		// for(int i = 0; i < tab.length; i++){
		// tab[i] = 101 + i;
		// }
		tab = tabExample(5, 0, 1); // przypisanie wyniku tab exaple do zmiennej
									// 'tab' lokalnej w mainie zeby ja printnac
		printTab(tab);
		destroyer(tab, primitive);

		System.out.println();
		printTab(tab);
		System.out.println("primitive=" + primitive);
	}

	public static void destroyer(int[] t, int p) { // typy proste na potrzebe
													// moteody sa kopiowane
													// (skopiuje wartosc)
		t[1] = -100; // tablica nie jest typem prostym i nie zostanie skopiowana
						// zostanie przekazana referencja
		p = 100;
	}

	// }
	public static/* void zamieniamy na int */int[] tabExample(int tabLenght,
			int start, int step) { //

		int tab[] = new int[tabLenght];
		step = 2;

		tab[0] = start;

		for (int i = 1; i < tab.length; i++) {
			tab[i] = tab[i - 1] + step;
		}
		return tab; // musimy przypisać w mainie żeby wiedział do czgo ma sie
					// odwołac
	}

	public static void printTab(int[] tab) {

		// for(int i = tab.length - 1; i >= 0; i--){
		// System.out.print(tab[i] + " ");
		// }
		for (int i = 0; i <= tab.length - 1; i++) {
			System.out.print(tab[i] + " ");
		}
	}

}
