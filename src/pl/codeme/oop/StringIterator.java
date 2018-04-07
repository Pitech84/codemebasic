package pl.codeme.oop;

import java.util.Iterator;

public class StringIterator implements Iterator, Iterable {

	private String str;
	private int pointer = 0; // wskaznik

	public StringIterator(String str) {
		this.str = str;
	}

	@Override
	public boolean hasNext() {
		return pointer < str.length();
	}

	@Override
	public Object next() {
		char ch = str.charAt(pointer);
		pointer++; // lub return str.charAt(pointer++);
		return ch;
	}

	@Override
	public Iterator iterator() {

		return this; // poniewaz StringIterator jest iteratorem, zwraca samego
						// siebie, wiec musimy dać tylko this.
	}
	
	
}
