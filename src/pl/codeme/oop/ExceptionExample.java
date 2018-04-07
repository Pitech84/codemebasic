package pl.codeme.oop;

import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			ex2();
		} catch (IOException e) {
			// e.
		} catch (Throwable e) {
			e.printStackTrace();

			myPrintStackTrace(e);

			// st[0]. // mozemy sobie sprawdzic jakie pola sa dostepne dla
			// pierwszego obiektu
		}
	}

//	public static void myPrintStackTrace(StackTraceElement[] st) {
//		for (int i = 0; i < st.length; i++){
//			System.out.println(st[i].getClassName()+st[i].getMethodName()+st[i].getFileName()+st[i].getLineNumber()+st[i].getClass());
//		}
//}
	public static void myPrintStackTrace(Throwable ex) {
		
			System.out.println(ex.getCause() + " " + ex.getMessage() + " " + ex.getClass());
			StackTraceElement[] stackTrace = ex.getStackTrace();
			for (StackTraceElement s : stackTrace){
				System.out.println(s.getClassName() + "." + s.getMethodName() + " " +s.getFileName() + ":"+ s.getLineNumber());
			}
		
	}
		// tutaj po zrobic fora i wyswietlic jednego systemout gdzie bedziemy
		// pytali o rozne metody stacktrace st[i].getfilename+st[i].getwhatever
	

	public static void ex2() throws IOException {
		 double a = 2 / 0; // jak to odcomentujemy to nam napisze dokladnie w
		// jakimmiejscu jaki rodzaj bledu wystepuje
		System.in.read();
	}

	public static void ex1() {
		// System.in.read(); // dziedziczy bezposrednio Exeption, a nie po
		// RuntimeExeption i kaze nam osluzyc blad
		try {
			double bl = 2 / 0; // normalnie wyrzuci nam exeption
			System.out.println("to już się nie wykona!");
		} catch (ArithmeticException e) {
			System.out.println("Błąd arytmetyczny");
		} finally {
			System.out.println("To wykona się zawsze");
		}

	}

}

// w momentcie deklaracji throws IOExeption przekazujemy obsluge bledu poziom
// wyzej, czyli do osoby wykonujacej, uzywajacej ta metode
// dlatego w mainie ex2(); podkreslilo sie

// iterator, singleton wzorzec
// struktura Exception
// https://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/