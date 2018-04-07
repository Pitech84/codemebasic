package pl.codeme.oop;

import java.util.Iterator;

public class MyIterator implements Iterable<Integer>, Iterator<Integer> {
	
	private int n;
	private int count = 1;
	private int wynik;
	
	
	public MyIterator(int n) {
		this.n = n;
	}

	@Override
	public boolean hasNext() {
		if (count > n){
			return false;}
		return true;
	}

	@Override
	public Integer next() {
		if (count == 1){
			wynik = 1;
		}
		else{
			wynik = wynik * count;
		}
			count++;
		return wynik;
	}

	@Override
	public Iterator iterator() {
		return this;
	}
	
	
}
