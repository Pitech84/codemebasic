package pl.codeme.oop;

import java.io.Serializable;

public class Point implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*
	 finalne - nie zmieni, statyczne - otwrzy sie bez wywolania - u gory to mechanizm tworzenia wersji naszych aplikacji
	 */
	
	private char mark; //
	
	// tutaj stefan poszedl na frytki
	public Point(){
		this.mark='.';
	}

	public char getMark() {
		return mark;
	}

	public void setMark(char mark) {
		this.mark = mark;
	}
	
}
