package pl.codeme.oop;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
//		stringIteratorEx();
//		nFactIterator(4);
//		nPrimeIterator(55);
		revTab();
		
	}

	private static void revTab(){
		int[] costam = new int[]{1,2,3,4,5,6,7};
		OdwrocTablice o = new OdwrocTablice(costam);
		for (Integer wartosc: o){
			System.out.println(wartosc);
		}
	}
	private static void nPrimeIterator(int n) {
		MyIteratorPrime myIteratorPrime = new MyIteratorPrime(n);
		for (Integer wartosc: myIteratorPrime){
			System.out.println(wartosc);
		}
	}
	
	private static void nFactIterator(int n) {
		MyIterator myIterator = new MyIterator(n);
		for (Integer wartosc: myIterator){
			System.out.println(wartosc);
		}
	}
	
	
	private static void stringIteratorEx() {
		StringIterator it = new StringIterator("Marek"); // na poczatku
															// StringIterator bo
															// String iterator
															// ma metody hasnext
															// i next, a
															// iterator jest
															// tylko iteratorem
		for (Object z : it){								// i ma get
			System.out.println(z);
		}
		while (it.hasNext())
			System.out.println(it.next());
	}

	private void ex1() {

		int[] tab = { 1, 11, 111, 1111 };

		for (int i : tab) {
			System.out.println("El: " + i);
		}
	}

}
