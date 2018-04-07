package pl.codeme.oop;

import java.util.Iterator;

public class CopyOfMyIteratorPrimeStara implements Iterator<Integer>, Iterable<Integer> {

	private int n;
	private int count = 0;
	private int wynik;
	private int liczba = 7;

	public CopyOfMyIteratorPrimeStara(int n) {
		this.n = n;
	}

	@Override
	public Iterator<Integer> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		while (count > n) {
			return false;
		}
		return true;
	}

	@Override
	public Integer next() {
		if (count == 1){
			System.out.println(2);
			count++;
		}
		else if (count == 2){
			System.out.println(3);
			count++;
		}
		else if (count == 3){
			System.out.println(5);
			count++;
		}
		else if (count == 4){
			System.out.println(7);
			count++;
		}
		else
		if (count >= 5){
		
		do{	
			liczba++;
			if (liczba%2 != 0 && liczba%3 != 0 && liczba%5 != 0 && liczba%7 != 0){
				wynik = liczba;
				count++;
				return wynik;
			} 
		} while (count < n);
		}
		return 0;
		
	}
	
}
