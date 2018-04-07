package pl.codeme.oop.io;

public class IOExample {

	public static void main(String[] args) {
		Keyboard kb = new Keyboard(System.in);
		
//		System.out.println("Podaj tekst:");
//		int bla = kb.readInt();
//		System.out.println("Integer to : " + bla); // odkomentowac zeby dzialal readInt();
		

		String test = kb.readLine();
		System.out.println("Odczytałem: " + test);
		System.out.println("Długość " + test.length());
	}
}
