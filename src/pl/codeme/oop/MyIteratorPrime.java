package pl.codeme.oop;

import java.util.Iterator;

public class MyIteratorPrime implements Iterator<Integer>, Iterable<Integer> {

	private int n;
	private int count = 1;
	private int wynik;
	private int startNr= 2;

	public MyIteratorPrime(int n) {
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
		for (int p = startNr; p < Integer.MAX_VALUE; p++) {
			boolean isOK = isOk(p);
			if (isOK) {
				startNr = p+1;
				count++;
				return p;
			}

		}
	return null;
	}
		
	
	public boolean isOk(int d) {
		boolean t = true;
		int i = 2;
		for (;;) {
			if (i >= d) {
				return t;
			}
			if (d % i != 0) {
				i++;
			} else {
				return false;
			}
		}
	}
}
