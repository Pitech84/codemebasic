package pl.codeme.oop.io;

import java.io.IOException;
import java.io.InputStream; // jest abstrakcyjny daje nam koniecznosc uzycia metody availible 

public class Keyboard { // '\n' 13 bit lub '\r' znaki nowej linii

	private final byte NL = 10;
	private final byte LF = 13;
	private InputStream is;

	public Keyboard(InputStream is) {
		this.is = is;
	}

	public static int pow2Int(int a, int b) { // funckja zeby zrobic z double
												// integery przy uzyciu Math.pow
		return (int) Math.pow(a, b);
	}

	public int readInt() {
		int znak = 0;
		int znak1 = 0;
		int av = 0;
		try {
			System.in.read(new byte[System.in.available()]);
			do {

				znak = is.read();
				av = is.available();
				if ((znak < 48 || znak > 59) && znak != 13 && znak != 10)
					throw new RuntimeException("Nie podałeś Integera");
				if (znak != NL && znak != LF && av > 1)
					znak1 += pow2Int(10, av - 2) * (znak - 48);

			} while (znak != NL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return znak1;
	}

	public String readLine() {
		char z;
		try {
			System.in.read(new byte[System.in.available()]); 
			// stream byl zasmiecony, trzeba bylo to wrzucic zeby go zresetowac, 
			//zeby nastepny raz jak go bedziemy uzywali zeby byl pusty
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int av;
		String result = "";
		try {
			do {
				z = (char) is.read();
				if (z != NL && z != LF/* && result.length() < maxDl*/)
					result = result + z;

				av = is.available();
			} while (z != NL); // u mamy char wiec nie musmy equals tylko mozemy
								// !=
		} catch (IOException e) {

		}
		return result;
	}
	
	public char readLine1() {
		char z = 0;
		
//		try {
//			do {
//				z = (char) is.read();
//				if (z != NL && z != LF/* && result.length() < maxDl*/)
//					result = z;
//
////				av = is.available();
//			} while (z != NL); // u mamy char wiec nie musmy equals tylko mozemy
//								// !=
//		} catch (IOException e) {
//
//		}
		try {
			z = (char) is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return z;
	}

}
// napisac readInta takiego zeby czytal inty a nie stringi strona asciitable
// odjac odpowiednia wartosc pomnozyc przez 10
// uodpornic program na znak nowej lini, wywalic nl i lf