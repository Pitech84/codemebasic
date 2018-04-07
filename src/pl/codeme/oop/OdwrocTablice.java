package pl.codeme.oop;

import java.util.Iterator;

public class OdwrocTablice implements Iterator<Integer>, Iterable<Integer> {

	private int[] tab;
	private int lenght;
	private int last;
	
	public OdwrocTablice(int[] tab) {
		this.tab = tab;
		this.lenght = tab.length;
	}

	
	
	@Override
	public Iterator<Integer> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		if (last < lenght){
			return true;
		}
		return false;
	}

	@Override
	public Integer next() {
		int pointer = lenght - last;
		last++;
		return tab[pointer - 1];
	}

}
